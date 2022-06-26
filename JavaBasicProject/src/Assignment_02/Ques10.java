package Assignment_02;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ques10 {

	public static void main(String[] args) {
		newUser n1 = new newUser();
	}

}

class newUser extends JFrame{
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
	JTextField tf5;
	JTextField tf6;
	
	JButton b1;
	
	String firstName, lastName, userName, Password, emailAddress, mobileNumber;
	newUser(){
		l1 = new JLabel("New User Register");
		add(l1);
		
		l2 = new JLabel("First name");
		add(l2);
		tf1 = new JTextField(10);
		add(tf1);
		
		l3 = new JLabel("Username");
		add(l3);
		tf2 = new JTextField(10);
		add(tf2);
		
		l4 = new JLabel("Last name");
		add(l4);
		tf3 = new JTextField(14);
		add(tf3);
		
		l5 = new JLabel("Password");
		add(l5);
		tf4 = new JTextField(14);
		add(tf4);
		
		l6 = new JLabel("Email Address");
		add(l6);
		tf5 = new JTextField(12);
		add(tf5);
		
		l7 = new JLabel("Mobile Number");
		add(l7);
		tf6 = new JTextField(12);
		add(tf6);
		
		b1 = new JButton("Register");
		add(b1);
		
		ActionListener al = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b1) {
					firstName = tf1.getText().toString();
					userName = tf2.getText().toString();
					lastName = tf3.getText().toString();
					Password = tf4.getText().toString();
					emailAddress = tf5.getText().toString();
					mobileNumber = tf6.getText().toString();
				}
			}
		};
		b1.addActionListener(al);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(550,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}