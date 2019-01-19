package datapro;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetInsert {
	public static void main(String args[]) throws Exception {
		Connection con=Data.connect();
		String sql="select * from emp";
		//Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		Statement stmt=con.createStatement(1005,1008);
		ResultSet rs=stmt.executeQuery(sql);
		
		while(rs.next()){
		System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3));		
		}

		//inserting a row using ResultSet
		rs.moveToInsertRow();
		rs.updateInt(1, 116);
		rs.updateString(2, "fff");
		rs.updateInt(3, 60000);
		
		
		rs.insertRow();
		System.out.println("RECORD ADDED");
		con.close();
	}
		
}
