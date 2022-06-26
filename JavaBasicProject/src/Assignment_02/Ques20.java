package Assignment_02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ques20 {

	public static void main(String[] args) {
		CTF c = new CTF();
	}
}

class CTF extends JFrame{
	JLabel l1;
	JLabel l2;
	JLabel l3;
	JTextField tf1;
	JTextField tf2;
	JRadioButton rb1;
	JRadioButton rb2;
	JButton b1;
	CTF(){
		l1 = new JLabel("Welcome");
		add(l1);
		l2 = new JLabel("Enter Quantity");
		add(l2);
		tf1 = new JTextField(10);
		add(tf1);
		rb1 = new JRadioButton("Centimeters to Feet");
		add(rb1);
		rb2 = new JRadioButton("Feet to Centimeters");
		add(rb2);
		b1 = new JButton("Convert");
		add(b1);
		l3 = new JLabel("Output");
		add(l3);
		tf2 = new JTextField(10);
		add(tf2);
		
		ActionListener al = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b1) {
					Double res = 0.0;
					if((e.getSource() == rb1) == true) {
						String s = tf1.getText();
						float f = Float.parseFloat(s);
						res = (0.03280)*f;
					}
					if((e.getSource() == rb2) == true) {
						String s = tf1.getText();
						float f = Float.parseFloat(s);
						res = f/30.48;
					}
					tf2.setText(res.toString());
				}
			}
		};
		b1.addActionListener(al);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}