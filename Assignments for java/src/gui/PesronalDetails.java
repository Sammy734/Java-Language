package gui;


import java.awt.GridLayout;
import java.sql.Connection;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PesronalDetails extends JFrame{

	
		JLabel lblID, lblPName, lblPDesc,lblPQuantity;
	    JTextField txtID, txtPName, txtPDesc, txtPQuantity;
	   
	    
		public PesronalDetails() {
			
	          
	       
	        
	        lblID = new JLabel("Product ID");        
	        
	        lblPName = new JLabel("Product NName");
	        
	        lblPDesc = new JLabel("Product Description");
	        
	        lblPQuantity = new JLabel("Product Quantity");
	        
	        txtID = new JTextField();
	    
	        
	        txtPName = new JTextField();
	        
	        txtPDesc = new JTextField();
	        
	        txtPQuantity = new JTextField();
	        
	        
	        add(lblID); add(txtID);
	        add(lblPName); add(txtPName);
	        add(lblPDesc);  add(txtPDesc);
	        add(lblPQuantity); add(txtPQuantity);
	        
	        setLayout(new GridLayout(4, 2, 10, 10));
	        
	        setVisible(true);
	        
	        
	        public static void main(String[] args) {
	    		new PesronalDetails();

	    	}

	    
		

	}



	
}
