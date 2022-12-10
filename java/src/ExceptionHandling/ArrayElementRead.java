package ExceptionHandling;
import java.util.Scanner;
public class ArrayElementRead {
	public static void arrayRead()
	{
	System.out.println("arrayRead");
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the length of an array");
		int n=s.nextInt();
		int []a= new int[n];
		
		
		System.out.println("enter element");
		for(int i=0;i<=a.length;i++)
		{
			a[i]=s.nextInt();
		}		
		
	}

}
