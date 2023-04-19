package App;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalculatorApp {
	
	JFrame frame;
	JPanel main;
	JPanel output;
	JLabel outputLabel;
	JPanel buttons;
	
	public CalculatorApp() {
		frame = new JFrame();
		frame.setSize(350, 530);
		frame.setResizable(false);
		
		main = new JPanel();
		main.setSize(350, 530);
		
		outputLabel = new JLabel("output here");
		outputLabel.setFont(new Font("Verdana", 1, 22));
		
		output = new JPanel();
		output.setPreferredSize(new Dimension(300, 100));
		output.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5, false));
		output.add(outputLabel);
		
		JButton one = new JButton("1");
		one.setFont(new Font("Verdana", 1, 22));
		one.setPreferredSize(new Dimension(65, 65));
		
		JButton two = new JButton("2");
		two.setFont(new Font("Verdana", 1, 22));
		two.setPreferredSize(new Dimension(65, 65));
		
		JButton three = new JButton("3");
		three.setFont(new Font("Verdana", 1, 22));
		three.setPreferredSize(new Dimension(65, 65));
		
		JButton four = new JButton("4");
		four.setFont(new Font("Verdana", 1, 22));
		four.setPreferredSize(new Dimension(65, 65));
		
		JButton five = new JButton("5");
		five.setFont(new Font("Verdana", 1, 22));
		five.setPreferredSize(new Dimension(65, 65));
		
		JButton six = new JButton("6");
		six.setFont(new Font("Verdana", 1, 22));
		six.setPreferredSize(new Dimension(65, 65));
		
		JButton seven = new JButton("7");
		seven.setFont(new Font("Verdana", 1, 22));
		seven.setPreferredSize(new Dimension(65, 65));
		
		JButton eight = new JButton("8");
		eight.setFont(new Font("Verdana", 1, 22));
		eight.setPreferredSize(new Dimension(65, 65));
		
		JButton nine = new JButton("9");
		nine.setFont(new Font("Verdana", 1, 22));
		nine.setPreferredSize(new Dimension(65, 65));
		
		JButton zero = new JButton("0");
		zero.setFont(new Font("Verdana", 1, 22));
		zero.setPreferredSize(new Dimension(65, 65));
		
		JButton divide = new JButton("/");
		divide.setFont(new Font("Verdana", 1, 22));
		divide.setPreferredSize(new Dimension(65, 65));
		
		JButton multiply = new JButton("x");
		multiply.setFont(new Font("Verdana", 1, 22));
		multiply.setPreferredSize(new Dimension(65, 65));
		
		JButton subtract = new JButton("-");
		subtract.setFont(new Font("Verdana", 1, 22));
		subtract.setPreferredSize(new Dimension(65, 65));
		
		JButton add = new JButton("+");
		add.setFont(new Font("Verdana", 1, 22));
		add.setPreferredSize(new Dimension(65, 65));
		
		JButton equals = new JButton("=");
		equals.setFont(new Font("Verdana", 1, 22));
		equals.setPreferredSize(new Dimension(65, 65));
		
		JButton period = new JButton(".");
		period.setFont(new Font("Verdana", 1, 22));
		period.setPreferredSize(new Dimension(65, 65));
		
		JButton negative = new JButton("+/-");
		negative.setFont(new Font("Verdana", 1, 15));
		negative.setPreferredSize(new Dimension(65, 65));
		
		JButton clear = new JButton("clr");
		clear.setFont(new Font("Verdana", 1, 15));
		clear.setPreferredSize(new Dimension(65, 65));
		
		JButton delete = new JButton("del");
		delete.setFont(new Font("Verdana", 1, 15));
		delete.setPreferredSize(new Dimension(65, 65));
		
		JButton space = new JButton();
		space.setPreferredSize(new Dimension(65, 65));
		
		buttons = new JPanel();
		buttons.setPreferredSize(new Dimension(300, 370));
		buttons.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5, false));
		
		buttons.add(space);
		buttons.add(clear);
		buttons.add(delete);
		buttons.add(divide);
		buttons.add(seven);
		buttons.add(eight);
		buttons.add(nine);
		buttons.add(multiply);
		buttons.add(four);
		buttons.add(five);
		buttons.add(six);
		buttons.add(subtract);
		buttons.add(one);
		buttons.add(two);
		buttons.add(three);
		buttons.add(add);
		buttons.add(negative);
		buttons.add(zero);
		buttons.add(period);
		buttons.add(equals);
		
		main.add(output);
		main.add(buttons);
		
		frame.add(main);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Calculator App");
		frame.setVisible(true);
	}
	
	public static void main(String args[]) {
		
		new CalculatorApp();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Calculator App!");
		
		String choice = "y";
				
		while (choice.equalsIgnoreCase("y")) {
		System.out.print("Enter first number: ");
		double a = sc.nextDouble();
		System.out.print("Enter math type: ");
		String x = sc.next();
		sc.nextLine();
		System.out.print("Enter second number: ");
		double b = sc.nextDouble();
		
		double solution;
		
		if (x.equals("+")) {
			solution = (a + b);
			System.out.println(solution);
		} else if (x.equals("-")) {
			solution = (a - b);
			System.out.println(solution);
		} else if (x.equals("x")) {
			solution = (a * b);
			System.out.println(solution);
		} else if (x.equals("/")) {
			solution = (a / b);
			System.out.println(solution);
		}
		System.out.print("Continue? (y/n): ");
		choice = sc.next();
		}
		sc.close();
		System.out.println("Goodbye!");
	}
}
