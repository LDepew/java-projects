package Tuner;

//import Tuner.Logic;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GUI {
	
	Logic logicObject = new Logic();
	
	JFrame frame;
	JPanel main;
	JPanel title;
	JPanel space;
	JPanel exit;
	JPanel tooLow;
	JPanel tooHigh;
	JPanel inTune;
	JPanel notes;
	JPanel goPanel;
	JPanel author;
	
	JLabel appTitle;
	JLabel appTooLow;
	JLabel appInTune;
	JLabel appTooHigh;
	JLabel authorLabel;
	
	public GUI() {
		frame = new JFrame();
		frame.setSize(400, 550);
		frame.setResizable(false);
		
		main = new JPanel();
		main.setSize(400, 550);
		
		appTitle = new JLabel("Guitar Tuner");
		appTitle.setFont(new Font("Verdana", 1, 22));
		
		title = new JPanel();
		title.setPreferredSize(new Dimension(200, 60));
		title.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5, false));
		title.add(appTitle);
		
		space = new JPanel();
		space.setPreferredSize(new Dimension(60, 60));
		
		JButton exitButton = new JButton("X");
		exitButton.setFont(new Font("Verdana", 1, 22));
		exitButton.setPreferredSize(new Dimension(60, 60));
		exitButton.setBackground(Color.RED);
		exitButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		
		exit = new JPanel();
		exit.setPreferredSize(new Dimension(60, 60));
		exit.setLayout(new GridLayout(0, 1));
		exit.add(exitButton);
		
		appTooLow = new JLabel("Too Low");
		appTooLow.setFont(new Font("Verdana", 1, 22));
		
		tooLow = new JPanel();
		tooLow.setPreferredSize(new Dimension(120, 120));
		tooLow.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5, false));
		tooLow.add(appTooLow);
		
		appInTune = new JLabel("In Tune");
		appInTune.setFont(new Font("Verdana", 1, 22));
		
		inTune = new JPanel();
		inTune.setPreferredSize(new Dimension(120, 120));
		inTune.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5, false));
		inTune.add(appInTune);
		
		appTooHigh = new JLabel("Too High");
		appTooHigh.setFont(new Font("Verdana", 1, 22));
		
		tooHigh = new JPanel();
		tooHigh.setPreferredSize(new Dimension(120, 120));
		tooHigh.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5, false));
		tooHigh.add(appTooHigh);
		
		JButton eString = new JButton("E");
		eString.setFont(new Font("Verdana", 1, 22));
		eString.setPreferredSize(new Dimension(55, 100));
		eString.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				appInTune.setText("E");	
			}
			
		});
		
		JButton aString = new JButton("A");
		aString.setFont(new Font("Verdana", 1, 22));
		aString.setPreferredSize(new Dimension(55, 100));
		aString.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				appInTune.setText("A");
				
			}
			
		});
		
		JButton dString = new JButton("D");
		dString.setFont(new Font("Verdana", 1, 22));
		dString.setPreferredSize(new Dimension(55, 100));
		dString.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				appInTune.setText("D");
				
			}
			
		});
		
		JButton gString = new JButton("G");
		gString.setFont(new Font("Verdana", 1, 22));
		gString.setPreferredSize(new Dimension(55, 100));
		gString.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				appInTune.setText("G");
				
			}
			
		});
		
		JButton bString = new JButton("B");
		bString.setFont(new Font("Verdana", 1, 22));
		bString.setPreferredSize(new Dimension(55, 100));
		bString.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				appInTune.setText("B");
				
			}
			
		});
		
		JButton e2String = new JButton("E");
		e2String.setFont(new Font("Verdana", 1, 22));
		e2String.setPreferredSize(new Dimension(55, 100));
		e2String.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				appInTune.setText("E");
				
			}
			
		});
		
		notes = new JPanel();
		notes.setPreferredSize(new Dimension(380, 120));
		notes.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5, false));
		notes.add(eString);
		notes.add(aString);
		notes.add(dString);
		notes.add(gString);
		notes.add(bString);
		notes.add(e2String);
		
		JButton goButton = new JButton("GO");
		goButton.setFont(new Font("Verdana", 1, 22));
		goButton.setPreferredSize(new Dimension(100, 100));
		goButton.setBackground(Color.GREEN);
		goButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showInputDialog("Working");
			}
		});
		
		goPanel = new JPanel();
		goPanel.setPreferredSize(new Dimension(380, 120));
		goPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5, false));
		goPanel.add(goButton);
		
		authorLabel = new JLabel("© LD Inc.");
		authorLabel.setFont(new Font("Verdana", 1, 22));
		
		author = new JPanel();
		author.setPreferredSize(new Dimension(240, 60));
		author.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5, false));
		author.add(authorLabel);
	
		frame.add(main);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Guitar Tuner");
		frame.setVisible(true);
		
		main.add(title);
		main.add(space);
		main.add(exit);
		main.add(tooLow);
		main.add(inTune);
		main.add(tooHigh);
		main.add(notes);
		main.add(goPanel);
		main.add(author);
		
	}
	
	public static void main(String[] args) {
		new GUI();
	}
}
