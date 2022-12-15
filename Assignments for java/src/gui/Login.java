package gui;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {
    
	
	JLabel lb1,lb2;
	JButton btn1,btn2;
	JTextField b1;
	JPasswordField pd;
	GridLayout g;
	Connection con;
	public Login() {
		
		g = new GridLayout(3,2);
		lb1 = new JLabel("username");
		b1 = new JTextField();
		lb2 = new JLabel("EnterPassword");
		pd = new JPasswordField();
		btn1 = new JButton("Enter");
		btn2 = new JButton("cancel");
		
		add(lb1); add(b1); add(lb2); add(pd); add(btn1);
		add(btn2);
		
		setSize(400 , 400);
		setVisible(true);
		setLayout(g);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		new Login();

	}


	public boolean authenticate(){
		
		String username = lb1.getText();
		
		String password = String.valueOf(pd.getPassword());
		
		try {
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/john", username, password);
			
			JOptionPane.showMessageDialog(this, "Login successful");
			
			con.close();
			
		} catch (SQLException e) {
			
			if(e.getErrorCode() == 1045){
				
				JOptionPane.showMessageDialog(this, "Wrong Username or Password", "ERROR", JOptionPane.ERROR_MESSAGE);
				
				lb1.setText("");
				pd.setText("");
				
			}else if(e.getErrorCode() == 1044){
				
				JOptionPane.showMessageDialog(this, "Insufficient Privileges", "ERROR", JOptionPane.ERROR_MESSAGE);
				
				lb1.setText("");
				pd.setText("");
				
			}
			
		}
		
		
		return true;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource() == btn1){
			
			authenticate();			
			
		}

	}
}
