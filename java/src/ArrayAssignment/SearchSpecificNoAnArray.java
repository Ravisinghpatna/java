package ArrayAssignment;

public class SearchSpecificNoAnArray {

	public static void main(String[] args) {
		int ar[]= {12,23,43,54,53,57};
		int search=23;
		boolean flag=false;
		
		for(int i=0;i<ar.length;i++)
		{
			if(search==ar[i])
			{
				System.out.println("element fount at: "+i);
				flag=true;
				break;
			}
			
		}
		if(flag==false)
		{
			System.out.println("element  not fount "
					+ "");
		}
	}
}
 