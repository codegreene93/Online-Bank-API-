package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class EmployeeFileOut {
	public static void main(String[] args) {
		Employee e = new Employee();
		Scanner in = new Scanner(System.in);
		System.out.println("What's your name?");
		e.setName(in.nextLine());
		System.out.println("What's your address?");
		e.setAddress(in.nextLine());
		System.out.println("What's your SSN?");
		e.setSSN(in.nextInt());
		in.nextLine();
		System.out.println("Enter your number");
		e.setNumber(in.nextInt());
		
		try {
			FileOutputStream fileOut = new FileOutputStream("/Users/wilmirnicanor/eclipse-workspace/AdvancedProgramming/src/serialization/employee.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
		}catch(FileNotFoundException error) {
			System.out.println(error);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
		
		
		
		
		
	}
}
