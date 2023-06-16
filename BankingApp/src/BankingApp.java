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

	public static ArrayList<String> names = new ArrayList<String>();
	public static ArrayList<Integer> accounts = new ArrayList<Integer>();
	public static ArrayList<Double> balances = new ArrayList<Double>();
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		
		File f = new File("output.tmp");
		//ArrayList<String> names = new ArrayList<String>();
		
		if (f.exists() && !f.isDirectory()) {
			BufferedReader bufReader = new BufferedReader(new FileReader("output.tmp"));
			//System.out.println("File is here");
		String line = bufReader.readLine();
		while (line != null) {
			names.add(line);
			line = bufReader.readLine();
		}
		bufReader.close();
		} else {
			//System.out.println("File is not here");
			names.add("System");
		}

		File f2 = new File("output2.tmp");
		//ArrayList<Integer> accounts = new ArrayList<Integer>();
		
		if (f2.exists() && !f2.isDirectory()) {
			BufferedReader bufReader2 = new BufferedReader(new FileReader("output2.tmp"));
			//System.out.println("File2 is here");
		String line2 = bufReader2.readLine();
		int line2b = 0;
		while (line2 != null) {
			line2b = Integer.parseInt(line2);
			accounts.add(line2b);
			line2 = bufReader2.readLine();
		}
		bufReader2.close();
		} else {
			//System.out.println("File2 is not here");
			accounts.add(1000);
		}
		
		File f3 = new File("output3.tmp");
		
		//ArrayList<Double> balances = new ArrayList<Double>();
		
		if (f3.exists() && !f3.isDirectory()) {
			BufferedReader bufReader3 = new BufferedReader(new FileReader("output3.tmp"));
			//System.out.println("File3 is here");
		String line3 = bufReader3.readLine();
		double line3b;
		while (line3 != null) {
			line3b = Double.parseDouble(line3);
			balances.add(line3b);
			line3 = bufReader3.readLine();
		}
		bufReader3.close();
		} else {
			//System.out.println("File3 is not here");
			balances.add(0000.00);
		}
		
		for (int i = 0; i <  names.size(); i++) {
			//System.out.println(names.get(i));
		}
		
		for (int i = 0; i < accounts.size(); i++) {
			//System.out.println(accounts.get(i));
		}
		
		for (int i = 0; i < balances.size(); i++) {
			//System.out.println(balances.get(i));
		}
		
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
			//System.out.println(names.get(i));
			//System.out.println(accounts.get(i));
			//System.out.println(balances.get(i));
		}
			
		if (names.contains(name)) {
			Account bob = null;
			for (int i = 0; i <= names.indexOf(name); i++) {
				bob = new Account(names.get(i), accounts.get(i), balances.get(i));
				//System.out.println("a2: " + bob.customerBalance);
			}
			balance = bob.customerBalance;
			//System.out.println("Bob cBalance: " + balance);
			bob.showMenu();
			balance = bob.customerBalance;
			//System.out.println("a2 after: " + balance);
		}
		
		//System.out.println("Balance before setting: " + balance);
		
		int indexname = names.indexOf(name);
		
		if (names.contains(name)) {
			//System.out.println("Names contains name");
			for (int i = 0; i <= indexname; i++) {
				//System.out.println("Names i: " + names.get(i));
				//System.out.println("Balances i: " + balances.get(i));
				if (balances.indexOf(balances.get(i)) == indexname) {
					//System.out.println("I matches name!");
					balances.set(i, balance);
				}
				else {
					//System.out.println("I does NOT match name!");
				}
			}
		}
		
		for (int i = 0; i < balances.size(); i++) {
			//System.out.println(balances.get(i));
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

	public void Fprint() {
		System.out.println("F in progress system!");
	}
}