package datapro;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetDelete {
	public static void main(String args[]) throws Exception {
		Connection con=Data.connect();
		String sql="select * from emp";
		//Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		Statement stmt=con.createStatement(1005,1008);
		ResultSet rs=stmt.executeQuery(sql);
		
		while(rs.next()){
		System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3));		
		}

		rs.absolute(6);
		rs.deleteRow();
		
		System.out.println("ROW DELETED SUCCESSFULLY");
		
		
		
		
		con.close();
	}
}
