package RaghuSir;
import java.util.Scanner;
class FirstCapital
{
	static String convertWordsFirstToCapital(String str)
	{
		char ch[]=str.toCharArray();
		for (int i=0;i<ch.length;i++)
		{
			if(i==0 && ch[i]!=' ' ||ch[i]!=' '&& ch[i-1]==' ')
			{
				if(ch[i]>='a' && ch[i]<='z')
					ch[i]=(char)(ch[i]-32);
			}
			else if(ch[i]>='A' && ch[i]<='Z')
				ch[i]=(char)(ch[i]+32);
		}
		String rev=new String(ch);//Array to String
		return rev;
	}

	public static void main(String[]arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String st=sc.nextLine();
		String Is=convertWordsFirstToCapital(st);
		System.out.println(Is);
	}
}