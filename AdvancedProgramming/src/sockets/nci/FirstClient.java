package sockets.nci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class FirstClient {
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;
    
    public void startConnection(String ip, int port) throws IOException {
       clientSocket = new Socket(ip, port);
       out = new PrintWriter(clientSocket.getOutputStream(), true);
       in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    }

    public String sendMessage(String msg) throws IOException {
      out.println(msg);
      String resp = in.readLine();      
      return resp;
    }
    
    public void stopConnection() throws IOException {
      in.close();
      out.close();
      clientSocket.close();
    }
    
    public static void main(String[] args) throws IOException {
        FirstClient Client = new FirstClient();
        Client.startConnection("localhost", 6000);
        String message = Client.sendMessage("hello server");
        System.out.println(message);
        Client.stopConnection();
    }
}