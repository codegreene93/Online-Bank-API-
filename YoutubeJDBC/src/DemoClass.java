

//Java Database Connectivity Class

/*
 * 1. import the package ---> java.sql.*
 * 2. load and register the package ---> forName(com.mysql.jdbc.Driver)
 * 		Download the Jar file from Maven
 * 	 	Import though Build Path, Configure Build Path, Libraries 
 * 3. establish the connection ---> Connection
 * 4. create the statement
 * 5. execute the query
 * 6. process the result
 * 7. close the connection
 */

import java.sql.*;


public class DemoClass {
	public static void main(String[] args) throws Exception
	{
		
		String url = "jdbc:mysql://localhost:3306/aliens";
		String uname = "root";
		String pass = "ilovemyself";
		String query = "select * from student";				
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st  = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		
		while(rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2));
		}
		
		st.close();
		
		con.close();
		
		
		
		
	}
}
