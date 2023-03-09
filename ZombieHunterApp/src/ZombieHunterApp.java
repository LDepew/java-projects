import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ZombieHunterApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the Zombie Hunter app!!!");
		System.out.println();
		System.out.println("There will be various types of zombies approaching, you have to select the best type of weapon to use against them. \n"
				+ "Each Weapon has a different amount of damage and usability against each zombie. Good luck!");
		System.out.println();
		
		Random rand = new Random();
		int health = 100;
		
		String backpack[] = {"Shotgun", "Crossbow", "Baseball Bat", "Handgun", "Machete", "Assault Rifle", "Sniper Rifle"};
		int backpackDamage[] = {90, 14, 20, 8, 30, 65, 125};
		String zombies[] = {"Walker", "Runner", "Ghoul", "Crawler", "Spitter", "Burster", "Radioactive"};
		int zombieHealth[] = {150, 150, 250, 95, 200, 185, 300};
		int zombieSpeed[] = {5, 18, 8, 2, 12, 3, 10};
		
		System.out.println("Here are your backpack items and the damage amount. ");
		
		for (int i = 0; i < 7; i++) {
			System.out.println(backpack[i] + " - " + backpackDamage[i]);
		}
		
		System.out.println();
		System.out.println("Here are the zombies and their health. ");
		
		for (int i = 0; i < 7; i++) {
			System.out.println(zombies[i] + " - " + zombieHealth[i]);
		}
		int distance = rand.nextInt(250);
		int n = rand.nextInt(7);
		String zType = zombies[n];
		int zHealth = zombieHealth[n];
		int zSpeed = zombieSpeed[n];
		int bDamage;
		
		System.out.println();
		System.out.println(zombies[n] + " is approaching");
		System.out.println(zombies[n] + " has " + zombieHealth[n] + " health and walks at a speed of " + zombieSpeed[n] + ".");
		System.out.println();
		
		System.out.print("Select a weapon from your backpack. - ");
		String backpackSelect = input.nextLine();
		
		for (int i = 0; i < 7; i++) {
             if (backpackSelect.equals(backpack[i])) {
            	 bDamage = backpackDamage[i];
            	 System.out.println("Yes");
            	 while ((distance > 0) || (zHealth > 0)) {
            		 distance = distance - zSpeed;
            		 System.out.println(zombies[n] + " is " + distance + " feet away.");
            		 System.out.println(bDamage + " amount of damage done.");
            		 zHealth = zHealth - bDamage;
            		 System.out.println(zombies[n] + " has " + zHealth + " health left.");
            		 System.out.println();
            		 try {
     					TimeUnit.SECONDS.sleep(2);
     				} catch (InterruptedException e) {
     					// TODO Auto-generated catch block
     					e.printStackTrace();
     				} 
            		 //Math.max(0, distance);
            		 if (distance <= 0) {
            			 System.out.println("The zombie has reached you. You are dead!");
            			 break;
            		 }else if (zHealth <= 0) {
            			 System.out.println("You have killed the zombie!");
            			 break;
            		 }
            	 }
             } else {
            	 System.out.println("Weapon not found in backpack!");
             }
        }
	}

}
