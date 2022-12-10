package AssignmentPackage;

public class ArrayMultiDimensional {

	public static void main(String[] args) 
	{
		//int a[][]=new int[3][2];
		
		int a[][]= { {100,200} ,{300,400},{500,600} };  
		System.out.println("number of rows:"+ a.length);
		System.out.println("number of columns:"+a[0].length);
	
		for(int r[]:a)
		{
			for(int i:r)
			{
				System.out.println(i);
			}
		
				
	}
	}
}

