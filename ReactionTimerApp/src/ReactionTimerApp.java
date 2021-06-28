import java.util.Scanner;

public class ReactionTimerApp {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("3");
		Thread.sleep(1000);
		System.out.println("2");
		Thread.sleep(1000);
		System.out.println("1");
		Thread.sleep(1000);
		
		System.out.println("Go!!!");
		long startTime = System.currentTimeMillis();
		
		sc.next();
		long stopTime = System.currentTimeMillis();
		
		long reactionTime = stopTime - startTime;
		
		System.out.println(reactionTime + " ms");
		
		

	}

}
