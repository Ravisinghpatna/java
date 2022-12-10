
import java.util.Scanner;

public class EvenOddWithRange {
public static void main(String[] args) {
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The First Range ");
	int x=sc.nextInt();
	System.out.println("Enter the Last Range");
	int z=sc.nextInt();
	
	for(int i=x;i<=z;i++)
	{
		if(i%2==0)
		{
			
			System.out.println(i+"  It is a Even number");
		}
		
		System.out.println();
	}

	for(int i=x;i<=z;i++)
	{
		if(i%2!=0)
		{
			
			System.out.println(i+"  It is a Odd number");
		}
		
		System.out.println();
	}
	
	
	}


}
