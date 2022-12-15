package exams.com;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class Login extends JFrame implements KeyListener{
	
	JLabel lbtxtphoto,lbpassphoto;
	JTextField txt;
	JPasswordField pass;
	
	JPanel panmain, panuser,panpass;
	CardLayout cl;
	GridBagLayout gb;
	GridBagConstraints c;
	Connection con;
	

	public Login() {
		super("login on window");
	setSize(Toolkit.getDefaultToolkit().getScreenSize());
	setDefaultCloseOperation(3);
		
		//main panel
		panmain = new JPanel();
		cl = new CardLayout();
		panmain.setLayout(cl);
				
		gb = new GridBagLayout();
		c = new GridBagConstraints();
		
		//  begin pan user
		panuser = new JPanel();
		panuser.setLayout(gb);
		
		lbtxtphoto = new JLabel(new ImageIcon("photos/username 1.jpg"));
		c.anchor = GridBagConstraints.CENTER;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets (10 ,10,10,10);
		panuser.add(lbtxtphoto, c);
		
		txt = new JTextField();
		txt.addKeyListener(this);
		c.anchor = GridBagConstraints.CENTER;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 1;
		c.insets = new Insets (10 ,10,10,10);
		panuser.add(txt, c);
		
		panmain.add(panuser,"USER NAME");
		
		//end of pan user
		
		 //begin of pan pass
		panpass = new JPanel();
		panpass.setLayout(gb);
		
		lbpassphoto = new JLabel(new ImageIcon("photos/password 2.jpg"));
		c.anchor = GridBagConstraints.CENTER;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets (10 ,10,10,10);
		panpass.add(lbpassphoto, c);
		
		pass = new JPasswordField();
		pass.addKeyListener(this);
		c.anchor = GridBagConstraints.CENTER;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets (10 ,10,10,10);
		panpass.add(pass, c);
		
		panmain.add(panpass,"PASSWORD FELD");
		
		//END OF PAN PASS
		
		add(panmain);
		
		setVisible(true);
	}

	

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {
		String u = txt.getText();
		String p = String.valueOf(pass.getPassword());
		
		if(e.getKeyCode() == KeyEvent.VK_SHIFT) {
			
			cl.show(panmain, "PASSWORD FILED");
		}else if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			ConnectionPool m = new ConnectionPool(u ,p,"exams");
			if(m.createDatabaseConnection1()) {
				JOptionPane.showMessageDialog(null, "Welcome");
				dispose();
				new PersonDetails();
			}else {
				JOptionPane.showMessageDialog(null,"worng user name or password please try again");
			}
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {}
	
public static void main (String [] ards) {
		
		new Login();
	}

}
