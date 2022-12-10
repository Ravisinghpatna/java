package Practice;

public class SwapWithoutVar {
	
	public static void main(String[] args) {
		int a=20,b=30;
		
		a=a+b;
		b=a-b;
		a=a-b;
			
//		int c=a;
//		a=b;
//		b=c; 
		System.out.println(""+a);
		System.out.println(""+b);
		
	}

}
