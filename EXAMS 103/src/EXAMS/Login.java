package EXAMS;

import java.awt.Font;
import java.sql.Connection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Login extends JFrame {
	
	JPanel pan;
	JButton password;
	JTextField tf1,tf2;
	JTextArea username;

	Login(){
		pan =new JPanel();
	    JTextField tf = new JTextField();
	     Font t = new Font("Times New Roman",Font.PLAIN,30);
		 username = new JTextArea ("username");
		 username.setFont(t);
		 tf1 = new JTextField();
		 tf1.setBounds(301,480 , 300, 100);
		JButton password = new JButton("password");
		
		String users [] = {"username","password"};
		
		
		pan.add(username);
		pan.add(tf1);
		pan.add(password);
		
		
		setSize(500,250); 
		setVisible(true);
		setTitle("Login");
		add(pan);
		
	}
	
	
	public static void main(String[] args) {
		new Login();
	}

}
