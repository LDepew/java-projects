package App;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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
	JButton equals;
	
	private static double num1Double = 0;
	//private static double num2Double = 0;
	public static char equation;
	
	public CalculatorApp() {
		
		StringBuilder str = new StringBuilder("");
		//StringBuilder str2 =  new StringBuilder("");
		ArrayList<String> number1 = new ArrayList<String>();
		//ArrayList<String> number2 = new ArrayList<String>();
		
		frame = new JFrame();
		frame.setSize(350, 530);
		frame.setResizable(false);
		
		main = new JPanel();
		main.setSize(350, 530);
		
		outputLabel = new JLabel("0");
		outputLabel.setFont(new Font("Verdana", 1, 22));
		
		output = new JPanel();
		output.setPreferredSize(new Dimension(300, 100));
		output.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5, false));
		output.add(outputLabel);
		
		JButton one = new JButton("1");
		one.setFont(new Font("Verdana", 1, 22));
		one.setPreferredSize(new Dimension(65, 65));
		one.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				str.append('1');
				number1.add("1");
				outputLabel.setText(str.toString());
			}
		});
		
		JButton two = new JButton("2");
		two.setFont(new Font("Verdana", 1, 22));
		two.setPreferredSize(new Dimension(65, 65));
		two.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				str.append("2");
				number1.add("2");
				outputLabel.setText(str.toString());
			}
		});
		
		JButton three = new JButton("3");
		three.setFont(new Font("Verdana", 1, 22));
		three.setPreferredSize(new Dimension(65, 65));
		three.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				str.append("3");
				number1.add("3");
				outputLabel.setText(str.toString());
			}
		});
		
		JButton four = new JButton("4");
		four.setFont(new Font("Verdana", 1, 22));
		four.setPreferredSize(new Dimension(65, 65));
		four.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				str.append("4");
				number1.add("4");
				outputLabel.setText(str.toString());
			}
		});
		
		JButton five = new JButton("5");
		five.setFont(new Font("Verdana", 1, 22));
		five.setPreferredSize(new Dimension(65, 65));
		five.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				str.append("5");
				number1.add("5");
				outputLabel.setText(str.toString());
			}
		});
		
		JButton six = new JButton("6");
		six.setFont(new Font("Verdana", 1, 22));
		six.setPreferredSize(new Dimension(65, 65));
		six.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				str.append("6");
				number1.add("6");
				outputLabel.setText(str.toString());
			}
		});
		
		JButton seven = new JButton("7");
		seven.setFont(new Font("Verdana", 1, 22));
		seven.setPreferredSize(new Dimension(65, 65));
		seven.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				str.append("7");
				number1.add("7");
				outputLabel.setText(str.toString());
			}
		});
		
		JButton eight = new JButton("8");
		eight.setFont(new Font("Verdana", 1, 22));
		eight.setPreferredSize(new Dimension(65, 65));
		eight.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				str.append("8");
				number1.add("8");
				outputLabel.setText(str.toString());
			}
		});
		
		JButton nine = new JButton("9");
		nine.setFont(new Font("Verdana", 1, 22));
		nine.setPreferredSize(new Dimension(65, 65));
		nine.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				str.append("9");
				number1.add("9");
				outputLabel.setText(str.toString());
				//outputLabel.setText(number1.toString().replaceAll("[\\[\\]]", "").replaceAll(",", ""));
			}
		});
		
		JButton zero = new JButton("0");
		zero.setFont(new Font("Verdana", 1, 22));
		zero.setPreferredSize(new Dimension(65, 65));
		zero.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				str.append("0");
				number1.add("0");
				outputLabel.setText(str.toString());
			}
		});
		
		JButton divide = new JButton("/");
		divide.setFont(new Font("Verdana", 1, 22));
		divide.setPreferredSize(new Dimension(65, 65));
		divide.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				equation = '/';
				outputLabel.setText("/");
			}
		});
		
		JButton multiply = new JButton("x");
		multiply.setFont(new Font("Verdana", 1, 22));
		multiply.setPreferredSize(new Dimension(65, 65));
		multiply.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				equation = 'x';
				outputLabel.setText("x");
			}
		});
		
		JButton subtract = new JButton("-");
		subtract.setFont(new Font("Verdana", 1, 22));
		subtract.setPreferredSize(new Dimension(65, 65));
		subtract.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				equation = '-';
				outputLabel.setText("-");
			}
		});
		
		JButton add = new JButton("+");
		add.setFont(new Font("Verdana", 1, 22));
		add.setPreferredSize(new Dimension(65, 65));
		add.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				equation = '+';
				outputLabel.setText("+");
			}
		});
		
		equals = new JButton("=");
		equals.setFont(new Font("Verdana", 1, 22));
		equals.setPreferredSize(new Dimension(65, 65));
		equals.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				num1Double = Double.parseDouble(str.toString());
				outputLabel.setText(String.valueOf(num1Double) + " double");
				//outputLabel.setText(number1.toString().replaceAll("[\\[\\]]", "").replaceAll(",", ""));
			}
		});
		
		JButton period = new JButton(".");
		period.setFont(new Font("Verdana", 1, 22));
		period.setPreferredSize(new Dimension(65, 65));
		period.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				str.append(".");
				number1.add(".");
				outputLabel.setText(str.toString());
			}
		});
		
		JButton negative = new JButton("+/-");
		negative.setFont(new Font("Verdana", 1, 15));
		negative.setPreferredSize(new Dimension(65, 65));
		negative.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (number1.get(0) != "-") {
					number1.add(0, "-");
					outputLabel.setText(number1.toString().replaceAll("[\\[\\]]", "").replaceAll(",", ""));
				} else if (number1.get(0) == "-") {
					number1.remove(0);
					outputLabel.setText(number1.toString().replaceAll("[\\[\\]]", "").replaceAll(",", ""));
				}
			}
		});
		
		JButton clear = new JButton("clr");
		clear.setFont(new Font("Verdana", 1, 15));
		clear.setPreferredSize(new Dimension(65, 65));
		clear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				str.setLength(0);
				number1.removeAll(number1);
				outputLabel.setText("0");
			}
		});
		
		JButton delete = new JButton("del");
		delete.setFont(new Font("Verdana", 1, 15));
		delete.setPreferredSize(new Dimension(65, 65));
		delete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (str.length() > 0) {
				str.setLength(str.length() - 1);
				number1.remove(number1.size() - 1);
				outputLabel.setText(str.toString());
				} else if (str.length() == 0) {
					outputLabel.setText("0");
				}
			}
		});
		
		JButton close = new JButton("cls");
		close.setFont(new Font("Verdana", 1, 15));
		close.setPreferredSize(new Dimension(65, 65));
		close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		
		buttons = new JPanel();
		buttons.setPreferredSize(new Dimension(300, 370));
		buttons.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5, false));
		
		buttons.add(close);
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
		frame.setLocationRelativeTo(null);
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
