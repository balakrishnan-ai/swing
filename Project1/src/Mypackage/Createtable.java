package Mypackage;

import java.sql.connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Createtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/biodatadb","root","root");
			Statement stmt=conn.createStatement();
			
			String sql="CREATE TABLE Registration"+"(id integer not null,"+"first varchar(255),"+"last varchar(255),"+"age integer,"+"primary key(id))";
			stmt.executeUpdate(sql);
			System.out.println("Create table in given db");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
