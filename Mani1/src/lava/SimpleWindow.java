package lava;

import javax.swing.JFrame;

public class SimpleWindow {

	public static void main(String[] args) {
		JFrame m1=new JFrame("My First Swing Window");
		m1.setSize(300,200);
		m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m1.setVisible(true);
	}

}
