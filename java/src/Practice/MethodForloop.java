package Practice;

public class MethodForloop 
	{
	public static void mainloop(int a, int b)
		{
			for(int i=a;i<=b;i++)
		{
			System.out.println(i);
		}
			
	}
		public static int sub(int a,int b)
	{
		System.out.println("sub method is loading...");
		return a+b;
	}

	public static void main(String[] args) {
		
		
		mainloop(10,15);
		int c=sub(50,17);
		System.out.println(c);
	}

}
