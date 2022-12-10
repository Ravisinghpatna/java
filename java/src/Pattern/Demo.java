package Pattern;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
//		int a=0;
//		int b=2;
//		int c=3;
//		int d;
//		d=(a>b)?(a>c ? a: c):(b>c ? b: c);
//		System.out.println("Biggest number "+d);
//	
	
	
		int a,b,c,d;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first Number");
		a=s.nextInt();
		System.out.println("enter the Sceond Number");
		b=s.nextInt();
		System.out.println("enter the third Number");
		c=s.nextInt();
		
		d=(a>b)?(a>c ? a: c):(b>c ? b: c);
		System.out.println("Biggest Number is "+d);
	
	
	}
}
