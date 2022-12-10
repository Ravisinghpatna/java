package Practice;
import java.util.Scanner;
public class Print1to10ForLoop {

	public static void main(String[] args) {
		//int x=1,y=10;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first range");
		int x=s.nextInt();
		System.out.println("Enter the last range");
		int  y=s.nextInt();
		for(int i=x;i<=y;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" Even num");
			}
			else
			{
				System.out.println(i+" Odd number");
			}
		}
		
	}

}
