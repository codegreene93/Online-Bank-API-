import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainApp {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the type of computer");
		
		
		String type ="";
		try {
			type = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		ComputerFactory factory = new ComputerFactory();
		Computer computer = factory.getComputer(type);
		
		
		computer.setCharacteristics();
		computer.getCPU();
		computer.getHDD();
		computer.getRAM();
		
		
	}
}
