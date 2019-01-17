package datapro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DataEntry {

	public static void main(String[] args) {

		try{
			
	    //Driver Loading
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Successfully Loaded");
		//Connection Establishment
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pro3","root","root");
		System.out.println("Connected Successfully");
		//Create an Statement Object to dispatch SQL-statement to DB
		Statement stmt=con.createStatement();
		String sql="insert into emp values(113,'ccc',60000)";
		int n=stmt.executeUpdate(sql);
		System.out.println(n+ " row added");
		//Close the Connection
		con.close();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}

}
