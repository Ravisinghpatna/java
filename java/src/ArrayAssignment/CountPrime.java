package ArrayAssignment;

public class CountPrime {

	public static void main(String[] args) {
		
		int ar[]= {11,23,43,54,53,57};
		
		
		for(int i=0; i<ar.length; i++)
		{
			int count=0;
			for(int j=1; j<=i; j++)
			{
				if(i%j==0)
				{
					count=count+1;
				}
			}
			if(count==2)
			{
				System.out.println(ar[i]);
			}
			
		}

	}

}
