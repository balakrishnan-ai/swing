package lava;

public class app2 {


public class MySwingApp {

		public static void main(String[] args) {
			JFrame frame=new JFrame("My First Swing App");
			JButton button=new JButton("Click Me");
			
			button.setBounds(100,100,120,40);
			button.addActionListener(e->JOptionPane.showMessageDialog(frame,"Button Clicked!"));
			
			frame.add(button);
			frame.setSize(300,300);
			frame.setLayout(null);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		}

	}


}
