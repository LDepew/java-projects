import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Agreement {

	public static void main(String[] args) {
		
		String name = "Agreement";
		System.out.println(name);
		
		String signedBy = "SignedBy";
		System.out.println(signedBy);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));

	}

}
