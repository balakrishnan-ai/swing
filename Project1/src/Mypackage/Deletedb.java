package Mypackage;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.PreparedStatement;
import java.util.Scanner;
public class Deletedb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/biodatadb","root","root");
			Statement stmt=con.createStatement();
			String query1="delete from registration where id='1'";
			stmt.executeUpdate(query1);
			System.out.println("Record is deleted");
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
