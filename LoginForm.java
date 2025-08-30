package lava;

import javax.swing.*;
import java.awt.event.*;

public class LoginForm {

	public static void main(String[] args) {
		JFrame frame=new JFrame("Login Form");
		JLabel uname=new JLabel("Username: ");
		JLabel psd=new JLabel("Password: ");
		
		JTextField utext=new JTextField();
		JPasswordField ptext=new JPasswordField();
		
		JButton linbtn=new JButton("Login");
		JLabel res=new JLabel();
		
		uname.setBounds(30,30,100,30);
		utext.setBounds(120,30,150,30);
		
		psd.setBounds(30,70,100,30);
		ptext.setBounds(120,70,150,30);
		
		linbtn.setBounds(100,120,100,30);
		res.setBounds(100,170,200,30);
		
		linbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user=utext.getText();
				String pass=new String(ptext.getPassword());
				
				if(user.equals("admin") && pass.equals("1234")){
					res.setText("Login Successfully");
				}else {
					res.setText("Invalid credentials");
				}
			}
		});
		
		frame.add(uname);
		frame.add(utext);
		frame.add(psd);
		frame.add(ptext);
		frame.add(linbtn);
		frame.add(res);
		
		frame.setSize(350,300);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
	}

}
