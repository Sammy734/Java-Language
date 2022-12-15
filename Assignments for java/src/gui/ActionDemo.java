package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class ActionDemo implements ActionListener  {
	          JFrame f;
	 ActionDemo(){
		 f = new JFrame();
		 
		 
		 f.setSize(500,200);
		 f.setVisible(true);
	 }
	public static void main(String[] args) {
		new  ActionDemo();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

}
