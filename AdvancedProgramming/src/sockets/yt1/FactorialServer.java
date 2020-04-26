package sockets.yt1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class FactorialServer {
	public static void main(String[] args) {
		try {
			System.out.println("Waiting for client connection");
			ServerSocket ss = new ServerSocket(9907);
			Socket socket = ss.accept();
			System.out.println("Connection established");
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String str = in.readLine();
			
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			out.println("Srever says " + str);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
