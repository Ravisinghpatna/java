package collection;

import java.util.HashMap;

public class HashmapEx1 {

	public static void main(String[] args) 
	{
		HashMap<String,Object> hm=new HashMap <String,Object>();
		hm.put("Amit",9999);
		hm.put("Sumit",8888);
		hm.put("Tauqeer",7777);
		hm.put("Dashrath",6666);
		hm.put("Raushan",5555);
		hm.put("Dinesh",4444);
		hm.put("Aajith",3333);
		hm.put("Dashrath",2222);
		
		System.out.println(hm);
	
		for(Object n :hm.keySet())
		{
			System.out.println(n);
		}

	}

}


