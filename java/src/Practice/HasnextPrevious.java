package Practice;

import java.util.LinkedList;
import java.util.ListIterator;

public class HasnextPrevious 
{

	public static void main(String[] args) 
	{
		LinkedList<Object>li=new LinkedList<Object>();
	
		li.add(199);
		li.add('R');
		li.add("Rav");
		li.add(99999.9f);
		
		System.out.println("Printing elements forward direction");
		ListIterator<Object>ob=li.listIterator();
		while(ob.hasNext());
				{
			System.out.println(ob.next());
				}
		System.out.println("Printing backward directional");
	    	
		while(ob.hasPrevious());
			{
			System.out.println(ob.previous());
		
			
				
    }
		
	}

}
