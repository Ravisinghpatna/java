package Practice;

import java.util.Scanner;
public class ArrayBig {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of an Array");
	int size=sc.nextInt();
	int ar[]=new int[size];
	System.out.println();
	
	System.out.println("Enter the values");
	for(int i=0;i<ar.length;i++)
	{
		ar[i]=sc.nextInt();
	}

	int big=ar[0];
	int small=ar[0];
	
	for(int i=0; i<ar.length; i++)
	{
		if(ar[i]>big)
			big=ar[i];
		
		if(ar[i]<small)
			small=ar[i];
	}
	System.out.println("The biggest value is "+big);
	System.out.println("The smallest value is "+small);

}
}




