import java.util.Scanner;

public class CryptoMiningSimulatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Crypto Mining Simulator!");
		System.out.println(); //blank line space
		
		Scanner sc = new Scanner(System.in);
		
		String GPU[] = {"RTX 3080", "Radeon RX 6900"};
		String CPU[] = {"Ryzen 5950x", "Intel 11900k"};
		
		System.out.println("Available GPU's:");
		System.out.println(GPU[0] + " & " + GPU[1]);
		System.out.println(); //blank line space
		
		System.out.println("Available CPU's:");
		System.out.println(CPU[0] + " & " + CPU[1]);
		System.out.println(); //blank line space
		
		System.out.print("Please pick your GPU:");
		
		sc.close();
		
		
		
		

	}

}
