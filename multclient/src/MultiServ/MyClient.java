
package MultiServ;

import java.net.*;
import java.util.Scanner; 

public class MyClient{
	public static void main(String[] args){
	    try{      
	InetAddress  group = InetAddress.getByName("230.1.3.1");
	MulticastSocket  s = new MulticastSocket(2345);
	s.setTimeToLive(32);
	String msg="1";
	Scanner sc= new Scanner(System.in);
	
	while(!msg.equals("0")){
		System.out.println("Enter the integer");
		msg=sc.next();
	DatagramPacket packet = new DatagramPacket(msg.getBytes(), msg.length(), group, 2345);
		
		s.send(packet);
	
	}
	s.close();
	    }
	    catch (Exception ex){
	ex.printStackTrace( );
	    }
	  }
  
}
