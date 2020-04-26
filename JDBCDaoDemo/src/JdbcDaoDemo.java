import java.sql.*;


public class JdbcDaoDemo {
	public static void main(String[] args) {
		
		StudentDAO dao = new StudentDAO();
		Student s2 = new Student();
		s2.rollno = 15;
		s2.sname = "Archana";
		dao.connect();
		dao.addStudent(s2);
	
	}
}


class StudentDAO{
	
	Connection con = null;
	
	public void connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wilmir", "root", "ilovemyself");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public Student getStudent(int rollno) {
		Student s = new Student();
		s.rollno = rollno;
		try {
			
			String query = "select sname from student where rollno =" + rollno;
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			rs.next();
			
			String name = rs.getString(1);
			s.sname = name;		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}
	
	public void addStudent(Student s) {
		String query = "insert into student values (?,?)";
		try {
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, s.rollno);
			pst.setString(2, s.sname);
			pst.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}


class Student {
	int rollno;
	String sname;
}