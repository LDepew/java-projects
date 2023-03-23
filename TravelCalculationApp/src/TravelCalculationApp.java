import java.text.NumberFormat;
import java.util.Scanner;

public class TravelCalculationApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Travel Calculator");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		
		System.out.print("Input travel distance: ");
		double distance = sc.nextDouble();
		System.out.print("Input average speed: ");
		double speed = sc.nextDouble();
		System.out.print("Input mpg: ");
		double mpg = sc.nextDouble();
		System.out.print("Enter price of gas. ");
		double gas = sc.nextDouble();
		
		
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMinimumFractionDigits(2);
		nf.setMaximumFractionDigits(2);
		
		
		System.out.println();
		System.out.println("Travel time is:  " + nf.format((distance / speed)) + " hours.");
		System.out.println("Gas required is: " + nf.format((distance / mpg)) + " gallons.");
		System.out.println("Estimate cost of fuel is: $" + nf.format((mpg * gas)));
		System.out.println();
		
		System.out.println("Continue? (y/n):");
		choice = sc.next();
		}
		
		System.out.println("Bye");
		sc.close();

	}

}
