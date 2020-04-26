package dogs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DogShop {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("What type of dog do you want?");
		
		
		String type ="";
		try {
			type = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		DogFactory factory = new DogFactory();
		Dog dog = factory.getDog(type);
		dog.getDog();
		dog.buyDog();
		
	}
}
