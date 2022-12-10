package collection;

import java.util.ArrayList;

public class FloatType {
	float salary;
	float price;
	
	
	public FloatType(float salary,float price)
	{
		this.salary=salary;
		this.price=price;
	}
	public FloatType(Float price)
	{
		this.price=price;
	}
	public String toString() {
		return " FLoatType "+salary +"  "+ price;
	}
	
	public static void main(String[] args) {
		
		ArrayList<Object>f=new ArrayList<Object>();
		f.add(new FloatType(9999.99f ,123.4f));
		f.add(new FloatType(8978.999f , 97.97f));
		f.add(new FloatType(9956.7f));
		
		for(Object i:f)
		{
			System.out.println(i);
	
		}
		
	}

}
