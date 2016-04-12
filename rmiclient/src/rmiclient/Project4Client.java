package rmiclient;

import java.rmi.*;
import java.util.*;

public class Project4Client {
  //Complete this class.
	  public static void main(String args[]){
		  Scanner sc = new Scanner(System.in);
		  int n;
		    try{
		      int port = 16790;         
		      String host = "127.0.0.1";
		      String registryURL = "rmi://" + host + ":" + port + "/rmiserver";
		      Project3ServerInterface h = (Project3ServerInterface)Naming.lookup(registryURL);
		      Naming.rebind(registryURL, h);
		      System.out.println("enter a positive interger");
		      n = sc.nextInt();
		      System.out.println("Lookup completed " );
		      int message = h.calculateSum(n);
		      System.out.println("Sum of given number is:" + message);
		    } 
		    catch (Exception e){
		      e.printStackTrace();
		    } 
		  }
}





