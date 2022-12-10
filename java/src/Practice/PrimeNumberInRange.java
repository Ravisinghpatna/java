package Practice;
import java .util.Scanner;
public class PrimeNumberInRange {

	public static void main(String[] args) {
		int n;
		int count=0;
		Scanner scc=new Scanner(System.in);
		System.out.println("Enter the number");
		 n=scc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		
		if(count==2)
		{
			System.out.println("prime nummber");
		}
		else
		{
			System.out.println("not a prime number");
		}
	}

}
