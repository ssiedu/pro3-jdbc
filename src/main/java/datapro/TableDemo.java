package datapro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TableDemo {
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pro3", "root", "root");
		Statement stmt=con.createStatement();
		String sql="create table dummy (col1 char, col2 char)";
		int n=stmt.executeUpdate(sql);
		System.out.println(n);
		con.close();
	}
}
