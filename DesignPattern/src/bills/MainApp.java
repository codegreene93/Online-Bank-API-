package bills;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainApp {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter plan type");
		String planType = br.readLine();
		
		System.out.println("Enter the number of units");
		int units = Integer.parseInt(br.readLine());
		
		System.out.print("Bill amount for" + planType + " of " + units + " units is: ");
		PlanFactory factory = new PlanFactory();
		Plan plan = factory.getPlan(planType);
		plan.getRate();
		plan.calculateBill(units);
		
		
	}
}
