package Practice;

public class SumOfN {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter the Numbers");
		int a=sc.nextInt();
		int sum=0;
		
		for(int i=1; i<=a;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);

	}

}
