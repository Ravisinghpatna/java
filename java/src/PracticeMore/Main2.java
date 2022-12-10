package PracticeMore;
import java.util.Scanner;
public class Main2 {
public static void main(String[] args) {
	
Scanner sc=new Scanner(System.in);
System.out.println("Enter the year & check the year is leap year or not");
	int n=sc.nextInt();
	if(n%4==0&& n%100!=0||n%400==0)
	{
		System.out.println("Leap year "+n );	
	}
	else
	System.out.println(n+" not a leap year ");
		}
}
