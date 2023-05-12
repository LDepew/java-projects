package jdbc;

import java.sql.*;

public class Jdbc_java {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Class.forName("com.mysql.jdbc.Driver");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","Pass");
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from student");
		
		
		while (rs.next()) {
		int roll = rs.getInt("Roll_no");
		String name = rs.getString("Name");
		String city = rs.getString("City");
		
		System.out.println(roll + " " + name + " " + city);
		};
		
		st.close();
		con.close();
	}

}
