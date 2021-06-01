package employeeIdApp;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter; 
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
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
		
		try {
			String qrCodeData = "blank for now";
			String filePath = "D:\\QRCODE\\employee.png";
			String charset = "UTF-8";
			Map < EncodeHintType, ErrorCorrectionLevel > hintMap = new HashMap < EncodeHintType, ErrorCorrectionLevel > ();
			BitMatrix matrix = new MultiFormatWriter().encode(
			new String(qrCodeDate.getBytes(charset), charset),
			BarcodeFormat.QR_Code, 200, 200, hintMap);
			MatrixToImageWriter.writeToFile(matrix, filePath.substring(filePath.lastIndexOf('.') + 1), new File(filePath));
			System.out.println(("QR Code image created successfully!"));
		} catch (Exception e) {
			System.err.println(e);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Bye");

	}

}
