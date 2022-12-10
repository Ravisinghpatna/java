
public class Fibonacci_Series {

	public static void main(String[] args) {
		int m=8;
		int x=0,y=1,z;
		
		for(int i=1;i<=m;i++)
		{
			System.out.print(x+" ");
			z=x+y;
			x=y; 
			y=z;
			
			
		}

	}

}
