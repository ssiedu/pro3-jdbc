package datapro;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetUpdate {
public static void main(String args[]) throws Exception {
	Connection con=Data.connect();
	String sql="select * from emp";
	//Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
	Statement stmt=con.createStatement(1005,1008);
	ResultSet rs=stmt.executeQuery(sql);
	
	while(rs.next()){
	System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3));		
	}
	
	//changing the salary of third row to 35000
	rs.absolute(3);	//moving cursor to row -3
	rs.updateInt(3, 35000);//changing the value of 3rd col for Current Row to 35000
	rs.updateRow();//update the contents to underlying database
	System.out.println("DATA MODIFIED");
	
	rs.beforeFirst();
	while(rs.next()){
		System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3));		
	}

	
	con.close();
}
	
}
