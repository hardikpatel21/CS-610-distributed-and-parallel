package client;

import java.io.*;
import java.net.*;
import java.util.*;

public class MyClient {
  public static void main(String[] args) throws IOException, InterruptedException {
    System.out.println("Hello!");
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter a line or a bye to quit the client: ");
   
    String message = keyboard.nextLine();
    final int MAX_LEN = 100;
    while(! message.equalsIgnoreCase("bye"))
	try {
		//System.out.println(message);
		byte[] buffer = new byte[MAX_LEN];	
	  buffer = message.getBytes();
	  InetAddress host = InetAddress.getByName("localhost");
	  //A socket for sending and receiving packets.
	  DatagramSocket serverSocket = new DatagramSocket();
	  //Form a packet. The packet includes the host address and its port.
	  DatagramPacket datagram=new DatagramPacket(buffer,buffer.length,host, 1234);
	  //Send the packet.
	  serverSocket.send(datagram);
	  Thread.sleep(10000);
	  //Receive the same packet (hopefully !)
	  serverSocket.receive(datagram);
	  message = new String(buffer);
	  System.out.println(message);
	  System.out.print("Enter a line or a bye to quit the client: ");
	  message = keyboard.nextLine();
	  serverSocket.close();
	} catch (IOException e) {
	  System.out.println("Error: " + e);
	  System.exit(0);
	}
  }
}

