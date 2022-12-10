package PracticeMore;

public class Perfect_No {

	public static void main(String[] args) {
		int n=496,sum=0;
		
		
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n)
		{
			System.out.println("perfect");
		}
		else
			System.out.println("not Perfect");
		
	}

}
