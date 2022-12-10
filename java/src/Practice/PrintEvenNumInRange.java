package Practice;
import java.util.Scanner;

public class PrintEvenNumInRange {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first num");
		int x=sc.nextInt();
		System.out.println("enter the second num");
		int y=sc.nextInt();
		int sum=0;
		while(x<=y) 
		{
			if(x%2==0)	
			{
				//System.out.println(x);
				sum=sum+x;
			}
			x++;	
			System.out.println(sum);
		}
		
		
	}
}
