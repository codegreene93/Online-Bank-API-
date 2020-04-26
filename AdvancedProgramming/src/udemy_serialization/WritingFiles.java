package udemy_serialization;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {
	public static void main(String[] args) {
		File file = new File("test2.txt");
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
			bw.write("This is line one");
			bw.newLine();
			bw.write("The is line two");
			bw.newLine();
			bw.write("Last line");
		} catch (IOException e) {
			System.out.println("Unable to read file");
		}
	}
}
