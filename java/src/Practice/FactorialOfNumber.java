package Practice;
import java .util.Scanner;

public class FactorialOfNumber {
public static void main(String[] args) {
int s,fact=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number for Factorial");
s=sc.nextInt();

for(int i=1;i<=s;i++)
{
	fact=fact*i;
}
System.out.println(fact);


	
	
}
}
