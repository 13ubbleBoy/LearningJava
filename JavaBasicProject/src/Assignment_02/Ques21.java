package Assignment_02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ques21 {

	public static void main(String[] args) {
		D d = new D();
	}

}

class D extends JFrame{
	JTextField tf1;
	JLabel l1;
	JLabel l2;
	JButton b1;
	String arr[] = {"Praveen", "Prateek", "Pratham", "Shubham", "Hardik"};
	D(){
		l1 = new JLabel("Word");
		add(l1);
		tf1 = new JTextField(10);
		add(tf1);
		l2 = new JLabel("");
		add(l2);
		b1 = new JButton("Find Word");
		add(b1);
		ActionListener al = new ActionListener() {
			boolean flag = false;
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b1) {
					String s = tf1.getText();
					for(int i=0; i<4; i++) {
						if(arr[i].equals(s)) {
							flag = true;
						}
					}
					if(flag == false) {
						l2.setText("Not Found");
					} else l2.setText("Found");
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