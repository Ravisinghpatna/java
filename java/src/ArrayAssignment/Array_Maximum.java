package ArrayAssignment;

public class Array_Maximum {

	public static void main(String[] args) {
		int ar[]={13,15,18,20,25,23};
		int max = ar[0];
	
	for(int i=0;i<ar.length;i++)
	{
		if(ar[i]>max)
		{
			max=ar[i];
		}
	}
	System.out.println(max);
	}

}
