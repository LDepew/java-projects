package ui;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class LunarBankConsoleApp {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		System.out.println("Welcome to the Lunar Bank Console App!");
		
		
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
	    
	    ArrayList<String> userBalance = new ArrayList<String>();
		
		String line2 = null;
	    try {
	        BufferedReader reader2 = new BufferedReader(new FileReader("D:\\balances.txt"));
	        while((line2 = reader2.readLine()) != null){
	        	  userBalance.add(line2);
	        	}
	        reader2.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    
	    for (int i = 0; i < userData.size(); i++) {
	    	System.out.println(userData.get(i));
	    }
	    
	    for (int i = 0; i < userBalance.size(); i++) {
	    	System.out.println(userBalance.get(i));
	    }
		
		Scanner sc =  new Scanner(System.in);
		int command = 0;
		//double balance1 = Double.parseDouble(userBalance.get(0));
		//double balance2 = Double.parseDouble(userBalance.get(1));
		String account = "";
		
			System.out.print("Select account: ");
			account = sc.next();
			
			double balance = 0;
			String balanceStr = "";
			
			for (int i = 0; i < userData.size(); i++) {
				if (account.equals(userData.get(i))) {
				balanceStr = userBalance.get(i);
				balance = Double.parseDouble(balanceStr);
				}
			}
			
		while (!(command == 5)) {
			
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
		
		for (int i = 0; i < userData.size(); i++) {
		if (account.equals(userData.get(i))) {
			System.out.println("bala$%" + balance);
		balanceStr = String.valueOf(balance);
		userBalance.set(i, balanceStr);
		}
	}
		
		System.out.println("idk" + balanceStr);
		
		try (PrintWriter out = new PrintWriter("D:\\users.txt")) {
			for (int i = 0; i < userData.size(); i++) {
				out.println(userData.get(i));
				System.out.println(userData.get(i));
			}
			out.flush();
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try (PrintWriter out2 = new PrintWriter("D:\\balances.txt")) {
			for (int i = 0; i < userBalance.size(); i++) {
				out2.println(userBalance.get(i));
				System.out.println(userBalance.get(i));
			}
			out2.flush();
			out2.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Bye!");
	}

	}
