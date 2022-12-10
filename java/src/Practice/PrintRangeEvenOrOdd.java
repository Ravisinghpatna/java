package Practice;

public class PrintRangeEvenOrOdd {

	public static void main(String[] args) {
		int a=10;
		int b=31;
		
		for(int i=a;i<=b;i++)
		{
			if(i%2==0)
			{
				System.out.println("the number is Even "+i);
			}
			else
			{
				System.out.println("the number is odd "+i);
			}
		}
	}

}
