package serialization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class CompressedSequence {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, "UTF-8");
		BufferedReader in = new BufferedReader(reader);
		String line = in.readLine();
		
		String[] result = line.split(" ");
		
		
		int counter = 0;
		for(int i = 0; i < (result.length); i++) {			
			if(i < result.length -1) {
				if(result[i].equals(result[i+1])) {
					counter++;
				}else {
					System.out.print(counter + " " + result[i] + " ");
					counter = 1;
				}
			}
			

			
			
			
		}
	
	}
}
