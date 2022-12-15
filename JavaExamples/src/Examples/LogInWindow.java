package Examples;


import java.awt.GridLayout;
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

public class LogInWindow extends JFrame implements ActionListener {
	JLabel lbus,lbps;
	JTextField fld;
	JPasswordField psd;
	JButton btnsave,btncancel;
	GridLayout gl;
    Connection con;
    
	public LogInWindow() {
		super("login window");
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		gl = new GridLayout(3,2,10,10);
		setLayout(gl);
		
		lbus = new JLabel("UserName");
		
		fld = new JTextField();
		
		lbps = new JLabel("Enter Password");
		
		psd = new JPasswordField();
		
		btnsave = new JButton("Save");
		btnsave.addActionListener(this);
		
		btncancel = new JButton("cancel");
		btncancel.addActionListener(this);
		
		add(lbus);                 add(fld);
		add(lbps);                 add(psd);
		add(btnsave);              add(btncancel);
		
		setVisible(true);
	}

	public void authenticate() {
        String username = fld.getText();
		
		String Enterpassword = String.valueOf(psd.getPassword());
		
		try {
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/skyweb", "Sammy", "7770180464462");
		     JOptionPane.showMessageDialog(this , "login correct");
		     con.close();
		     
		} catch (SQLException e) {
			
if(e.getErrorCode() == 1045){
				
				JOptionPane.showMessageDialog(this, "Wrong Username or Password", "ERROR", JOptionPane.ERROR_MESSAGE);
				
				fld.setText("");
				psd.setText("");
				
			}else if(e.getErrorCode() == 1044){
				
				JOptionPane.showMessageDialog(this, "Insufficient Privileges", "ERROR", JOptionPane.ERROR_MESSAGE);
				
				fld.setText("");
				psd.setText("");
				
			}
			
		}
		
		
		return true;
	}
		}
	}

	public static void main(String[] args) {
		new LogInWindow();

	}




	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

}
