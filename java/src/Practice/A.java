package Practice;

public class A
{
	int i;
	void display()
	{
		System.out.println(i);
	}
}

	class B extends A
	{
	int j;
	void display()
		{
		System.out.println(j);
		}

	public static void main(String[] args) 
	{
		
		B ob=new B();
		ob.i=1;
		ob.j=2;
		ob.display();
	
		
	}
}
