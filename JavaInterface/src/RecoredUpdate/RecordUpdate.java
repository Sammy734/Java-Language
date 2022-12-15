package RecoredUpdate;

import java.awt.event.*;
import java.sql.*;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RecordUpdate extends JFrame implements ActionListener {
	JLabel lblEID, lblLastName, lblFirstName, lblTitle, lblTitle_of_courtesy, lblHire_Date, lblAdress,lblCounty,lblPostal_Code,lblCountry,lblContact,lblPhoto,lblNote;
	JTextField txtEID, txtLastName, txtFirstName, txtTitle, txtTitle_of_courtesy, txtHire_Date, txtAdress, txtCounty,txtPostal_Code,txtCountry,txtContact,txtPhoto,txtNote;
	JButton btnSearch, btnUpdate;
	
	GridBagLayout gbl;
	GridBagConstraints c;
	
	JPanel panTop, panCenter;
	Connection con;
	Statement st;
	ResultSet rs;

	public RecordUpdate() {
		super("Update a record");
		setSize(400, 680);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		
		gbl = new GridBagLayout();
		c = new GridBagConstraints();
		
		panTop = new JPanel();		
		panTop.setLayout(gbl);
		///////pan top begins here//////
		lblEID = new JLabel("Employee ID");
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(10, 10, 10, 10);
		panTop.add(lblEID, c);
		
		txtEID = new JTextField();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 1.0;
		c.gridx = 1;
		c.gridy = 0;
		c.insets = new Insets(10, 10, 10, 10);
		panTop.add(txtEID, c);
		
		btnSearch = new JButton("Search");
		btnSearch.addActionListener(this);
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 1;
		c.insets = new Insets(10, 10, 10, 10);
		panTop.add(btnSearch, c);
	
		/////pan to ends here ////////
				
/////////////////////// panCenter begins here ////////////////////////////////////		
		
		panCenter= new JPanel();
		panCenter.setLayout(gbl);
		
		lblFirstName = new JLabel("First Name");
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 1;
		c.insets = new Insets(10, 10, 10, 10);
		panCenter.add(lblFirstName, c);
		
		txtFirstName = new JTextField();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 1;
		c.insets = new Insets(10, 10, 10, 10);
		panCenter.add(txtFirstName, c);		
		
		lblLastName = new JLabel("Last Name");
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 2;
		c.insets = new Insets(10, 10, 10, 10);
		panCenter.add(lblLastName, c);
		
		txtLastName = new JTextField();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 2;
		c.insets = new Insets(10, 10, 10, 10);
		panCenter.add(txtLastName, c);	
		
		lblTitle = new JLabel("Title");
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 3;
		c.insets = new Insets(10, 10, 10, 10);
		panCenter.add(lblTitle, c);
		
		txtTitle = new JTextField();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 3;
		c.insets = new Insets(10, 10, 10, 10);
		panCenter.add(txtTitle, c);		
		
		lblTitle_of_courtesy= new JLabel("Title of Courtesy");
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 4;
		c.insets = new Insets(10, 10, 10, 10);
		panCenter.add(lblTitle_of_courtesy, c);
		
		txtTitle_of_courtesy = new JTextField();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 4;
		c.insets = new Insets(10, 10, 10, 10);
		panCenter.add(txtTitle_of_courtesy, c);		
		
		lblHire_Date = new JLabel("Hire Date");
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 5;
		c.insets = new Insets(10, 10, 10, 10);
		panCenter.add(lblHire_Date, c);
		
		txtHire_Date = new JTextField();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 5;
		c.insets = new Insets(10, 10, 10, 10);
		panCenter.add(txtHire_Date, c);		
		
		lblAdress = new JLabel("Adress");
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 6;
		c.insets = new Insets(10, 10, 10, 10);
		panCenter.add(lblAdress, c);
		
		txtAdress = new JTextField();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 6;
		c.insets = new Insets(10, 10, 10, 10);
		panCenter.add(txtAdress, c);
		
		lblCounty= new JLabel("County");
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 7;
		c.insets = new Insets(10, 10, 10, 10);
		panCenter.add(lblCounty, c);
		
		txtCounty = new JTextField();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 7;
		c.insets = new Insets(10, 10, 10, 10);
		panCenter.add(txtCounty, c);
		
		lblPostal_Code= new JLabel("Postal Code");
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 8;
		c.insets = new Insets(10, 10, 10, 10);
		panCenter.add(lblPostal_Code, c);
		
		txtPostal_Code = new JTextField();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 8;
		c.insets = new Insets(10, 10, 10, 10);
		panCenter.add(txtPostal_Code, c);
		
		lblCountry= new JLabel("Country");
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 9;
		c.insets = new Insets(10, 10, 10, 10);
		panCenter.add(lblCountry, c);
		
		txtCountry = new JTextField();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 9;
		c.insets = new Insets(10, 10, 10, 10);
		panCenter.add(txtCountry, c);
		
		lblContact= new JLabel("Contact");
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 10;
		c.insets = new Insets(10, 10, 10, 10);
		panCenter.add(lblContact, c);
		
		txtContact = new JTextField();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 10;
		c.insets = new Insets(10, 10, 10, 10);
		panCenter.add(txtContact, c);
		
		lblPhoto= new JLabel("Photo");
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 11;
		c.insets = new Insets(10, 10, 10, 10);
		panCenter.add(lblPhoto, c);
		
		txtPhoto = new JTextField();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 11;
		c.insets = new Insets(10, 10, 10, 10);
		panCenter.add(txtPhoto, c);
		
		lblNote= new JLabel("Note");
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 12;
		c.insets = new Insets(10, 10, 10, 10);
		panCenter.add(lblNote, c);
		
		txtNote = new JTextField();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 12;
		c.insets = new Insets(10, 10, 10, 10);
		panCenter.add(txtNote, c);
		
		
		btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(this);
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 13;
		c.insets = new Insets(10, 10, 10, 10);
		panCenter.add(btnUpdate, c);
///////////////////////// panCenter ends here ////////////////////////////////////////////////		
		
		
		add(panTop, BorderLayout.NORTH);
		add(panCenter, BorderLayout.CENTER);
		
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new RecordUpdate();

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		String id = txtEID.getText();
		
		
		
		String ln = txtLastName.getText();
		String fn = txtFirstName.getText();
		String t = txtTitle.getText();
		String tc = txtTitle_of_courtesy.getText();
		String hd = txtHire_Date.getText();		
		String a = txtAdress.getText();
		String co = txtCounty.getText();
		String pc = txtPostal_Code.getText();
		String cr = txtCountry.getText();
		String c = txtContact.getText();
		String ph = txtPhoto.getText();
		String N = txtNote.getText();
		
		if(ae.getSource() == btnSearch) {
			
			try {
				
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "sammy", "7770180464462");
				
				st = con.createStatement();
				
				String q = "select * from Employees where Employee_ID = '"+id+"'       ";
				
				rs = st.executeQuery(q);
				
				while(rs.next()) {
					
					txtLastName.setText(rs.getString(2));
					txtFirstName.setText(rs.getString(3));
					txtTitle.setText(rs.getString(4));
					txtTitle_of_courtesy.setText(rs.getString(5));
					txtHire_Date.setText(rs.getString(6));		
					txtAdress.setText(rs.getString(7));
					txtCounty.setText(rs.getString(8));
					txtPostal_Code.setText(rs.getString(9));
					txtCountry.setText(rs.getString(10));
					txtContact.setText(rs.getString(11));
					txtPhoto.setText(rs.getString(12));
					txtNote.setText(rs.getString(13));
					
					
				}
			
			} catch (SQLException se) {
				// TODO Auto-generated catch block
				se.printStackTrace();
			}
		
	}else {
		
		try {
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Products_DB", "root", "");
			
			st = con.createStatement();
			
			String updateStatement = "update Employees set LastName = '"+ln+"', FirstName = '"+fn+"', Phone = '"+p+"', Email = '"+e+"', Address = '"+a+"', Date_of_Birth = '"+dob+"', HireDate = '"+hd+"'  where Employee_ID = '"+id+"'                                    ";
			
			int rowsAffected = st.executeUpdate(updateStatement);
			
			JOptionPane.showMessageDialog(null, rowsAffected + " Record updated successfully");
			
			
		} catch (SQLException se) {
			// TODO Auto-generated catch block
			se.printStackTrace();
		}
		
	}

	}
	
}

