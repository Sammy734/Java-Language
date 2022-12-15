package gui;

import java.awt.CardLayout;
import java.awt.Frame;

import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class TreeNodeDemo {
	Frame f;
	JPanel pan;
	
	TreeNodeDemo(){
		f = new Frame();
		JTree jt = new JTree();
		pan = new JPanel();
		
	    DefaultMutableTreeNode color=new DefaultMutableTreeNode("color");
	    
	    DefaultMutableTreeNode Red = new DefaultMutableTreeNode("Red");
	    jt.addTreeSelectionListener(null);
	  
	    
	    DefaultMutableTreeNode Blue = new DefaultMutableTreeNode("Blue");
	    jt.addTreeSelectionListener(null);
	   
	    
	    DefaultMutableTreeNode Green = new DefaultMutableTreeNode("Green");
	    jt.addTreeSelectionListener(null);
	    jt.setLayout(new CardLayout());
	    
	    color.add(Green);
	    color.add(Blue);
	    color.add(Red);
	    
	    f.add(jt);
	    f.setSize(600,200);
	    f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new TreeNodeDemo();

	}

}
