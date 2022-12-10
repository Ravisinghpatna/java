package PracticeMore;

public class PrimeNo {

	public static void main(String[] args) {
		int n=3; 
		int sum=0;
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				sum++;
			}
		}
		if(sum==2)
		{
			System.out.println("PrimeNo");
		}
		else
			System.out.println("NotPerfec");
	}

}
