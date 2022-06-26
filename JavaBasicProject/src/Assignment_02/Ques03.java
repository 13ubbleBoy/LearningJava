package Assignment_02;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;

public class Ques03 {

	public static void main(String[] args) {
		Gra g = new Gra();
	}

}

class Gra extends JFrame{
	Gra(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(600, 400);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
	
	public void paint(Graphics g) {
		Graphics g1 = (Graphics2D) g;
		Graphics g2 = (Graphics2D) g;
		g1.setColor(Color.blue);
		g1.drawLine(0,30,800,520);
		g2.setColor(Color.blue);
		g2.fillOval(70,50,30,30);
	}
	
}