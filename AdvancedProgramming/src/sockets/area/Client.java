package sockets.area;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		try {
			System.out.println("Client has started");
			Socket socket = new Socket("localhost", 4525);

			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the starting radius: ");
			
			double radius1 = scan.nextDouble();
			
			System.out.println("Enter the ending radius: ");

			double radius2 = scan.nextDouble();
						
			DataInputStream in = new DataInputStream(socket.getInputStream());
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());
	
			out.writeDouble(radius1);
			out.writeDouble(radius2);
			
			double area = in.readDouble();
			
			System.out.println("Server calculated the area: " + area);
			
			in.close();
			out.close();
			scan.close();
			socket.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
