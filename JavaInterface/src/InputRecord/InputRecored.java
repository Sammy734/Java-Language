package InputRecord;


import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class InputRecored extends JFrame implements ActionListener {
	JLabel lbID, lbLastName, lbFirstName, lbPhone, lbEmail, lbAddress, lbDOB, lbHireDate;
	JTextField txtEID, txtLastName, txtFirstName, txtPhone, txtEmail, txtAddress, txtDOB, txtHireDate;
	JButton btnSave;
	
	GridBagLayout gbl;
	GridBagConstraints c;
	
	Connection con;
	Statement st;
	public InputRecored()  {
		super("Add New Record");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		
		gbl = new GridBagLayout();
		c = new GridBagConstraints();
		
		setLayout(gbl);
		
		lbID = new JLabel("Employee ID");
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(10, 10, 10, 10);
		add(lbID, c);
		
		txtEID = new JTextField();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 1.0;
		c.gridx = 1;
		c.gridy = 0;
		c.insets = new Insets(10, 10, 10, 10);
		add(txtEID, c);
		
		lbLastName = new JLabel("Last Name");
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 1;
		c.insets = new Insets(10, 10, 10, 10);
		add(lbLastName, c);
		
		txtLastName = new JTextField();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 1;
		c.insets = new Insets(10, 10, 10, 10);
		add(txtLastName, c);		
		
		lbFirstName = new JLabel("First Name");
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 2;
		c.insets = new Insets(10, 10, 10, 10);
		add(lbFirstName, c);
		
		txtFirstName = new JTextField();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 2;
		c.insets = new Insets(10, 10, 10, 10);
		add(txtFirstName, c);	
		
		lbPhone = new JLabel("Phone Number");
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 3;
		c.insets = new Insets(10, 10, 10, 10);
		add(lbPhone, c);
		
		txtPhone = new JTextField();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 3;
		c.insets = new Insets(10, 10, 10, 10);
		add(txtPhone, c);		
		
		lbEmail= new JLabel("Email Address");
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 4;
		c.insets = new Insets(10, 10, 10, 10);
		add(lbEmail, c);
		
		txtEmail = new JTextField();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 4;
		c.insets = new Insets(10, 10, 10, 10);
		add(txtEmail, c);		
		
		lbAddress = new JLabel("Physical Address");
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 5;
		c.insets = new Insets(10, 10, 10, 10);
		add(lbAddress, c);
		
		txtAddress = new JTextField();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 5;
		c.insets = new Insets(10, 10, 10, 10);
		add(txtAddress, c);
		
		
		
		
		lbDOB = new JLabel("Date of Birth");
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 6;
		c.insets = new Insets(10, 10, 10, 10);
		add(lbDOB, c);
		
		txtDOB = new JTextField();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 6;
		c.insets = new Insets(10, 10, 10, 10);
		add(txtDOB, c);
		
		lbHireDate = new JLabel("Employment Date");
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 7;
		c.insets = new Insets(10, 10, 10, 10);
		add(lbHireDate, c);
		
		txtHireDate = new JTextField();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 7;
		c.insets = new Insets(10, 10, 10, 10);
		add(txtHireDate, c);
		
		
		btnSave = new JButton("Save");
		btnSave.addActionListener(this);
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 8;
		c.insets = new Insets(10, 10, 10, 10);
		add(btnSave, c);
		
		
		
		
		
		setVisible(true);
		
	}

	

	

	public static void main(String[] args) {
		new InputRecored();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
Object src = e.getSource();
		
		String id = txtEID.getText();
		String ln = txtLastName.getText();
		String fn = txtFirstName.getText();
		String p = txtPhone.getText();
		String e = txtEmail.getText();
		String a = txtAddress.getText();		
		String dob = txtDOB.getText();
		String hd = txtHireDate.getText();
		
		if(src == btnSave) {
			
			
			try {
				
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "sammy", "7770180464462");
				
				st = con.createStatement();
				
				String insertStatement = "insert into Employees values( '"+id+"', '"+ln+"', '"+fn+"', '"+p+"', '"+e+"', '"+a+"', '"+dob+"', '"+hd+"'     )";				
				
				int rowsAffected = st.executeUpdate(insertStatement);
				
				JOptionPane.showMessageDialog(null, rowsAffected + " Record inserted successfully");
				
				txtEID.setText("");
				txtLastName.setText("");
				txtFirstName.setText("");
				txtPhone.setText("");
				txtEmail.setText("");
				txtAddress.setText("");		
				txtDOB.setText("");
				txtHireDate.setText("");
				
				
			} catch (SQLException se) {
				
				se.printStackTrace();
			}
			
			
		}
		
	}

		
	}


