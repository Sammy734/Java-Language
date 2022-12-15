package exams;
import java.awt.CardLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {
	        JPanel panMain, panUser, panPass;
			JLabel lbname,lbpass;
			JPasswordField pass;
			CardLayout cl;
			JTextField txtname;
			JButton btnsave,btncancel;
		    GridBagLayout gbl;
		    GridBagConstraints c;
		    Connection con;

			public Login() {
				setSize(400,400);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				
				gbl = new GridBagLayout();
				c = new GridBagConstraints();
				
				 panMain = new JPanel();
			        cl = new CardLayout();
			        panMain.setLayout(cl);
			        
			        
			        
			        panUser = new JPanel();        
			        panUser.setLayout(gbl);
				
				lbname = new JLabel("Enter user name");
				c.anchor =  GridBagConstraints.CENTER;
				c.fill = GridBagConstraints.BOTH;
				c.gridx = 0;
				c.gridy = 0;
				c.insets = new Insets(10, 10, 10, 10);
				add(lbname,c);
				
				txtname = new JTextField();
				c.anchor =  GridBagConstraints.CENTER;
				c.fill = GridBagConstraints.BOTH;
				c.gridx = 1;
				c.gridy = 0;
				c.insets = new Insets(10, 10, 10, 10);
				add(txtname , c);
				
				lbpass = new JLabel("Enter password");
				c.anchor =  GridBagConstraints.CENTER;
				c.fill = GridBagConstraints.BOTH;
				c.gridx = 2;
				c.gridy = 0;
				c.insets = new Insets(10, 10, 10, 10);
				add(lbpass ,c);
				
				pass =new JPasswordField();
				c.anchor =  GridBagConstraints.CENTER;
				c.fill = GridBagConstraints.BOTH;
				c.gridx = 3;
				c.gridy = 0;
				c.insets = new Insets(10, 10, 10, 10);
				add(pass , c);
				
				btnsave = new JButton("Login");
				c.anchor =  GridBagConstraints.CENTER;
				c.fill = GridBagConstraints.BOTH;
				c.gridx = 4;
				c.gridy = 0;
				c.insets = new Insets(10, 10, 10, 10);
				add(btnsave,c);
				
				btncancel = new JButton("Cancel");
				btncancel.addActionListener(this);
				c.anchor =  GridBagConstraints.CENTER;
				c.fill = GridBagConstraints.BOTH;
				c.gridx = 4;
				c.gridy = 1;
				c.insets = new Insets(10, 10, 10, 10);
				add(btncancel,c);
				
				add(panMain);
				
				setVisible(true);
				
			}

			

			public static void main(String[] args) {
				new Login();

			}
      

			public boolean authenticate(){
				
				String username = lbname.getText();
				
				String password = String.valueOf(pass.getPassword());
				
				try {
					
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/exams", username, password);
					
					JOptionPane.showMessageDialog(this, "Login successful");
					
					dispose();
					new PersonDetails();
					
				} catch (SQLException e) {
					
					if(e.getErrorCode() == 1045){
						
						JOptionPane.showMessageDialog(this, "error message", "ERROR", JOptionPane.ERROR_MESSAGE);
						
						lbname.setText("");
						pass.setText("");
						
					}
			
				}
				return true;

			}
			
			@Override
			public void actionPerformed(ActionEvent ae) {
				
				if(ae.getSource() == btncancel){
					
					authenticate();			
					
				}
			}		
}

