package Assignment_02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ques11 {

	public static void main(String[] args) {
		A a = new A();
	}
}

class A extends JFrame{
	JTextField tf1;
	JLabel l1;
	JLabel l2;
	JButton b1;
	A(){
		tf1 = new JTextField(10);
		add(tf1);
		l1 = new JLabel("Celsius");
		add(l1);
		b1 = new JButton("Convert");
		add(b1);
		l2 = new JLabel("Result");
		add(l2);
		ActionListener al = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b1) {
					String s = tf1.getText();
					int c = Integer.parseInt(s);
					Double res = (double) (((c*9)/5)+32);
					l2.setText(res.toString());
				}
			}
		};
		b1.addActionListener(al);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(250,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}