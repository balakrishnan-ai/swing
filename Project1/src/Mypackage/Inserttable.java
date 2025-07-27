package Mypackage;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

public class Inserttable {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		try {
			System.out.println("Enter the IO: ");
			String id=s.next();
			System.out.println("Enter the FirstName: ");
			String first=s.next();
			System.out.println("Enter the LastName: ");
			String last=s.next();
			System.out.println("Enter the age: ");
			String age=s.next();
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/biodatadb","root","root");
			PreparedStatement stmt=con.prepareStatement("insert into registration(id,first,last,age)values(?,?,?,?)");
			stmt.setString(1,id);
			stmt.setString(2,first);
			stmt.setString(3,last);
			stmt.setString(4,age);
			int i=stmt.executeUpdate();
			if(i!=0) {
				System.out.println("Record Added Successfully");
			}else {
				System.out.println("Failed to add");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
