package app;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class PasswordGeneratorApp {
	
	JFrame frame;
	JPanel main;
	JPanel choices;
	JLabel numChar;
	JTextField numCharText;
	JPanel outputPanel;
	JPanel buttonPanel;
	JLabel output;
	JButton button;
	
	public static String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*";
	public static String COUNT;
	
	public PasswordGeneratorApp() {
		
		StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
		
		frame = new JFrame();
		frame.setSize(500, 500);
		frame.setResizable(false);
		
		main = new JPanel();
		main.setSize(500, 500);
		
		numChar = new JLabel("Number of Characters");
		numChar.setPreferredSize(new Dimension(200, 20));
		
		numCharText = new JTextField();
		numCharText.setPreferredSize(new Dimension(200, 20));
		COUNT += Integer.getInteger(numCharText.getText());
		//numCharText.setValue(COUNT);
		//numCharText.setColumns(10);
		//numCharText.addPropertyChangeListener("value", (PropertyChangeListener) this);
		
		choices = new JPanel();
		choices.setPreferredSize(new Dimension(280, 150));
		choices.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, false));
		choices.add(numChar);
		choices.add(numCharText);
		
		output = new JLabel("Password Here");
		output.setFont(new Font("Verdana", 1, 20));
		output.setBorder(new EmptyBorder(50,50,50,50));
		
		outputPanel = new JPanel();
		outputPanel.setPreferredSize(new Dimension(280, 150));
		outputPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, false));
		outputPanel.add(output);
		
		button = new JButton("Generate Password");
		button.setFont(new Font("Verdana", 1, 15));
		button.setPreferredSize(new Dimension( 200, 80));
		button.addActionListener(new ActionListener() {
			
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
		
		buttonPanel = new JPanel();
		buttonPanel.setPreferredSize(new Dimension(280, 100));
		buttonPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, false));
		buttonPanel.add(button);
		
		main.add(choices);
		main.add(outputPanel);
		main.add(buttonPanel);
		
		frame.add(main);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Password Generator");
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		
		new PasswordGeneratorApp();

	}

}
