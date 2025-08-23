package lava;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelButtonExample {

	public static void main(String[] args) {
		JFrame m1=new JFrame("Label and Button");
		JButton btn1=new JButton("Click Me");
		JLabel l1=new JLabel("welcome");
		
		btn1.setBounds(100,30,120,30);
		l1.setBounds(110,30,200,30);
		
		m1.add(btn1);
		m1.add(l1);
		
		m1.setSize(300,200);
		m1.setLayout(null);
		m1.setVisible(true);
		m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
