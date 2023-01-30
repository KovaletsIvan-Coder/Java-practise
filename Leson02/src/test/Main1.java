package test;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main1 {

	public static void main(String[] args) {
	JFrame frame = new JFrame("What do you like to ride?");
	JButton button1 = new JButton("Car");
	JButton button2 =new JButton("Bike");
	JPanel panel = new JPanel();
	
	frame.add(panel);
	panel.add(button1);
	panel.add(button2);
	
	frame.setVisible(true);
	frame.setSize(300, 300);
	
	button1.addActionListener(new AbstractAction(){

		@Override
		public void actionPerformed(ActionEvent e) {
			JFrame frame = new JFrame("No,it`s joke)");
			JPanel panel = new JPanel();
			JButton button = new JButton("Acttualy Bike:)"); 
			
			frame.add(panel);
			panel.add(button);
			
			frame.setVisible(true);
			frame.setSize(500, 500);
			
			
		}
		
	});
	button2.addActionListener(new AbstractAction() {
		@Override
		public void actionPerformed(ActionEvent e) {
			JFrame frame = new JFrame();
			JPanel panel = new JPanel();
			JButton button = new JButton("Good Choise)"); 
			
			frame.add(panel);
			panel.add(button);
			
			frame.setVisible(true);
			frame.setSize(500, 500);     
		
	}

   });
 }
}
