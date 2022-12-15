package DeleteRecord;


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

public class DeleteRecord extends JFrame implements ActionListener {
	JLabel lbID;
	JTextField txtID;
	JButton btnDelete;
	
	GridBagLayout gbl;
	GridBagConstraints c;
	
	Connection con;
	Statement st;
	
	public DeleteRecord() {
		   
		super("Delete a record");
		setSize(400, 150);
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
		
		txtID = new JTextField();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 1.0;
		c.gridx = 1;
		c.gridy = 0;
		c.insets = new Insets(10, 10, 10, 10);
		add(txtID, c);
		
		btnDelete = new JButton("Delete");
		btnDelete.addActionListener(this);
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 1;
		c.insets = new Insets(10, 10, 10, 10);
		add(btnDelete, c);
		
		setVisible(true);
		
		
	}

	public static void main(String[] args) {
		new DeleteRecord();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
String id = txtID.getText();
		
		if(e.getSource() == btnDelete) {
			
			try {
				
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "sammy", "7770180464462");
				
				st = con.createStatement();
				
				String deleteStatement = "delete from Employees where Employee_ID = '"+id+"'            ";
				
				int rowsDeleted = st.executeUpdate(deleteStatement);
				
				JOptionPane.showMessageDialog(null, rowsDeleted + " employee deleted successfully");
			
			} catch (SQLException ei) {
				
				ei.printStackTrace();
			}
			
			
			
		}
		
	}

}
