package sockets.addition;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class AdditionClient {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		System.out.println("Enter Server Address: ");
		String serverName;
		serverName = userInput.next();

		System.out.println("Enter Port Number: ");
		String port;
		port = userInput.next();
		try {
			System.out.println("Connecting to " + serverName + " on port " + port);
			Socket client = new Socket(serverName, Integer.parseInt(port));
			System.out.println("Just connected to " + client.getRemoteSocketAddress());
			OutputStream outToServer = client.getOutputStream();
			DataOutputStream out = new DataOutputStream(outToServer);

			System.out.println("Enter a first number: ");

			// userInput.nextInt();
			Integer x = userInput.nextInt();
			System.out.println("Enter a second number: ");
			// userInput.nextInt();
			Integer y = userInput.nextInt();

			// System.out.println("hello");

			out.writeInt(x);
			out.writeInt(y);

			InputStream inFromServer = client.getInputStream();
			DataInputStream in = new DataInputStream(inFromServer);
			System.out.println("Server responds: " + in.readInt());
			client.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}