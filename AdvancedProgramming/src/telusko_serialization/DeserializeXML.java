package telusko_serialization;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DeserializeXML {
	public static void main(String[] args) throws Exception {
		
	
		FileInputStream fis = new FileInputStream("myCollege.xml");
		BufferedInputStream bis = new BufferedInputStream(fis);
		XMLDecoder x = new XMLDecoder(bis);
		
		College c = (College)x.readObject();
	
		for(Student s:c.getStudents()) {
			System.out.println(s.getSname());
		}
		
		
	}
}
