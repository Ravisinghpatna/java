package StringEx1;
import java.util.Scanner;
public class PrimeNoWithUserInput {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the num");
		int n=s.nextInt();
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(n+" is a Prime number");
		}
		else
			System.out.println(n+" is not a prime number");
	}

}
