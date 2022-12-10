package collection;
import java.util.ArrayList;

	public class Driver {
		
		public static void main(String [] arg)
		{
			ArrayList<Object> ob=new ArrayList<Object>();
				
			ob.add(new Student(201,"Meena","student1"));
			ob.add(new Student(102,"ajay","student2"));
			ob.add(new Student(108,"pooja","student3"));
			ob.add(new Student(701,"kiran","student4"));
			
			for(Object i:ob)
			{
			System.out.println(i);
		}
		
		
		
		}
	}


