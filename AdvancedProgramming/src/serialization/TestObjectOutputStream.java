package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestObjectOutputStream implements Serializable {
	  public static void main(String[] args) throws IOException {
	    try ( // Create an output stream for file object.dat
	      ObjectOutputStream output =
	        new ObjectOutputStream(new FileOutputStream("/Users/wilmirnicanor/eclipse-workspace/AdvancedProgramming/src/serialization/Object.datØ"));
	    ) {
	      // Write a string, double value, and object to the file
	      output.writeUTF("John");
	      output.writeDouble(85.5);
	      output.writeObject(new java.util.Date());
	    }
	  }
	}
