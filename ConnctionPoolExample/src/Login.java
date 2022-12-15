import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame{
	JLabel lbname,lbpass;
	JPasswordField pass;
	JTextField txtname;
    GridBagLayout gbl;
    GridBagConstraints c;

	public Login() {
		setSize(400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		gbl = new GridBagLayout();
		c = new GridBagConstraints();
		
		lbname = new JLabel("USER NAME");
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
		
		lbpass = new JLabel("PASSWORD");
		c.anchor =  GridBagConstraints.CENTER;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 1;
		c.insets = new Insets(10, 10, 10, 10);
		add(lbpass ,c);
		
		pass =new JPasswordField();
		c.anchor =  GridBagConstraints.CENTER;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 2;
		c.insets = new Insets(10, 10, 10, 10);
		add(pass , c);
		setVisible(true);
		
	}

	

	public static void main(String[] args) {
		new Login();

	}

}
