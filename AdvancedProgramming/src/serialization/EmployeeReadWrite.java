package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeReadWrite {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		Employee e;
		
		try(
			ObjectInputStream input = 
			new ObjectInputStream(new FileInputStream("/Users/wilmirnicanor/eclipse-workspace/AdvancedProgramming/src/serialization/employee.ser"));
				
			ObjectOutputStream output =
			new ObjectOutputStream(new FileOutputStream("/Users/wilmirnicanor/eclipse-workspace/AdvancedProgramming/src/serialization/new_employee.ser"));
				
			){
			
			
			e = (Employee)input.readObject();
			output.writeObject(e);
		      
		}
		
		
		
	}
}
