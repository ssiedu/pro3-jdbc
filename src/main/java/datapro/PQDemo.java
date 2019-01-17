package datapro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PQDemo {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ECode");
		int code=sc.nextInt();
		System.out.println("Enter Name");
		String name=sc.next();
		System.out.println("Enter Salary");
		int sal=sc.nextInt();

		Connection con=Data.connect();
		
		String sql="insert into emp values(?,?,?)";
		
		PreparedStatement ps=con.prepareStatement(sql);
		
		ps.setInt(1, code);
		ps.setString(2, name);
		ps.setInt(3, sal);
		
		int n=ps.executeUpdate();
		
		System.out.println(n+" row added");
		con.close();
		

	}

}
