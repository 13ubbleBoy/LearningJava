package Assignment_02;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.*;

public class Ques02 {

	public static void main(String[] args) {
		Graphic g = new Graphic();
	}
}

class Graphic extends JFrame{
	Graphic(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(600, 400);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
	
	public void paint(Graphics g) {
		Graphics g1 = (Graphics2D) g;
		Graphics g2 = (Graphics2D) g;
		Graphics g3 = (Graphics2D) g;
		g1.setColor(Color.orange);
		g1.fillOval(220,90,180,250);
		g2.setColor(Color.blue);
		g2.drawLine(260, 160, 285, 160);
		g2.drawLine(330, 155, 360, 155);
		g3.drawArc(265,180,80,100,220,100);
	}
	
}
