import java.util.Scanner;

@SuppressWarnings("serial")
public class Account extends BankingApp {
	double balance;
	double previousTransaction;
	String customerName;
	Integer customerID;
	double customerBalance;
	
	Account(String cname, Integer integer, double cbal) {
		customerName = cname;
		customerID = integer;
		customerBalance = cbal;
	}
	
	void deposit(double amount) {
		if (amount != 0.0) {
			customerBalance = customerBalance + amount;
			previousTransaction = amount;
		}
	}
		
		void withdraw(double amount) {
			if (amount != 0.0) {
				customerBalance = customerBalance - amount;
				previousTransaction = -amount;
			}
		}
		
		void getPreviousTransaction() {
			if (previousTransaction > 0) {
				System.out.println("Deposited: " + previousTransaction);
			} else if (previousTransaction < 0) {
				System.out.println("Withdrawn: " + Math.abs(previousTransaction));
			} else {
				System.out.println("No transaction occured");
			}
		}
		
		void calculateInterest(int years) {
			double interestRate = .0185;
			double newBalance = (customerBalance * interestRate * years) + customerBalance;
			System.out.println("The current interest rate is " + (100 * interestRate) + "%");
			System.out.println("After " + years + " years, your balance will be: " + newBalance);
		}
		
		void showMenu() {
			char option = '\0';
			Scanner scanner = new Scanner(System.in);
			System.out.println("Welcome " + customerName + "!");
			System.out.println("Your ID is " + customerID);
			System.out.println(); //blank line space
			System.out.println("What would you like to do?");
			System.out.println(); //blank line space
			System.out.println("A. Check your balance");
			System.out.println("B. Make a deposit");
			System.out.println("C. Make a withdrawal");
			System.out.println("D. View previous transaction");
			System.out.println("E. Calculate interest");
			System.out.println("F. Remove Account");
			System.out.println("G. Exit");
			
			
			do {
				System.out.println();
				System.out.println("Enter an option: ");
				char option1 = scanner.next().charAt(0);
				option = Character.toUpperCase(option1);
				System.out.println();
				
				switch(option) {
				case 'A':
					System.out.println("============================");
					System.out.println("Balance = $" + customerBalance);
					System.out.println("============================");
					System.out.println();
					break;
					
				case 'B':
					System.out.println("Enter an amount to deposit: ");
					double amount = scanner.nextDouble();
					deposit(amount);
					System.out.println();
					break;
					
				case 'C':
					System.out.println("Enter an amount to withdrawal: ");
					double amount2 = scanner.nextDouble();
					withdraw(amount2);
					System.out.println();
					break;
					
				case 'D':
					System.out.println("=============================");
					getPreviousTransaction();
					System.out.println("=============================");
					System.out.println();
					break;
					
				case 'E':
					System.out.println("Enter how many years of accrued interest: ");
					int years = scanner.nextInt();
					calculateInterest(years);
					break;
					
				case 'F':
					
					//BankingApp b = new BankingApp();
					//b.Fprint();
					for (int i = 0; i < BankingApp.names.size(); i++) {
						String namesCopy = BankingApp.names.get(i);
						if (customerName.equals(namesCopy)){
							BankingApp.names.remove(i);
							BankingApp.accounts.remove(i);
							BankingApp.balances.remove(i);
						}
					}
					System.out.println("Account Removed");
					System.out.println("=============================");
					break;
					
				case 'G':
					System.out.println("=============================");
					break;
					
				default:
					System.out.println("Error: invalid option. Please enter A, B, C, D, E, F or access services.");
					break;
				}
			} while(option != 'G' && option != 'F');
			scanner.close();
			System.out.println("Thank you for banking with us!");
		}
}