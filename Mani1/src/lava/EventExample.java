package lava;

import javax.swing.*;
import java.awt.event.*;

public class EventExample {

	public static void main(String[] args) {
		JFrame frame=new JFrame("Event Handling Example");
		
		JButton btn=new JButton("Click Me");
		
		btn.setBounds(100,100,120,40);
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Button was clicked");
			}
		});
		frame.add(btn);
		frame.setSize(350,2500);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	
		
	}

}
