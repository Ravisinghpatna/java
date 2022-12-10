package collection;
import java.util.Iterator;
import java.util.HashSet;
public class HashSetEx1
	{
		public static void main(String[] args) 
		{
		HashSet<Integer>obj=new HashSet<Integer>();
		obj.add(100);
		obj.add(100);
		obj.add(100);
		obj.add(200);
		obj.add(380);
		obj.add(400);
		System.out.println("printing element");
		for(Object sc :obj)
				{
			System.out.println(sc);
				}
		System.out.println("printing element using Iterator");
		Iterator<Integer> a=obj.iterator();
		
		while(a.hasNext())
				{
			System.out.println(a.next());
				}
		}
	}
