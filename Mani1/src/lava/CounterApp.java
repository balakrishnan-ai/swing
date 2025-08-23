package lava;

import javax.swing.*;
import java.awt.event.*;

public class CounterApp {

	public static void main(String[] args) {
		JFrame m1=new JFrame("Counter App");
		
		JButton btn1=new JButton("Increment");
		JLabel l1=new JLabel("Count: 0");
		
		int[] count= {0};
		
		
		l1.setBounds(130,60,100,30);
		btn1.setBounds(100,100,120,30);
		
		btn1.addActionListener(e->{
			count[0]++;
			l1.setText("Count: "+count[0]);
		});
		
		m1.add(l1);
		m1.add(btn1);
		m1.setSize(350,250);
		m1.setLayout(null);
		m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m1.setVisible(true);
	}

}
