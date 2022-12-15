package gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutDemo {
	JFrame jf;
	JButton btn;
	GridLayoutDemo(){
		jf = new JFrame();
		btn = new JButton("login");
		btn.setBounds(2, 4, 6, 10);
		jf.add(btn);
		jf.setLayout(new GridLayout(1,1));
		jf.setSize(500,100);
		jf.setVisible(true);
	
	}
	
	public static void main(String[] args) {
		new GridLayoutDemo();

	}

}
