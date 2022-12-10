package Practice;
import java.util.Scanner;
public class ArrayNew {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int size=sc.nextInt();

		
		int a[]=new int[size];
		int big=a[0];
		int small=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter values");
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>big)
			{
				big=a[i];
			}
//			if(a[i]<small)
//			{
//				small=a[i];
//			}
		}
		System.out.println("The biggest value is "+big);
		System.out.println("The Smallest value is "+small);
	}
	

}
