package app;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class PasswordGeneratorApp {
	
	JFrame frame;
	JPanel main;
	JPanel choices;
	JPanel numCharSpace;
	JLabel numChar;
	JTextField numCharText;
	JLabel numPass;
	JTextField numPassText;
	JCheckBox lowercase;
	JCheckBox uppercase;
	JCheckBox symbols;
	JCheckBox numbers;
	JPanel outputPanel;
	JPanel buttonPanel;
	JLabel output;
	JButton generatePass;
	JButton exit;
	
	public static String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static String COUNT;
	
	public PasswordGeneratorApp() {
		
		StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
		
		frame = new JFrame();
		frame.setSize(340, 410);
		frame.setResizable(false);
		
		main = new JPanel();
		main.setSize(340, 410);
		
		numChar = new JLabel("Number of Characters");
		numChar.setPreferredSize(new Dimension(140, 20));
		
		numCharText = new JTextField();
		numCharText.setPreferredSize(new Dimension(40, 20));
		COUNT += Integer.getInteger(numCharText.getText());
		
		numCharSpace = new JPanel();
		numCharSpace.setPreferredSize(new Dimension(220, 40));
		//numCharSpace.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, false));
		numCharSpace.add(numCharText);
		numCharSpace.add(numChar);
		
		symbols = new JCheckBox("Symbols", false);
		symbols.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					CHARS = CHARS + "!@#$%^&*";
				}
				
			}
		});
		
		numbers = new JCheckBox("Numbers", false);
		numbers.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					CHARS =  CHARS + "1234567890";
				}
				
			}
		});
		
		lowercase = new JCheckBox("Lower Case", false);
		lowercase.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					CHARS = CHARS.toLowerCase();
				}
			}
		});
		
		uppercase = new JCheckBox("Upper Case", false);
		uppercase.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					CHARS = CHARS.toUpperCase();
				}
			}
		});
		
		choices = new JPanel();
		choices.setPreferredSize(new Dimension(320, 50));
		//choices.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, false));
		//choices.add(numCharText);
		//choices.add(numChar);
		//choices.add(uppercase);
		choices.add(lowercase);
		choices.add(symbols);
		choices.add(numbers);
		
		output = new JLabel("Password Here");
		output.setFont(new Font("Verdana", 1, 20));
		output.setBorder(new EmptyBorder(50,50,50,50));
		
		outputPanel = new JPanel();
		outputPanel.setPreferredSize(new Dimension(320, 150));
		//outputPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, false));
		outputPanel.add(output);
		
		generatePass = new JButton("Generate Password");
		generatePass.setFont(new Font("Verdana", 1, 15));
		generatePass.setPreferredSize(new Dimension( 200, 40));
		generatePass.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				COUNT = numCharText.getText();
				int foo = Integer.parseInt(COUNT);
				while (salt.length() < foo) { // length of the random string.
		            int index = (int) (rnd.nextFloat() * CHARS.length());
		            salt.append(CHARS.charAt(index));
		        }
		        String saltStr = salt.toString();
				output.setText(saltStr);
			}
		});
		
		exit = new JButton("Exit");
		exit.setFont(new Font("Verdana", 1, 15));
		exit.setPreferredSize(new Dimension(200, 40));
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		
		buttonPanel = new JPanel();
		buttonPanel.setPreferredSize(new Dimension(320, 100));
		//buttonPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, false));
		buttonPanel.add(generatePass);
		buttonPanel.add(exit);
		
		main.add(numCharSpace);
		main.add(choices);
		main.add(outputPanel);
		main.add(buttonPanel);
		
		frame.add(main);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Password Generator");
		frame.setUndecorated(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		
		new PasswordGeneratorApp();

	}

}
