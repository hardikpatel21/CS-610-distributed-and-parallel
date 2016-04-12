import java.io.*;
import java.net.ConnectException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyClient {
	public static void main(String[] args) throws IOException {
		Socket clientSocket = null;
		BufferedReader in = null;
		boolean scanning = true;
		System.out.println("Welcome to the Daytime client.");
		while(scanning){
			try {

				clientSocket = new Socket("localhost", 4321);
				if (clientSocket != null){
					in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
					String s = in.readLine();
					System.out.println("Here is the timestamp received from the server: "+s);
					scanning= false;
					break;
				}
				//in.close();
				//clientSocket.close();      
				//clientSocket.close();

			}catch (IOException e) {
				System.out.println("Connect failed, waiting and trying again");
				try
				{
					Thread.sleep(2000);//2 seconds
				}
				catch(InterruptedException ie){
					ie.printStackTrace();
					System.out.println("Error: " + e);
					System.exit(0);
				}

			}

		}
		System.out.println("The program terminated with no error and no exception");
	}
}
