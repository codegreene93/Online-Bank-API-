package sockets.addition;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.Scanner;

public class AdditionServer extends Thread {
	private ServerSocket serverSocket;

	public AdditionServer(int port) throws IOException {
		serverSocket = new ServerSocket(port);
		serverSocket.setSoTimeout(100000);
	}

	public void run() {
		while (true) {
			try {
				System.out.println("Waiting for client on port " + serverSocket.getLocalPort() + "...");
				Socket server = serverSocket.accept();
				System.out.println("Just connected to " + server.getRemoteSocketAddress());
				DataInputStream in = new DataInputStream(server.getInputStream());
				Integer x = in.readInt();
				System.out.println("Received the value of first integer from client: " + x);
				Integer y = in.readInt();
				System.out.println("Received the value of second integer from client: " + y);
				Integer sum = (x + y);
				DataOutputStream out = new DataOutputStream(server.getOutputStream());
				// System.out.println(sum);
				out.writeInt(sum);
				server.close();
			} catch (SocketTimeoutException s) {
				System.out.println("Socket timed out!");
				break;
			} catch (IOException e) {
				e.printStackTrace();
				break;
			}
		}
	}

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		System.out.println("Please specify a port number (1~65535): ");
		String port;
		port = userInput.next();

		try {
			Thread t = new AdditionServer(Integer.parseInt(port));
			t.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}