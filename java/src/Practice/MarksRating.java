package Practice;



public class MarksRating {

	public static void main(String[] args) {
							//		45 to 59  Third Grade
							//		60 to 79 Second Grade
							//		80 to 100 First Grade
							//		other wise fail
		java.util.Scanner sc= new java.util.Scanner(System.in);
		System.out.println("Enter the numbber");
		int marks =sc.nextInt();
		
		if(marks>=45 && marks <=59)
		{
			System.out.println("Third Grade");
		}
		else if(marks >=60 && marks <=79)
		{
			System.out.println("Second Grade");
		}
		else if(marks >=80 && marks <=100)
		{
			System.out.println("First Grade");
		}
		else if(marks >100)
		{
			System.out.println("Bsdk tere baap ka School hai kya");
		}
		else if(marks >=33 && marks <45)
		{
			System.out.println("Pass ");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	
	

}
