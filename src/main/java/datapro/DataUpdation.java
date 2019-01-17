package datapro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DataUpdation {
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pro3", "root", "root");
		Statement stmt=con.createStatement();
		int n=stmt.executeUpdate("update emp set sal=sal+100");
		System.out.println(n+" row(s) modieifed");
		con.close();
	}
}
