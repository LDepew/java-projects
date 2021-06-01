import java.util.Scanner;

public class TravelCalculationApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Travel Calculator");
		System.out.println(); //blank line space
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input travel distance: ");
		double distance = sc.nextDouble();
		System.out.print("Input average speed: ");
		double speed = sc.nextDouble();
		System.out.print("Input mpg: ");
		double mpg = sc.nextDouble();
		
		
		System.out.println(); //blank line space
		System.out.println("Travel time is:  " + (distance / speed) + " hours.");
		System.out.println("Gas required is: " + (distance / mpg) + " gallons.");
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Bye");

	}

}
