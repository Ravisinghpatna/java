package Practice;

public class EvenOrOdd {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		if(num%2!=1)
		//if(num%2==0)
		{
			System.out.println(num+"  Even Number");
		}
		else
		{
			System.out.println(num+" Odd Number");
		}
	}

}
