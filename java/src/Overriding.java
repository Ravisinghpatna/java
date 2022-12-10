
public class Overriding {
	void test()
	{
		System.out.println("hello");
	}
	
}
class B extends Overriding
{
	void test() 
	{
		System.out.println("world");
	}


	
	public static void main(String[] args) {
		
		

		B b1=new B();
		b1.test();
		
//		Overriding o=new Overriding();
//		o.test();
	}
}
