package ArrayAssignment;

public class CalculateTheSumOfArray {

	public static void main(String[] args) {
		int []a= new int[2];
		int sum=0;
		for(int i=0;i<a.length;i++)
			sum=sum+a[i];
		System.out.println("sum of a :"+ sum);
	}

}
