package ExceptionHandling;

public class AIOOBE {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		try
		{
			
		int x=a[0]+100;
		System.out.println(x);
		int y=a[1]-20;
		System.out.println(y);
		int z=a[4]*2;
		System.out.println(z);
		 
		System.out.println("operation completed");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("DONE");
		
	}

}
