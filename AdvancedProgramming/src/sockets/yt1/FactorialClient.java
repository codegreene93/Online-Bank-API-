package sockets.yt1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class FactorialClient {
	public static void main(String[] args) {
		System.out.println("Client started");
		try {
			Socket socket = new Socket("localhost", 9907);
			BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a string");
			String str = userInput.readLine();
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			out.println(str);
			
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			System.out.println(in.readLine());
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
