import java.util.Random;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class DungeonTwo {


    public static void SecondDungeon(Scanner s, Random r, Player player) throws FileNotFoundException, InterruptedException {
        Random coin = new Random();

        // Start of dungeon
        System.out.println("You enter a large cavern filled with bright bioluminesent moss that lights the surroundings. " +
        "\nTowards the backend of the cavern you spot a large stone statue with an unidentifiable liquid gushing from its mouth into a basin just below it. " +
        "\nAs you approch the the basin, you have the urge to make a wish. You ready a coin and think of a wish.");
        System.out.println("You flip the coin into the basin...");
       General.Continue(s);
        // Random object chooses the monster the player will fight
        int coinToss = coin.nextInt(2);
        

        if (coinToss == 0) { // Battle 1
            System.out.println("After a few moments you notice that the liqud has ceased its flow " +
            "\nand the liquid has been draining from the basin to first reveal the coin you had just tossed, but began to reveal an amalgam of flesh and bones. " +
            "\nYou take a step back in disgust and as you do the flesh and bones start to meld into one hideous amalgamation.");
            System.out.println("I don't think this is what you wished for.");
           General.Continue(s);
            Enemy amalgam = new Enemy("Amalgam", 55);
            General.battle(player, amalgam, r, s);
        }else { // Battle 2
            System.out.println("As your coin lands into the basin you notice the statue starts twitching. The twitch gradually becomes more agressive until " + 
            "\nthe statue gradually begins to stand up, detaching itself from the basin. The golem begins to lumber towards you readying an attack.");
            Enemy golem = new Enemy("Golem", 70);
             General.battle(player, golem, r, s);
        }
        System.out.println("Huzzah! you have vanquished the enemy! Though you feel a bit roughed up and in need of healing, your gaze takes you to the basin and the flowing liquid." +
        "\nYou are urged to drink the liquid against your better judgment.");
        System.out.println("You take a sip...");
        System.out.println("You feel reinvigorated! You heal 25HP!");
        player.health += 25; //sets hp back to what I assume is max
        System.out.println("Your current HP is " + player.health + ".");


        // Progress to Dragon fight
        System.out.println("You find youself surrounded by the souls of the monsters you've slain pushing you down yet another hallway");
        System.out.println("The souls have led you to a small room complete with a desk and a large stone structure");
        System.out.println("A large glowing portal illuminates from the stone structure!");
        System.out.println("You walk into the portal and find yourself surrounded by gold, and look up to hear the roar of the dragon.");
    
    }
}