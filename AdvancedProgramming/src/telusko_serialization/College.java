package telusko_serialization;

import java.io.Serializable;
import java.util.List;

public class College implements Serializable{
	
	private List<Student> students;

	
	public College() {
		
	}
	
	public College(List<Student> students) {
		this.students = students;
	}
	
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	

}