
public class ReversetheString {
	public static void main(String[] args) {
		String n="Hello World";
		String a[]=n.split(" ");
		String s="";
		for(int i=0;i<a.length;i++)
		{
			s=a[i]+" "+s;
		}
		System.out.println(s);
	}

}
