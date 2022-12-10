package collection;

import java.util.HashSet;

public class HashSetHetrogeneous {

	public static void main(String[] args) {
		HashSet<Object>hs=new HashSet<Object>();
			hs.add(100);
			hs.add(100);
			hs.add("Ravi singh");
			hs.add(24999.9f);
			hs.add('r');
			hs.add(2199.99);
			hs.add(1234567890l);
			
		HashSet<Object>hs1=new HashSet<Object>();
			{
				hs1.add("singh");
				hs1.add(100);
		     	hs1.add(233.9f);
		     	hs1.remove('r');
				
		     	hs1.addAll(hs);
				
			
			 }
		
			System.out.println("printing element");
			for(Object n :hs1)
			{
				System.out.println(n);
			}
			System.out.println();
		
	}
		}
	

	

