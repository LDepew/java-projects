package app;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LanguageTranslatorApp {

	JFrame frame;
	JPanel main;
	JLabel inputNameText;
	JPanel inputNamePanel;
	JPanel inputPanel;
	JTextField inputText;
	JPanel translateButtonPanel;
	JButton translateButton;
	JPanel outputPanel;
	JLabel outputText;
	
	public static String translateText = "";
	public static String translatedText = "Bob";
	
	public LanguageTranslatorApp() {
		
		frame = new JFrame();
		frame.setSize(800, 800);
		frame.setResizable(true);
		
		main = new JPanel();
		main.setSize(800, 800);
		
		inputNameText = new JLabel("Please input the sentence(s) you would like translated");
		inputNameText.setFont(new Font("Verdana", 1, 20));
		
		inputNamePanel = new JPanel();
		inputNamePanel.setPreferredSize(new Dimension(750, 50));
		inputNamePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, false));
		inputNamePanel.add(inputNameText);
		
		inputText = new JTextField();
		inputText.setPreferredSize(new Dimension(740, 190));
		inputText.setFont(new Font("Verdana", 1, 20));
		inputText.setHorizontalAlignment(JTextField.CENTER);
		
		inputPanel = new JPanel();
		inputPanel.setPreferredSize(new Dimension(750, 200));
		inputPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, false));
		inputPanel.add(inputText);
		
		translateButton = new JButton("Translate");
		translateButton.setFont(new Font("Verdana", 1, 20));
		translateButton.setPreferredSize(new Dimension(400, 65));
		translateButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				translateText = inputText.getText();
				translatedText = translateText;
				 outputText.setText(translatedText);
				 
				 try {
			         String search = "?q="+translateText.toString().trim();
			         search = search.replaceAll(" ","+");
			         String url = "https://www.google.com/"+search;
			         java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
			       }
			       catch (java.io.IOException e1) {
			           System.out.println(e1.getMessage());
			       }
			}
		});
		
		translateButtonPanel = new JPanel();
		translateButtonPanel.setPreferredSize(new Dimension(750, 80));
		translateButtonPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, false));
		translateButtonPanel.add(translateButton);
		
		outputText = new JLabel();
		outputText.setText(translatedText);
		outputText.setFont(new Font("Verdana", 1, 20));
		
		outputPanel = new JPanel();
		outputPanel.setPreferredSize(new Dimension(750, 200));
		outputPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, false));
		outputPanel.add(outputText);
		
		main.add(inputNamePanel);
		main.add(inputPanel);
		main.add(translateButtonPanel);
		main.add(outputPanel);
		
		frame.add(main);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Language Translator");
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public static void main (String[] args) {
		
		new LanguageTranslatorApp();
	}
}
