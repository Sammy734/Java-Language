package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculaterDemo implements ActionListener{



	JFrame frame;

	JTextField textfield;

	JButton[] numberButtons = new JButton[10];

	JButton[] functionButtons = new JButton[9];

	JButton addButton,subButton,mulButton,divButton;

	JButton decButton, equButton, delButton, clrButton, negButton;

	JPanel pan;

	

	double num1=0,num2=0,result=0;

	char operator;

	

	 CalculaterDemo(){

		

		frame = new JFrame("Calc");
		frame.setSize(420, 550);
		frame.setLayout(null);
        frame.setTitle("calculater demo");
		

		textfield = new JTextField();
		textfield.setBounds(50, 25, 300, 50);


		

		addButton = new JButton("+");

		subButton = new JButton("-");

		mulButton = new JButton("*");

		divButton = new JButton("/");

		decButton = new JButton(".");

		equButton = new JButton("=");

		delButton = new JButton("Del");

		clrButton = new JButton("Clr");

		negButton = new JButton("(-)");

		

		functionButtons[0] = addButton;

		functionButtons[1] = subButton;

		functionButtons[2] = mulButton;

		functionButtons[3] = divButton;

		functionButtons[4] = decButton;

		functionButtons[5] = equButton;

		functionButtons[6] = delButton;

		functionButtons[7] = clrButton;

		functionButtons[8] = negButton;

		

		for(int i =0;i<9;i++) {

			functionButtons[i].addActionListener(this);

		}

		

		for(int i =0;i<10;i++) {

			numberButtons[i] = new JButton(String.valueOf(i));

			numberButtons[i].addActionListener(this);

		}

		

		delButton.setBounds(150,430,100,50);

		clrButton.setBounds(250,430,100,50);

		

		pan = new JPanel();

		pan.setBounds(80, 100, 200, 150);

		pan.setLayout(new FlowLayout());



		pan.add(numberButtons[1]);

		pan.add(numberButtons[2]);

		pan.add(numberButtons[3]);

		pan.add(addButton);

		pan.add(numberButtons[4]);

		pan.add(numberButtons[5]);

		pan.add(numberButtons[6]);

		pan.add(subButton);

		pan.add(numberButtons[7]);

		pan.add(numberButtons[8]);

		pan.add(numberButtons[9]);

		pan.add(mulButton);

		pan.add(decButton);

		pan.add(numberButtons[0]);

		pan.add(equButton);

		pan.add(divButton);

		

		frame.add(pan);

		frame.add(delButton);

		frame.add(clrButton);

		frame.add(textfield);

		frame.setVisible(true);

	}

	

	public static void main(String[] args) {

		

		new CalculaterDemo();

	}

	

	@Override

	public void actionPerformed(ActionEvent e) {

		

		for(int i=0;i<10;i++) {

			if(e.getSource() == numberButtons[i]) {

				textfield.setText(textfield.getText().concat(String.valueOf(i)));

			}

		}

		if(e.getSource()==decButton) {

			textfield.setText(textfield.getText().concat("."));

		}

		if(e.getSource()==addButton) {

			num1 = Double.parseDouble(textfield.getText());

			operator ='+';

			textfield.setText("");

		}

		if(e.getSource()==subButton) {

			num1 = Double.parseDouble(textfield.getText());

			operator ='-';

			textfield.setText("");

		}

		if(e.getSource()==mulButton) {

			num1 = Double.parseDouble(textfield.getText());

			operator ='*';

			textfield.setText("");

		}

		if(e.getSource()==divButton) {

			num1 = Double.parseDouble(textfield.getText());

			operator ='/';

			textfield.setText("");

		}

		if(e.getSource()==equButton) {

			num2=Double.parseDouble(textfield.getText());

			

			switch(operator) {

			case'+':

				result=num1+num2;

				break;

			case'-':

				result=num1-num2;

				break;

			case'*':

				result=num1*num2;

				break;

			case'/':

				result=num1/num2;

				break;

			}

			textfield.setText(String.valueOf(result));

			num1=result;

		}

		if(e.getSource()==clrButton) {

			textfield.setText("");

		}

		if(e.getSource()==delButton) {

			String string = textfield.getText();

			textfield.setText("");

			for(int i=0;i<string.length()-1;i++) {

				textfield.setText(textfield.getText()+string.charAt(i));

			}

		}
	}
}