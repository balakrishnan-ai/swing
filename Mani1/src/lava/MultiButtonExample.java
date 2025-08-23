package lava;

import javax.swing.*;
import java.awt.event.*;

public class MultiButtonExample {

	public static void main(String[] args) {
		JFrame m1=new JFrame("Multiple Button");
		
		JButton btn1=new JButton("Say Hello");
		JButton btn2=new JButton("Say Bye");
		
		btn1.setBounds(50,80,120,30);
		btn2.setBounds(180,80,120,30);
		
		btn1.addActionListener(e->
		JOptionPane.showMessageDialog(m1, "Hello, User")
		);
		
		btn2.addActionListener(e->
		JOptionPane.showMessageDialog(m1,"GoodBye")
		);
		
		
		
		
		
		m1.add(btn1);
		m1.add(btn2);
		m1.setSize(370,200);
		m1.setLayout(null);
		m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		m1.setVisible(true);
	}

}
