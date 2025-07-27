package Mypackage;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class Viewdb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/biodatadb","root","root");
			Statement stmt=con.createStatement();
			ResultSet rs=(ResultSet) stmt.executeQuery("select * from registration");
			while(rs.next()) {
				System.out.println(rs.getInt("id")+"\t\t"+rs.getString("first")+"\t\t"+rs.getString("last")+"\t\t"+rs.getInt("age"));
			}
			stmt.close();
			con.close();
			System.out.println("Record viewer");
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
