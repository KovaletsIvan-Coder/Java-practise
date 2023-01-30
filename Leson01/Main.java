package test;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
	
	JFrame frame = new JFrame("");
	JButton button = new JButton("Of course");
	JPanel panel = new JPanel();
	
	frame.setVisible(true);
	frame.setSize(300, 500);
	
	button.addActionListener(new AbstractAction() {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("But Why?");
			
		}

	
		
	});
	
	frame.add(panel);
	panel.add(button);
	
	
	
	

	}

} 
