import java.io.*;
import java.net.*;

public class MyClient {
	public static void main(String[] args) throws IOException {
		final int MAX_LEN = 100;
		byte[] buffer = new byte[MAX_LEN];
		int port = 16790;
		DatagramPacket datagram = new DatagramPacket(buffer, buffer.length);
		DatagramSocket clientSocket = new DatagramSocket(port);
		
		try {
			clientSocket.setSoTimeout(5000);
			clientSocket.receive(datagram);
			String message = new String(buffer);
			System.out.println(message);
		} catch (SocketTimeoutException ex) {
			System.out.println("Timed out on reciever");
		}
		
		catch (IOException e) {
			System.out.println("Error: " + e);
			System.exit(0);
		}
		
		finally {
			clientSocket.close();
		}
		System.out.println("The program terminated with no error and no exception");
	}
}
