package ArrayAssignment;

public class Arraycheck {

	public static void main(String[] args) {

			int [][]a =new int [4][2];
			a[0][0]=100;
			a[0][1]=200;
			a[1][0]=300;
			a[1][1]=400;
			a[2][0]=500;
			a[2][1]=600;
			
		//	int a[][]= {{100,200},{300,400},{500,600}};
			
			System.out.println(a);
			System.out.println("rows of an array "+a.length);
			System.out.println("Column of an array "+a[0].length);
	}

}
