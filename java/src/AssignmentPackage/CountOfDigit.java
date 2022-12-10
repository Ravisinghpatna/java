package AssignmentPackage;

public class CountOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a=6452;
	int count=0;
	while(a>0)
	{
		count++;
		a=a/10;
	}
	System.out.println(count);
	}}