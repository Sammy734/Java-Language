package Examples;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class NotePadDemo {
	JMenuBar bar;
	JMenu file,edit,format;
	JMenuItem New,open,save;
	NotePadDemo(){
		bar = new JMenuBar();
		file = new JMenu("file");
		edit = new JMenu("edit");
		format = new JMenu("format");
		
	}

	public static void main(String[] args) {
		 new NotePadDemo();

	}

}
