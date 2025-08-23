package lava;

import javax.swing.*;
import java.awt.event.*;

public class TextFieldExample1 {

	public static void main(String[] args) {
		JFrame m1=new JFrame("Text Field Example");
		
		JTextField t1=new JTextField();
		JButton btn1=new JButton("Submit");
		JLabel l1=new JLabel();
		
		t1.setBounds(50,50,200,30);
		btn1.setBounds(100,100,100,30);
		l1.setBounds(70,150,200,30);
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text=t1.getText();
				l1.setText("You entered: "+text);
			}
		});
		
		m1.add(t1);
		m1.add(btn1);
		m1.add(l1);
		
		m1.setSize(300,250);
		m1.setLayout(null);
		m1.setVisible(true);
		m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
