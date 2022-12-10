package PracticeMore;

public class StrongNo {

	public static void main(String[] args) {
		int n=145, 
		num=n;
		int sum=0;
		while(n>0)
		{	
			int b=n%10;
			int fact = 1;
			for(int i=1;i<=b;i++)
			{
				fact=fact*i;  //fact*=i;
			}
			sum=sum+fact;  //sum+=fact
			n=n/10;
		}

		if(sum==num) {
			System.out.println("Strong No");}
		else {
			System.out.println("Not StrongNo");}

	}
}
