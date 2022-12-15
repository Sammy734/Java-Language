package gui;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CardOne extends JFrame{
	
	CardOne(){       
			CardLayout card = new CardLayout();
			
			JPanel pan = new JPanel();
			
	
			      JPanel pan1 = new JPanel();
			      pan1.setBackground(Color.BLUE);
			      JPanel pan2 = new JPanel();
			      pan2.setBackground(Color.RED);
			      JPanel pan3 = new JPanel();
			      pan3.setBackground(Color.GREEN);
			      JPanel pan4 = new JPanel();
			      pan4.setBackground(Color.PINK);
			      JPanel pan5 = new JPanel();
			      pan5.setBackground(Color.YELLOW);

			      pan.add(pan1);
			      pan.add(pan2);
			      pan.add(pan3);
			      pan.add(pan4);
			      pan.add(pan5);
			    
			      JButton btn1 = new JButton("Next");
			      JButton btn2 = new JButton("Previous");
			      JButton btn3 = new JButton("First");
			      JButton btn4 = new JButton("Last");
			      JButton btn5 = new JButton("show");
			      
			    
			      btn1.addActionListener(e-> card.next(pan));
			      btn2.addActionListener(e-> card.previous(pan));
			      btn3.addActionListener(e-> card.last(pan));
			      btn4.addActionListener(e-> card.first(pan));
			      btn5.addActionListener(e-> card.first(pan));
			      
			   
			      pan1.add(btn1);
			      pan2.add(btn2);
			      pan3.add(btn3);
			      pan4.add(btn4);
			      pan5.add(btn5);
			      
			      
			     add(pan);
			     setSize(300,400);
			     setVisible(true);
		}
		 
		 public static void main(String[] args) {
			 new  CardOne(); 
		 }
	}



