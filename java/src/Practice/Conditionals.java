package Practice;
import java.util.Scanner;

public class Conditionals {

	public static void main(String[] args) {	
	
		
		
		int a,b,c,add;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the first number");
		a=sc.nextInt();
		System.out.println("enter the second number");
		b=sc.nextInt();
		System.out.println("enter the third number");
		c=sc.nextInt();
		
		add=(a>b)? (a>c ? a :c):(b>c ? b :c);
		System.out.println(add);
		
		
		
//		if(a>b && a>c)
//	{
//		System.out.println("A is greater "+a);
//	}
//	else if(b>c)
//	{
//		System.out.println("X is a greater "+b);
//	}
//	else
//	{
//		System.out.println("Y is a greater "+c);    
	} 
	}
