package telusko_serialization;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SerializeXML {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setRollno(101);
		s1.setSname("Wilmir");
		Student s2 = new Student();
		s2.setRollno(102);
		s2.setSname("Rhea");
		
		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		
		College college = new College();
		college.setStudents(list);

		
		try {
			XMLEncoder x = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("myCollege.xml")));
			x.writeObject(college);
			x.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}







