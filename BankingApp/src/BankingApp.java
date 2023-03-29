import java.util.Scanner;

public class BankingApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account name: ");
		String name = sc.next();
		
		if (name.equals("bob")) {
		Account bob = new Account("Bob Bank", "00001", 99999.0);
		bob.showMenu();
		}
		else if (name.equals("jane")) {
		Account jane = new Account("Jane Bank", "00002", 125.0);
		jane.showMenu();
		}
		sc.close();
		
		/*String[] names = {"Bob bank", "Jane bank"};
		int[] accounts = {00001, 00002};
		double[] balances = {0.0, 0.0};*/
	}

}
