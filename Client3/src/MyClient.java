import java.rmi.Naming;
import java.util.Scanner;;

public class MyClient{
  public static void main(String args[]){
    //Complete this method.
	  Scanner sc = new Scanner(System.in);
	  String n;
	    try{
	      int port = 16790;         
	      String host = "localhost";
	      String registryURL = "rmi://" + host + ":" + port + "/hello";
	      VoteInterface h = (VoteInterface)Naming.lookup(registryURL);
	      System.out.println("enter a positive interger");
	      n = sc.next();
	      System.out.println("Lookup completed " );
	      String message = h.castVote(n);
	      System.out.println("Sum of given number is:" + message);
	    } 
	    catch (Exception e){
	      e.printStackTrace();
	    } 
  }
}
