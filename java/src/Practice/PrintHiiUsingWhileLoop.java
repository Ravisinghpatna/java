package Practice;
import java.util.Scanner;
public class PrintHiiUsingWhileLoop {
public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
System.out.println("Enter the range");
int s=sc.nextInt();
System.out.println("Enter the Second Range");
int s1=sc.nextInt();

while(s<=s1)
{
	System.out.println("Hii");
	s++;

}

	}
}
