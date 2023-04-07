import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("serial")
public class BankingApp implements Serializable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		
		/*File f = new File(filePathString);
		if(f.exists() && !f.isDirectory()) { 
		    // do something
		}*/
		
		//File namesFile = new File("names.tmp");
		//File accountsFile = new File("accounts.tmp");
		//File balancesFile = new File("balances.tmp");
		
		BufferedReader bufReader = new BufferedReader(new FileReader("output.tmp"));
		ArrayList<String> names = new ArrayList<>();
		
		String line = bufReader.readLine();
		while (line != null) {
			names.add(line);
			line = bufReader.readLine();
		}

		BufferedReader bufReader2 = new BufferedReader(new FileReader("output2.tmp"));
		ArrayList<Integer> accounts = new ArrayList<Integer>();
		
		String line2 = bufReader2.readLine();
		int line2b = 0;
		while (line2 != null) {
			line2b = Integer.parseInt(line2);
			accounts.add(line2b);
			line2 = bufReader2.readLine();
		}
		
		BufferedReader bufReader3 = new BufferedReader(new FileReader("output3.tmp"));
		ArrayList<Double> balances = new ArrayList<Double>();
		
		String line3 = bufReader3.readLine();
		double line3b;
		while (line3 != null) {
			line3b = Double.parseDouble(line3);
			balances.add(line3b);
			line3 = bufReader3.readLine();
		}
		
		for (int i = 0; i <  names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		for (int i = 0; i < accounts.size(); i++) {
			System.out.println(accounts.get(i));
		}
		
		for (int i = 0; i < balances.size(); i++) {
			System.out.println(balances.get(i));
		}
		
		
		bufReader.close();
		bufReader2.close();
		bufReader3.close();
		
		System.out.println("Enter account name: ");
		String name = sc.next();
		sc.nextLine();
		double balance = 0.0;
		
		if (!(names.contains(name))) {
			names.add(name);
			System.out.println("Enter beginning balance: ");
			balance = sc.nextDouble();
			balances.add(balance);
			int newAccount = accounts.get(accounts.size() - 1);
			newAccount = newAccount + 1;
			accounts.add(newAccount);
			System.out.println("Account created successfully!");
		} else {
			System.out.println("Account already exists!");
		}
		
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
			System.out.println(accounts.get(i));
			System.out.println(balances.get(i));
		}
		
		if (names.contains(name)) {
			Account bob = null;
			for (int i = 0; i <= names.indexOf(name); i++) {
				bob = new Account(names.get(i), accounts.get(i), balances.get(i));
				System.out.println("a2: " + bob.customerBalance);
			}
			balance = bob.customerBalance;
			System.out.println("Bob cBalance: " + balance);
			bob.showMenu();
			balance = bob.customerBalance;
			System.out.println("a2 after: " + balance);
		}
		
		System.out.println("Balance before setting: " + balance);
		
		int indexname = names.indexOf(name);
		
		if (names.contains(name)) {
			System.out.println("Names contains name");
			for (int i = 0; i <= indexname; i++) {
				System.out.println("Names i: " + names.get(i));
				System.out.println("Balances i: " + balances.get(i));
				if (balances.indexOf(balances.get(i)) == indexname) {
					System.out.println("I matches name!");
					balances.set(i, balance);
				}
				else {
					System.out.println("I does NOT match name!");
				}
			}
		}
		
		for (int i = 0; i < balances.size(); i++) {
			System.out.println(balances.get(i));
		}
				
		FileWriter writer = new FileWriter("output.tmp"); 
		for(String str: names) {
		  writer.write(str + System.lineSeparator());
		}
		writer.close();
		
		FileWriter writer2 = new FileWriter("output2.tmp"); 
		for(Integer inter: accounts) {
		  writer2.write(inter + System.lineSeparator());
		}
		writer2.close();
		
		FileWriter writer3 = new FileWriter("output3.tmp"); 
		for(Double balancer: balances) {
		  writer3.write(balancer + System.lineSeparator());
		}
		writer3.close();
		
		sc.close();
		
	}

}
