package Santosh;

public class SumOfSquare {
	public static int add(int a)
	{
		int sum=0;
		while(a>0)
		{
			int b=a%10;
			
			int m=b*b;
			
			sum=sum+m;
			
			a=a/10;
		
				
		}
		return sum;
	
	}
	public static void main(String[] args) {
		int x=add(12384);
		
		System.out.println(x);
	}

}
