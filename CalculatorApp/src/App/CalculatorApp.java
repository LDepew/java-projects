package App;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Calculator App!");
		
		String choice = "y";
				
		while (choice.equalsIgnoreCase("y")) {
		System.out.print("Enter first number: ");
		double a = sc.nextDouble();
		System.out.println("Enter math type: ");
		String x = sc.next();
		sc.nextLine();
		System.out.println("Enter second number: ");
		double b = sc.nextDouble();
		
		if (x.equals("+")) {
			System.out.println(a + b);
		} else if (x.equals("-")) {
			System.out.println(a - b);
		} else if (x.equals("x")) {
			System.out.println(a - b);
		} else if (x.equals("/")) {
			System.out.println(a / b);
		}
		System.out.print("Continue? (y/n): ");
		choice = sc.next();
		}
		sc.close();
		System.out.println("Goodbye!");
	}
}
