package Santosh;

public class CountDigit {	
	public static void main(String args[])
	{
		long a=12777345887654786L;
		int count=0;
		
		while(a>0)
		{
			a=a/10;
			count++;
		}
		System.out.println(count);
		
	
	}

}
