import java.util.Scanner;

public class yesno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String choice;
		int yescount = 0;
		int nocount = 0;
		boolean ch = false;
		Scanner sc = new Scanner(System.in);
		while(!ch){
			System.out.println("what is your vote?[yes|no]");
			choice = sc.next();
			switch(choice){

			case "yes":
				yescount++;
				System.out.println("yes: "+ yescount + "\tNo: " + nocount);
				break;
			case "no": 
				nocount++;
				System.out.println("Yes: "+ yescount + "\tNo: " + nocount);
				break;
			case "":
				ch = false;
			default:
				System.out.println("invalid choice");
				break;



			}
		}
	}
}
