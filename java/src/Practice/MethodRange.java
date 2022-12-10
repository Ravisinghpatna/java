package Practice;

public class MethodRange {
	public  void call(int a, int b)
	{
		System.out.println("sum is "+ (a+b));
		System.out.println("Difference is "+ (a-b));
		System.out.println("Division is "+(a/b));
		System.out.println("Mod is "+ (a%b));
		System.out.println("Product is "+(a*b));
		System.out.println("------------------");
	}

	public static void main(String[] args) {
		
		MethodRange mr=new MethodRange();
		mr.call(10,50);
		mr.call(5,10);
		mr.call(45,762);
		mr.call(345,2);
		mr.call(435,762);
		
		test();

	}
	public static void test()
	{
		System.out.println("All operations are executed");
	}

}
