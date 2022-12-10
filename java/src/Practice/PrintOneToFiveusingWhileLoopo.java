package Practice;
import java.util.Scanner;
public class PrintOneToFiveusingWhileLoopo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter the First Number");
	int x=sc.nextInt();
	System.out.println("Enter the Last Number");
	 int z=sc.nextInt();
		while(x<=z)
		{
			System.out.print(x+" ");
			x++;		}
	}

}
