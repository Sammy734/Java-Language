package gui;

import java.awt.Frame;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameDemo extends Frame implements WindowListener {
	         FrameDemo(){
	        	 
	        	addWindowListener(this);
	        	setSize(300,1000);
	        	setVisible(true);
	         }

	public static void main(String [] args) {
		new FrameDemo();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("windowOpened");
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing");
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("windowClosed");
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated");
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("windowDeactivated");
		
	}
}
