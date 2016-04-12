import java.util.Scanner;

public class suumof {
	private static Scanner sc;

	public static void main(String args[]){
		int n , i,ans=0;
		
		System.out.println("enter the number:");
		sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(i=1;i<=n;i++){
			ans+=i;
			System.out.println(ans);
		}
		
		
	}

}
