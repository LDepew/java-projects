import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankingApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> names = new ArrayList<>();
		names.add("System");
		List<Integer> accounts = new ArrayList<>();
		accounts.add(1000);
		List<Double> balances = new ArrayList<>();
		balances.add(0000.00);
		
		System.out.println("Enter account name: ");
		String name = sc.next();
		sc.nextLine();
		System.out.println("Enter beginning balance: ");
		double balance = sc.nextDouble();
		
		if (!(names.contains(name))) {
			names.add(name);
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
			for (int i = 0; i < names.size(); i++) {
			bob = new Account(names.get(i), accounts.get(i), balances.get(i));
			}
			bob.showMenu();
			}
		
		sc.close();
	}

}
