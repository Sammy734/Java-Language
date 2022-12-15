package exams.com;

import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PersonDetails extends JFrame implements KeyListener  {

	
		JLabel lbID,lbFirstName,lbLastName,lbGender,lbDOB;
	    JTextField txtID;
	    Connection cn;
	    Statement st;
	    ResultSet rs;
		
	    
		public PersonDetails() {
			super("person infromation/Details - search");
			
	        setBounds(100, 100, 400, 400);
	        
	        setLayout(new GridLayout(4, 2, 10, 10));
	        
	        lbID = new JLabel("Enter person ID for search");        
	 
	        lbFirstName = new JLabel();
	        
	        lbLastName = new JLabel();
	        
	        lbGender = new JLabel();
	        
	        lbDOB = new JLabel();
	        
	        
	        
	        txtID = new JTextField();
	        txtID.addKeyListener(this);
	        
	     
	        add(lbID);
	        add(txtID);
	        add(lbFirstName); 
	        add(lbGender);  
	        add(lbDOB); 
	        
	        setVisible(true);
		}

		@Override
		public void keyPressed(KeyEvent arg0) {}

		@Override
		public void keyReleased(KeyEvent ke) {
			
			String identifier = txtID.getText();
			
			if(ke.getKeyCode() == KeyEvent.VK_ENTER){
				
				try {
					
					st = cn.createStatement();
					
					String q = "select * from exams where personID = '"+identifier+"'   ";
					
					rs = st.executeQuery(q);
					
					while(rs.next()){
						
						 lbFirstName.setText(rs.getString(2));
						 lbLastName.setText(rs.getString(3));
						 lbGender.setText(rs.getString(4));
						 lbDOB.setText(rs.getString(5));
						
					}
					
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
				
				
				
			}
			
		}

		@Override
		public void keyTyped(KeyEvent arg0) {}
	    
	      public static void main(String [] args) {
	    	  new PersonDetails();
	      }
	
	}


