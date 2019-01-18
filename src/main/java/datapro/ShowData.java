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
		String s1=rs.getString(1);
		String s2=rs.getString(2);
		String s3=rs.getString(3);		
		System.out.println(s1+","+s2+","+s3);
		}
		
		//con.close();

	}

}
