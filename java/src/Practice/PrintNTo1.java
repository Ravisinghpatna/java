package Practice;
import java.util.Scanner;
public class PrintNTo1 {

	public static void main(String[] args) {
		
int n, sum=0;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	n=s.nextInt();
	for(int i=n;i>=1;i--)
	{
		if(i%2!=0)
		{
			System.out.println(i);
		}
		
	}
	
	
	
	}
}
