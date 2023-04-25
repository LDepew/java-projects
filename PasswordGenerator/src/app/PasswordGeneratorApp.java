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

public class PasswordGeneratorApp {
	
	JFrame frame;
	JPanel main;
	JPanel outputPanel;
	JPanel buttonPanel;
	JLabel output;
	JButton button;
	
	public static String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*";
	
	public PasswordGeneratorApp() {
		
		StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
		
		frame = new JFrame();
		frame.setSize(300, 300);
		frame.setResizable(false);
		
		main = new JPanel();
		main.setSize(300, 300);
		
		output = new JLabel("Password Here");
		output.setFont(new Font("Verdana", 1, 20));
		
		outputPanel = new JPanel();
		outputPanel.setPreferredSize(new Dimension(280, 150));
		outputPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5, false));
		outputPanel.add(output);
		
		button = new JButton("Generate Password");
		button.setFont(new Font("Verdana", 1, 15));
		button.setPreferredSize(new Dimension( 200, 80));
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				while (salt.length() < 18) { // length of the random string.
		            int index = (int) (rnd.nextFloat() * CHARS.length());
		            salt.append(CHARS.charAt(index));
		        }
		        String saltStr = salt.toString();
				output.setText(saltStr);
			}
		});
		
		buttonPanel = new JPanel();
		buttonPanel.setPreferredSize(new Dimension(280, 100));
		buttonPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5, false));
		buttonPanel.add(button);
		
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
