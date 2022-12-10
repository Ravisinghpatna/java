package collection;

import java.util.TreeSet;

public class TreeEx {

	public static void main(String[] args) 
	{
		TreeSet<Integer>te=new TreeSet<Integer>();
				{
			te.add(100);
			te.add(100);
			te.add(100);
			te.add(2000);
			te.add(3000);
			te.add(4000);
			te.add(5000);
			
			System.out.println(te);
			for(Integer t:te)
			{
				System.out.println(t);
			}
				}
		
	}

}
