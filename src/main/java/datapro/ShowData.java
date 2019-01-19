package datapro;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ShowData {

	public static void main(String[] args) throws Exception {

		Connection con=Data.connect();
		String sql="select * from emp where sal>=30000";
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(sql);
		
		while(rs.next()){
		System.out.println(rs.getString(1));		
		}
		
		rs.beforeFirst();
		
		while(rs.next()){
		System.out.println(rs.getString(2));		
		}
		
		
		con.close();

	}

}
