package ExceptionHandling;

public class ExceptionString {

	public static void main(String[] args) 
	{
		String country=null;
		try
		{
			if(country.equals("India"))
			{
				System.out.println("Independence Nation Decleared In August");
			}
			else
			{
				System.out.println("Invalid");
			}
		}
		
			catch(NullPointerException e )
					{
						System.out.println(e);//Printing cause of Exception Occured
					}
		System.out.println("Completed");
	}	

}
