package StringEx1;
import java.util.Scanner;
public class CountPrime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the num");
		int n=s.nextInt();

		int singh=0;
		
		for(int ravi=1; ravi<=n; ravi++)
		{
			int count=0;
			for(int i=1;i<=ravi;i++)
			{
				if(ravi%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(ravi+" ");
				singh++;
			}
		}
		System.out.println("There are "+singh+" Prime numbers");
	}

}
