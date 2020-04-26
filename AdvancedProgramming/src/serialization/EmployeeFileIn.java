package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeFileIn {
	
	public static void main(String[] args) {
		Employee e;
		try {
			FileInputStream fileIn = new FileInputStream("/Users/wilmirnicanor/eclipse-workspace/AdvancedProgramming/src/serialization/employee.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			e = (Employee)in.readObject();
			in.close();
			fileIn.close();
			
			System.out.println("Deserialized Employee...");  	
			System.out.println("Name: " + e.name);  	
			System.out.println("Address: " + e.address);  	
			System.out.println("SSN: " + e.SSN);  	
			System.out.println("Number: " + e.number);
			
		}catch(IOException err){
			System.out.println(err);
		} catch (ClassNotFoundException e1) {
			System.out.println(e1);
		}
			
	}
	
	
}
