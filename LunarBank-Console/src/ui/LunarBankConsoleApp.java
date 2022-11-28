package ui;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LunarBankConsoleApp {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		System.out.println("Welcome to the Lunar Bank Console App!");
		
		String[] userData2 = new String[4];
		
		ArrayList<String> userData = new ArrayList<String>();
		
		String line = null;
	    try {
	        BufferedReader reader = new BufferedReader(new FileReader("D:\\users.txt"));
	        while((line = reader.readLine()) != null){
	        	  userData.add(line);
	        	}
	        reader.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    
	    for (int i = 0; i < 4; i++) {
	    	System.out.println(userData.get(i));
	    }
		
		Scanner sc =  new Scanner(System.in);
		int command = 0;
		String user1 = userData.get(0);
		double balance1 = Double.parseDouble(userData.get(1));
	    System.out.println(balance1);
		String user2 = userData.get(2);
		double balance2 = Double.parseDouble(userData.get(3));
		System.out.println(balance2);
		String account = "";
		
			System.out.print("Select account: ");
			account = sc.next();
			
		while (!(command == 5)) {
			
			double balance = 0;
			
			if (account.equals(user1)) {
				balance = balance1;
			}
			else if (account.equals(user2)) {
				balance = balance2;
			}
			else {
				System.out.println("No User Found!");
				break;
			}
			
			System.out.println("MENU:");
			System.out.println("====================");
			System.out.println("1:\tCheck Balance");
			System.out.println("2:\tDeposit Money");
			System.out.println("3:\tWithdraw Money");
			System.out.println("4:\tLoan Calculator");
			System.out.println("5:\tLogout");
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
