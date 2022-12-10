package Santosh;
import java.util.Scanner;
public class PrimeNumner {
	public static void main(String[] args) 
	{	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int prime =sc.nextInt();
	int count=0;
	for(int i=1;i<=prime;i++)
	{
		if(prime%i==0)
		{
			count++;
		}
	}
	
	if(count==2)
	{
		System.out.println("prime num");
	}
	else
		System.out.println("not prime number");
}
}