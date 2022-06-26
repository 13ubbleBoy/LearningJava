package Assignment_02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ques13 {

	public static void main(String[] args) {
		C c = new C();
	}

}

class C extends JFrame{
	JLabel l1;
	JLabel l2;
	JLabel l3;
	JLabel l4;
	JLabel l5;
	JLabel l6;
	JLabel l7;
	JTextField tf1;
	JTextField tf2;
	JTextField tf3;
	JTextField tf4;
	JButton b1;
	C(){
		l1 = new JLabel("Average Marks Calculator");
		add(l1);
		l2 = new JLabel("Enter  your  Marks  to  Calculate  Average");
		add(l2);
		l3 = new JLabel("Course Marks 1");
		add(l3);
		tf1 = new JTextField(12);
		add(tf1);
		l4 = new JLabel("Course Marks 2");
		add(l4);
		tf2 = new JTextField(12);
		add(tf2);
		l5 = new JLabel("Course Marks 3");
		add(l5);
		tf3 = new JTextField(12);
		add(tf3);
		l6 = new JLabel("Course Marks 4");
		add(l6);
		tf4 = new JTextField(12);
		add(tf4);
		b1 = new JButton("Calculate Average");
		add(b1);
		l7 = new JLabel("Average");
		add(l7);
		ActionListener al = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b1) {
					Double res;
					String s1 = tf1.getText();
					int sub1 = Integer.parseInt(s1);
					String s2 = tf2.getText();
					int sub2 = Integer.parseInt(s2);
					String s3 = tf2.getText();
					int sub3 = Integer.parseInt(s3);
					String s4 = tf2.getText();
					int sub4 = Integer.parseInt(s4);
					res = (double)(sub1+sub2+sub3+sub4)/4;
					l7.setText(res.toString());
				}
			}
		};
		b1.addActionListener(al);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(350,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}