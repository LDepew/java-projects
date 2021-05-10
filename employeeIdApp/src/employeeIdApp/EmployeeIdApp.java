package employeeIdApp;

import java.util.Scanner;

public class EmployeeIdApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the Employee ID Generator");
		System.out.println(); //blank line space
		System.out.print("Enter first name: ");
		String fName = sc.next();
		System.out.print("Enter last name: ");
		String lName = sc.next();
		System.out.print("Enter birthdate: ");
		String bDate = sc.next();
		System.out.print("Enter department: ");
		String department = sc.next();
		System.out.print("Enter employee ID: ");
		String employeeID = sc.next();
		
		System.out.println(); //blank line space
		System.out.println("Name: " + fName + " " + lName);
		System.out.println("Deparment: " + department);
		System.out.println("Employee ID: " + employeeID);
		System.out.println(); //blank line space
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Bye");

	}

}
