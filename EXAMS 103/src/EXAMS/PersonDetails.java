package EXAMS;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PersonDetails extends JFrame {
	
	JPanel pan; 
	PersonDetails(){
		JPanel pan = new JPanel();
		
	String persons [] = {"personid","firstname","middlename",
		        "lastname","gender","dateofbirth","pin","photo"};
	    
	            setSize(400,400);
	            setVisible(true);
	            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	            
	}

	public static void main(String[] args) {
		new PersonDetails();

	}

}
