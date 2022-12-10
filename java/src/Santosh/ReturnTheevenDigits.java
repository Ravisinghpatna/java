package Santosh;

public class ReturnTheevenDigits {

	public static int add(int a)
	{
		int count=0;

		while(a>0)
		{
			int b=a%10;
			if(b%2==0)
			{
				count++;
			}
			a=a/10;

	
		}
		return count;
			
	}
	
	public static void main(String[] args) {
		
		int m=add(2124);
		System.out.println(m);
	}

}
