package lava;

import javax.swing.*;
import java.awt.event.*;

public class ButtonClickEvent {

	public static void main(String[] args) {
		JFrame m1=new JFrame("Button Event");
		JButton btn1=new JButton("Click");
		JLabel l1=new JLabel();
		
		btn1.setBounds(100,80,120,30);
		l1.setBounds(100,130,200,30);
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l1.setText("Button Clicked");
			}
		});
		
		m1.add(btn1);
		m1.add(l1);
		
		m1.setSize(300,250);
		m1.setLayout(null);
		m1.setVisible(true);
		m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
