package collection;

import java.util.TreeSet;

public class MobileEx1 implements Comparable<MobileEx1>
	{
	String brand;
	float price;
	
	public MobileEx1(String brand, float price)
	{
		this.brand=brand;
		this.price=price;
		
	}
		
	
	@Override
	public String toString() 
	{
		return brand+" "+price;
	}
	public int compareTo(MobileEx1 mob)
	{
		if(this.price>mob.price)
			return 1;
		else if(this.price<mob.price)
			return -1;
		else
			return 0;
	}
	
	
	public static void main(String[] args) 
		{
		TreeSet<MobileEx1>t=new TreeSet<MobileEx1>();
		t.add(new MobileEx1("redmi",7000f));
		t.add(new MobileEx1("mi", 37000f));
		t.add(new MobileEx1("Black-shark",30000f));
		t.add(new MobileEx1("poco", 20000f));
		
		System.out.println(t);
		System.out.println();
	
				for(MobileEx1 m:t)
	{
		System.out.println(m);
	}
	}
		}
	
