package recordserch;



import java.sql.*;

import java.awt.event.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RecordSearch extends JFrame implements ActionListener {
	
	JLabel lblEID, lblLastName, lblFirstName, lblTitle, lblTitle_of_courtesy, lblHire_Date, lblAdress,lblCounty,lblPostal_Code,lblCountry,lblContact,lblPhoto,lblNote;
	JTextField txtEID, txtLastName, txtFirstName, txtTitle, txtTitle_of_courtesy, txtHire_Date, txtAdress, txtCounty,txtPostal_Code,txtCountry,txtContact,txtPhoto,txtNote;
	JButton btnSearch;
	
	GridBagLayout gbl;
	GridBagConstraints c;
	
	Connection con;
	Statement st;
	ResultSet rs;

	public RecordSearch() {
		super("Search for a record");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		
		gbl = new GridBagLayout();
		c = new GridBagConstraints();
		
		setLayout(gbl);
		
		lblEID = new JLabel("Employee ID");
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(10, 10, 10, 10);
		add(lblEID, c);
		
		txtEID = new JTextField();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 1.0;
		c.gridx = 1;
		c.gridy = 0;
		c.insets = new Insets(10, 10, 10, 10);
		add(txtEID, c);
		
		lblFirstName = new JLabel("First Name");
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 1;
		c.insets = new Insets(10, 10, 10, 10);
		add(lblFirstName, c);
		
		txtFirstName = new JTextField();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 1;
		c.insets = new Insets(10, 10, 10, 10);
		add(txtFirstName, c);		
		
		lblLastName = new JLabel("Last Name");
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 2;
		c.insets = new Insets(10, 10, 10, 10);
		add(lblLastName, c);
		
		txtLastName = new JTextField();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 2;
		c.insets = new Insets(10, 10, 10, 10);
		add(txtLastName, c);	
		
		lblTitle = new JLabel("Title");
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 3;
		c.insets = new Insets(10, 10, 10, 10);
		add(lblTitle, c);
		
		txtTitle = new JTextField();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 3;
		c.insets = new Insets(10, 10, 10, 10);
		add(txtTitle, c);		
		
		lblTitle_of_courtesy= new JLabel("Title of Courtesy");
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 4;
		c.insets = new Insets(10, 10, 10, 10);
		add(lblTitle_of_courtesy, c);
		
		txtTitle_of_courtesy = new JTextField();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 4;
		c.insets = new Insets(10, 10, 10, 10);
		add(txtTitle_of_courtesy, c);		
		
		lblHire_Date = new JLabel("Date of Emplyoment");
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 5;
		c.insets = new Insets(10, 10, 10, 10);
		add(lblHire_Date, c);
		
		txtHire_Date = new JTextField();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 5;
		c.insets = new Insets(10, 10, 10, 10);
		add(txtHire_Date, c);
		
			
		lblAdress = new JLabel("Physical Adress");
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 6;
		c.insets = new Insets(10, 10, 10, 10);
		add(lblAdress, c);
		
		txtAdress = new JTextField();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 6;
		c.insets = new Insets(10, 10, 10, 10);
		add(txtAdress, c);
		
		lblCounty = new JLabel("county");
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 7;
		c.insets = new Insets(10, 10, 10, 10);
		add(lblCounty, c);
		
		txtCounty = new JTextField();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 7;
		c.insets = new Insets(10, 10, 10, 10);
		add(txtCounty, c);
		
		lblPostal_Code = new JLabel("Postal Code");
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 8;
		c.insets = new Insets(10, 10, 10, 10);
		add(lblPostal_Code, c);
		
		txtPostal_Code = new JTextField();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 8;
		c.insets = new Insets(10, 10, 10, 10);
		add(txtPostal_Code, c);
		
		lblCountry = new JLabel("country");
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 9;
		c.insets = new Insets(10, 10, 10, 10);
		add(lblCountry, c);
		
		txtCountry = new JTextField();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 9;
		c.insets = new Insets(10, 10, 10, 10);
		add(txtCountry, c);
		
		lblContact = new JLabel("Contact");
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 10;
		c.insets = new Insets(10, 10, 10, 10);
		add(lblContact, c);
		
		txtContact = new JTextField();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 10;
		c.insets = new Insets(10, 10, 10, 10);
		add(txtContact, c);
		
		lblPhoto = new JLabel("Photo");
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 11;
		c.insets = new Insets(10, 10, 10, 10);
		add(lblPhoto, c);
		
		txtCounty = new JTextField();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 7;
		c.insets = new Insets(10, 10, 10, 10);
		add(txtCounty, c);
		
		lblCounty = new JLabel("county");
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 7;
		c.insets = new Insets(10, 10, 10, 10);
		add(lblCounty, c);
		
		txtCounty = new JTextField();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 7;
		c.insets = new Insets(10, 10, 10, 10);
		add(txtCounty, c);
		
		
		btnSearch = new JButton("Search");
		btnSearch.addActionListener(this);
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 8;
		c.insets = new Insets(10, 10, 10, 10);
		add(btnSearch, c);
		
		
		
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new RecordSearch();

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		String id = txtEID.getText();
		
		if(ae.getSource() == btnSearch) {
			
			try {
				
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Products_DB", "root", "");
				
				st = con.createStatement();
				
				String q = "select * from Employees where Employee_ID = '"+id+"'       ";
				
				rs = st.executeQuery(q);
				
				while(rs.next()) {
					
					txtFirstName.setText(rs.getString(2));
					txtLastName.setText(rs.getString(3));
					txtTitle.setText(rs.getString(4));
					txtTitle_of_courtesy.setText(rs.getString(5));
					txtHire_Date.setText(rs.getString(6));		
					txtAdress.setText(rs.getString(7));
					txtCounty.setText(rs.getString(8));
					
				}
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
		
		
	}

}

