import java.util.Scanner;
public class StringReverse {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the name");
			String n=sc.nextLine();
			String s="";
			int count=0;
			
			for(int i=0;i<n.length();i++)
			{
				s=n.charAt(i)+s;
				count++;
			}
		//	System.out.println(s);
			
			String []s1=s.split(" ");
			String s2="";
			
			for(int i=0; i<s1.length; i++)
			{
				s2=s2+s1[i];
			}
			
			System.out.println(s2);
			//System.out.println(s2.length());
			
			
	}

}
