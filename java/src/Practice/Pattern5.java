package Practice;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=n;i>=1;i--) 
		{

			for (int j=n;j>=n-i+1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
