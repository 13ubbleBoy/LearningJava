package Assignment_02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ques12 {

	public static void main(String[] args) {
		B b = new B();
	}

}

class B extends JFrame{
	JTextField tf1;
	JLabel l1;
	JLabel l2;
	JButton b1;
	int ids[] = {100,101,102,103,104,105,106,107,108,109,110};
	B(){
		tf1 = new JTextField(10);
		add(tf1);
		l1 = new JLabel("Employee ID");
		add(l1);
		b1 = new JButton("Submit");
		add(b1);
		l2 = new JLabel("");
		add(l2);
		ActionListener al = new ActionListener() {
			boolean flag = false;
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b1) {
					String s = tf1.getText();
					int c = Integer.parseInt(s);
					for(int i=0; i<11; i++) {
						if(ids[i] == c) {
							l2.setText("ID Exist");
							flag = true;
							break;
						}
					}
					if(flag == false) {
						l2.setText("ID does not Exist");
					}
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
