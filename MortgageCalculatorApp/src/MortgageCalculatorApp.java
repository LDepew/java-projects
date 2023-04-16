import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Mortgage Calculator!");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")) {
		
		System.out.print("Enter cost of home: ");
		double homeCost = sc.nextDouble();
		
		System.out.print("Enter number of years for loan: ");
		double loanYears = sc.nextDouble();
		
		System.out.print("Enter mortgage rate: ");
		double mortgageRate = sc.nextDouble();
		System.out.println();
		
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);
		
		double yearlyCost = homeCost / loanYears;
		System.out.println("Yearly cost = " + nf.format(yearlyCost));
		
		double monthlyCost = yearlyCost / 12;
		System.out.println("Monthly cost = " + nf.format(monthlyCost));
		
		double mortgageCost = yearlyCost / mortgageRate;
		System.out.println("Mortage Cost = " + nf.format(mortgageCost));
		System.out.println();
		
		double totalCost = homeCost + mortgageCost;
		System.out.println("Total Cost = " + nf.format(totalCost));
		
		System.out.println("Continue (y/n)? ");
		choice = sc.next();
		}
		
		sc.close();
		System.out.println("Bye!");

	}

}
