package telusko_serialization;

import java.io.Serializable;

public class Student implements Serializable{

	private int rollno;
	private String sname;
	
	public Student() {
		
	}
	
	public Student(int rollno, String sname) {
		super();
		this.rollno = rollno;
		this.sname = sname;
	}





	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
}