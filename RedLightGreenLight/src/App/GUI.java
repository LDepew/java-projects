package App;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI {
	
	JFrame frame;
	JPanel panel;
	JPanel panel2;
	JPanel panel3;
	JPanel panel4;
	
	public GUI() {
		
		frame = new JFrame();
		frame.setSize(325, 250);
		frame.setResizable(false);
		
		JButton button = new JButton("Green Light");
		button.setBackground(Color.GREEN);
		button.setPreferredSize(new Dimension(100, 100));
		button.addActionListener(new ActionListener() {

	        @Override
	        public void actionPerformed(ActionEvent arg0) {
	             panel4.setBackground(Color.GREEN);
	        }
	    });
		
		JButton button2 = new JButton("Yellow Light");
		button2.setBackground(Color.YELLOW);
		button2.setPreferredSize(new Dimension(100, 100));
		button2.addActionListener(new ActionListener() {

	        @Override
	        public void actionPerformed(ActionEvent arg0) {
	             panel4.setBackground(Color.YELLOW);
	        }
	    });
		
		JButton button3 = new JButton("Red Light");
		button3.setBackground(Color.RED);
		button3.setMaximumSize(new Dimension(50, 50));
		button3.addActionListener(new ActionListener() {

	        @Override
	        public void actionPerformed(ActionEvent arg0) {
	             panel4.setBackground(Color.RED);
	        }
	    });
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(100, 100));
		panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		
		panel2 = new JPanel();
		panel2.setPreferredSize(new Dimension(100, 100));
		panel2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel2.setLayout(new GridLayout(0, 1));
		panel2.add(button2);
		
		panel3 = new JPanel();
		panel3.setPreferredSize(new Dimension(100, 100));
		panel3.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel3.setLayout(new GridLayout(0, 1));
		panel3.add(button3);
		
		panel4 = new JPanel();
		panel4.setPreferredSize(new Dimension(100, 100));
		panel4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 20));
		panel4.setLayout(new GridLayout(0, 10));
		panel4.setBackground(Color.BLUE);
		
		frame.add(panel4, BorderLayout.PAGE_START);
		frame.add(panel, BorderLayout.LINE_START);
		frame.add(panel2, BorderLayout.CENTER);
		frame.add(panel3, BorderLayout.LINE_END);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Red Light, Green Light");
		frame.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		new GUI();

	}
}
