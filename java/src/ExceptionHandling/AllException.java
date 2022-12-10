package ExceptionHandling;
import java.util.InputMismatchException;
import java .util.Scanner;
public class AllException {
	
	

		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name");
		String str=sc.next();
		
		try
		{
			print(str);
		}
		catch(InputMismatchException ob)
		{
			
		}
		
		catch(StringIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
	finally
	{
		System.out.println("String last index length -1");
	}
		System.out.println("completed");
	}
		
				
				public static void print(String n)
					{
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the index no");
				int l=sc.nextInt();
				
				char c=n.charAt(l);
				System.out.println(c);
					}
				}









