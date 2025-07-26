package Mypackage;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class Viewdb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/biodata","root","root");
			java.beans.Statement stmt=con.createStatement();
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
