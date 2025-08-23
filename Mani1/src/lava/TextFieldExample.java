package lava;

import javax.swing.*;
import java.awt.event.*;

public class TextFieldExample {

	public static void main(String[] args) {
		JFrame m1=new JFrame("Input Box");
		
		JTextField name=new JTextField();
		JButton btn1=new JButton("Show Name");
		
		name.setBounds(50,60,150,30);
		btn1.setBounds(210,60,120,30);
		
		btn1.addActionListener(e->{
		String name1=name.getText();
		JOptionPane.showMessageDialog(m1, "Hello, "+name1+" !");
		});
		
		m1.add(name);
		m1.add(btn1);
		m1.setSize(400,180);
		m1.setLayout(null);
		m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m1.setVisible(true);
	}

}
