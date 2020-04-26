
import java.sql.*;

public class DemoClass {
	public static void main(String[] args) throws Exception 
	{
		
		String url = "jdbc:mysql://localhost:3306/aliens";
		String uname = "root";
		String pass = "ilovemyself";
		int userid = 6;
		String username = "Dipali";
		String query = "insert into student values (?,?)";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		PreparedStatement st  = con.prepareStatement(query);
		st.setInt(1, userid);
		st.setString(2, username);
		int count = st.executeUpdate();
		System.out.println(count + " row/s affected.");
		
		
		st.close();
		con.close();
		
		
	}
}
