package rmic;

import java.rmi.Naming;

public class HelloClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		      int port = 16790;         
		      String host = "localhost";
		      String registryURL = "rmi://" + host + ":" + port + "/hello";
		      HelloInterface h = (HelloInterface)Naming.lookup(registryURL);
		      System.out.println("Lookup completed " );
		      String message = h.sayHello("Donald Duck");
		      System.out.println("HelloClient: " + message);
		    } 
		    catch (Exception e){
		      e.printStackTrace();
		    } 

	}

}
