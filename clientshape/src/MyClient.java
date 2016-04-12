import java.applet.Applet;
import java.awt.*;
import java.io.*;
import java.net.*;

public class MyClient extends Applet {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String s,ss;
final int MAX_LEN = 1;
byte[] buffer = new byte[MAX_LEN];
int port = 16790;
DatagramSocket clientSocket;
DatagramPacket datagram = new DatagramPacket(buffer, buffer.length);

	
  public void init(){
	 //Complete this method.
    setSize(400, 400);
    
    try{
    	clientSocket = new DatagramSocket(port);
    	clientSocket.receive(datagram);
         s = new String(buffer);
         
         
        
        System.out.println(s);
      //You may need repaint();
      repaint();
    }catch(Exception e){
      System.out.println("Error: " + e);
      System.exit(0);
    }
    finally{
    	clientSocket.close();
    }
  }


  public void paint(Graphics page){
    //Complete this method.
	  
	  if (s.equals("1")){
	  setForeground(Color.black);
	  page.drawOval(10,10,50,100);
	  }
	  else if (s.equals("2")){
		  setForeground(Color.black);
		  page.fillRect(200,100,200,100);
	  }
	  else{
		  System.out.println("invalid choice");
		  System.out.println(s);
		  System.out.println(s.length());
	  }

  }
  
}
