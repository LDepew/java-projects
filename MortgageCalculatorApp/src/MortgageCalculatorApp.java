import java.util.Scanner;

public class MortgageCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Mortgage Calculator!");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter cost of home: ");
		double homeCost = sc.nextDouble();
		
		System.out.print("Enter number of years for loan: ");
		double loanYears = sc.nextDouble();
		
		System.out.print("Enter mortgage rate: ");
		double mortgageRate = sc.nextDouble();
		System.out.println();
		
		double yearlyCost = homeCost / loanYears;
		System.out.println("Yearly cost = " + yearlyCost);
		
		double monthlyCost = yearlyCost / 12;
		System.out.println("Monthly cost = " + monthlyCost);
		
		double mortgageCost = yearlyCost / mortgageRate;
		System.out.println("Mortage Cost = " + mortgageCost);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Bye!");

	}

}
