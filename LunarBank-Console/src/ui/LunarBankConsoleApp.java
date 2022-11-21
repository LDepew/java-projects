package ui;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class LunarBankConsoleApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Lunar Bank Console App!");
		
		Scanner sc =  new Scanner(System.in);
		int command = 0;
		double balance = 1000.00;
		
		while (!(command == 6)) {
			System.out.println("MENU:");
			System.out.println("====================");
			System.out.println("1:\tCheck Balance");
			System.out.println("2:\tDeposit Money");
			System.out.println("3:\tWithdraw Money");
			System.out.println("4:\tLoan Calculator");
			System.out.println("5:\tLogout");
			System.out.println("6:\tExit");
			System.out.println();
			
			System.out.print("Select an option: ");
			command = sc.nextInt();
			
			switch(command) {
			case 1:
				System.out.println("Amount is " + balance);
				System.out.println();
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2:
				System.out.print("Enter amount of deposit: ");
				double deposit = sc.nextDouble();
				System.out.println(deposit + " has been added to your account");
				balance = balance + deposit;
				System.out.println(balance + " is your new balance");
				System.out.println();
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 3:
				System.out.print("Enter amount to withdraw: ");
				double withdraw = sc.nextDouble();
				System.out.println(withdraw + " has been removed from your account");
				balance = balance - withdraw;
				System.out.println(balance + " is your new balance");
				System.out.println();
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 4:
				System.out.println("Loan Calculator in progress");
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
			}
			
		}
		
		sc.close();
		System.out.println("Bye!");

	}

}
