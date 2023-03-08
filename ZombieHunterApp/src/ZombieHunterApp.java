import java.util.Random;

public class ZombieHunterApp {

	public static void main(String[] args) {
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

		int n = rand.nextInt(3);
		
		System.out.println(backpack[n]);
	}

}
