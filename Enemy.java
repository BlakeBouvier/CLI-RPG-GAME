// This file stores information for enemy objects
import java.util.Random;


public class Enemy{
    
    //
    public static String name;
    public static int health;

    // effects variables
    public static int burn = 0;
    public static int poison = 0;
    


/*----------------------------------------------------General Enemy Data-----------------------------------------------------------*/
    

    // This function determines which attack function will be used by
    // comparing the name variable to different possinilitues
    public static void attack(Random rand, Player player){
	if (name.equals("spider")) spiderAttack(rand, player);	
    }



    // Although there are still effects for the enemy, I don't believe that they will become large enough to give it its own section.
    // Therefore, the dealEffects function is int the general section of this file.
    public static void dealEffects(){
	int damage;
	if (burn > 0){
	    damage = 3;
	    burn --;
	    health -= damage;
	    System.out.println("You have been burnt for " + damage + " damage.");
	}
	if (poison > 0){
	    damage = poison * 5;
	    poison --;
	    health -= damage;
	    System.out.println("The poison in your body dealt " + damage + " damage to you.");
	}
    }





/*---------------------------------------This section contains information for the spider type-------------------------------------*/
    public static void setSpider(){
	health = 50;
	name = "spider";
    }

    public static void spiderAttack(Random rand, Player player){
	int decider = rand.nextInt(100) + 1;
	if (decider <=10) spiderCacoon(player, rand);
	else if (decider <= 55) spiderBite(player);
	else spikeShot(player);
    }

    public static void spiderBite(Player player){
	int damage = 15;
	player.health -= damage;
	System.out.println("The spider bit you and dealt " + damage + " damage. \nYou are now poisoned.");
	Player.poison += 3;
    }
    
    public static void spikeShot(Player player){
	int damage = 10;
	player.health -= damage;
	Player.poison += 5;
	System.out.println("The spider spat a spine and dealt " + damage + " damage. You are now poisoned");



    }

    public static void spiderCacoon(Player player, Random rand){
	String message = "You are still trapped in the cocoon";

	System.out.println("The spider has wrapped you in a silk cocoon. You struggle to break free as the spider keeps attacking you.");


	spiderBite(player);

	for (int i = 0; i < rand.nextInt(5); i++){	    
	    System.out.print(message);
	    spiderBite(player);
	    //possibly add a sleep command here
	}

    }


    // This section contains information for a Skeleton enemy
    

    



}
