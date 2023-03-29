import java.util.Scanner;

public class BankingApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account name: ");
		String name = sc.next();
		
		if (name.equals("bob")) {
		Account bob = new Account("Bob Bank", "00001");
		bob.showMenu();
		}
		else if (name.equals("jane")) {
		Account jane = new Account("Jane Bank", "00002");
		jane.showMenu();
		}
		sc.close();
	}

}
