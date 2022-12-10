package collection;

import java.util.HashSet;

public class Mobile
	{
	
		String brand;
		double price;
		
		
		public Mobile(String brand,double price)
		{
			this.brand=brand;
			this.price=price;
			
		}
		
		public Mobile(double price,String brand)
		{
			this.price=price;
			this.brand=brand;
			
			
		}
		public String toString() 
		{
			return brand+"  "+price;
		}

		
		
		
		public static void main(String[] aargs)
			{
			HashSet<Mobile>h=new HashSet<Mobile>();
			h.add(new Mobile("Mi",35000));
			h.add(new Mobile("Samsung",14500));
			h.add(new Mobile("Xiaomi",7000));
			h.add(new Mobile("Oppo",35500));
			h.add(new Mobile("Poco",15000));
			
			for(Mobile a:h)
					{
				System.out.println(a);
				
					}
			}
		}
