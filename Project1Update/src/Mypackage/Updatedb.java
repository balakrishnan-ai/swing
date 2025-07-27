package Mypackage;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Updatedb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PreparedStatement ps=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/biodatadb","root","root");
			String query="update registration set last='ks' where first='af'";
			PreparedStatement ps=con.prepareStatement(query);
			ps.executeUpdate();
			System.out.println("Record is updated");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
