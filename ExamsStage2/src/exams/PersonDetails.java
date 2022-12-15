package exams;




import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PersonDetails extends JFrame implements KeyListener {
	
	GridBagLayout gbl;
	GridBagConstraints c;
	JLabel lblid, lblfirstname, lblmiddle, lbllastname, lblgender, lbldateofbirth,
	lblpin,lblphoto;
	JTextField txtid,txtfirstname, txtmiddle, txtlastname, txtgender, txtdateofbirth,
	txtpin,txtphoto;
	JButton btncancel;
	Connection con;
	Statement st;
	ResultSet rs;
	public PersonDetails(Connection co) {
		super("Personal Information/Details - Search ");
		this.con = co;
		
		setBounds(10, 10, 500, 600);
		
		gbl = new GridBagLayout();
		setLayout(gbl);
		c = new GridBagConstraints();
		
			

		lblid = new JLabel("Enter person ID for Search");
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(10, 10, 10, 10);
		add(lblid, c);
		
		txtid = new JTextField();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 0;
		c.insets = new Insets(10, 10, 10, 10);
		add(txtid, c);
		
		lblfirstname = new JLabel();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 2;
		c.gridy = 0;
		c.insets = new Insets(10, 10, 10, 10);
		add(lblfirstname, c);
		
		txtfirstname = new JTextField();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 2;
		c.gridy = 1;
		c.insets = new Insets(10, 10, 10, 10);
		add(txtfirstname, c);
		
		
		lblmiddle = new JLabel();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 3;
		c.gridy = 0;
		c.insets = new Insets(10, 10, 10, 10);
		add(lblmiddle, c);
		
		txtmiddle = new JTextField();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 3;
		c.gridy = 2;
		c.insets = new Insets(10, 10, 10, 10);
		add(txtmiddle, c);
		
		lbllastname = new JLabel();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 4;
		c.gridy = 0;
		c.insets = new Insets(10, 10, 10, 10);
		add(lbllastname, c);
		
		txtlastname = new JTextField();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 4;
		c.gridy = 3;
		c.insets = new Insets(10, 10, 10, 10);
		add(txtlastname, c);
		
		
		lblgender= new JLabel();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 5;
		c.gridy = 0;
		c.insets = new Insets(10, 10, 10, 10);
		add(lblgender, c);
		
		txtgender = new JTextField();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 5;
		c.gridy = 4;
		c.insets = new Insets(10, 10, 10, 10);
		add(txtgender, c);
		
		lbldateofbirth = new JLabel();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 6;
		c.gridy = 0;
		c.insets = new Insets(10, 10, 10, 10);
		add(lbldateofbirth, c);
		
		txtdateofbirth = new JTextField();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 6;
		c.gridy = 5;
		c.insets = new Insets(10, 10, 10, 10);
		add(txtdateofbirth, c);
		
		lblpin = new JLabel();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 7;
		c.gridy = 0;
		c.insets = new Insets(10, 10, 10, 10);
		add(lblpin, c);
		
		txtpin = new JTextField();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 7;
		c.gridy = 6;
		c.insets = new Insets(10, 10, 10, 10);
		add(txtpin, c);
		
		lblphoto = new JLabel();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 8;
		c.gridy = 0;
		c.insets = new Insets(10, 10, 10, 10);
		add(lblphoto, c);
		
		txtphoto = new JTextField();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 8;
		c.gridy = 7;
		c.insets = new Insets(10, 10, 10, 10);
		add(txtphoto, c);
		
		btncancel = new JButton("Cancel");
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 9;
		c.gridy = 1;
		c.insets = new Insets(10, 10, 10, 10);
		add(btncancel, c);
		
		
		setVisible(true);
		
	}


	@Override
	public void keyPressed(KeyEvent arg0) {}

	@Override
	public void keyReleased(KeyEvent ke) {
		
		String identifier = txtid.getText();
		
		if(ke.getKeyCode() == KeyEvent.VK_ENTER){
			
			try {
				
				st = con.createStatement();
				
				String q = "select * from products where product_ID = '"+identifier+"'   ";
				
				rs = st.executeQuery(q);
				
				while(rs.next()){
					
					txtfirstname.setText(rs.getString(2));
					txtmiddle.setText(rs.getString(3));
					txtlastname.setText(rs.getString(4));
					txtgender.setText(rs.getString(5));
					txtdateofbirth.setText(rs.getString(6));
					txtpin.setText(rs.getString(7));
					txtphoto.setText(rs.getString(8));
					
					
				}
				
			} catch (SQLException e) {
				
				e.printStackTrace();
}



	@Override
	public void keyTyped(KeyEvent e) {}
		
		
		}
		
	
		