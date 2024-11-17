import java.util.Scanner;
import java.util.HashMap;
import java.util.Random;

public class GameStart {
    public static void main(String[] args) {

        //instantiates a new Scanner object
        Scanner console = new Scanner(System.in);
        //instantiates a new Random object
        Random r = new Random(); 
        
	Player player = new Player(console);
        // Health that has not been moved out yet.
        int dragonHealth = 100;
        int skeletonHealth = 30;
	
        // Damage   
        int wandDamage = 25; //add effects?
        int dragonDamage = 15;
        int skeletonDamage = 15;



        System.out.println("First message");

	// gathers information on which path the player will take	
        int dungeonChoice = getDungeonChoice(console);

        //we can check health at the end of every turn
        while(playerHealth>0) { 
            if  (dungeonChoice == 1) {
                //call dungeon 1
                //call dungeon 2
            } else if(dungeonChoice == 2) {
                //call dungeon 3
                DungeonFour.theFourthDungeon(console, r); //calls the fourth dungeon method and passes through scanner and random objects
	    }
	    break;
        }

        if (playerHealth>0) {
            System.out.println("You win!");
        } 
        else {
            System.out.println("You died!");
        }
	
    }

    public static int getDungeonChoice(Scanner console){
	int dungeonChoice = 0;
	String prompt = "Do you want to go down path 1 or 2? ";
	String error = "Please answer with \"1\" or \"2\": ";


        System.out.print(prompt);
	//ensure that user enters integer first time
	while (!console.hasNextInt()){
	    console.nextLine();
	    System.out.print(error);
	}
	dungeonChoice = console.nextInt();
	//verifies input after verifying that value is an integer
	while(dungeonChoice != 1 && dungeonChoice != 2) {
	    System.out.print(error);
	    //ensure that user enters integer first time
	    if (!console.hasNextInt()){
		console.nextLine();
	    } else dungeonChoice = console.nextInt();
	    
	}
	return dungeonChoice;
    }
}
