
public class Student {

	int sroll;
	String sname;
	String sbg;
	String ssub;
	long smobno;
	
	void setData(int roll,String name, String bg, String sub, long mobno)
	{
		/*this.sroll=sroll;
		this.sname=sname;
		this.sbg=sbg;
		this.ssub=ssub;
		this.smobno=smobno;
		*/
		
		sroll=roll;
		sname=name;
		sbg=bg;
		ssub=sub;
		smobno=mobno;
	}

	/*public Student(int sroll,String sname, String sbg, String ssub, long smobno)
	{
		/*sroll=roll;
		sname=name;
		sbg=bg;
		ssub=sub;
		smobno=mobno;*/
		
	/*	this.sroll=sroll;
		this.sname=sname;
		this.sbg=sbg;
		this.ssub=ssub;
		this.smobno=smobno;
	}
	*/

	void display() {
		System.out.println(sroll);
		System.out.println(sname);
		System.out.println(sbg);
		System.out.println(ssub);
		System.out.println(smobno);
	}

	public static void main(String[] args) {

		//Assigning the value to class using object reference (Directly)
		/*	Student s1=new Student();
		s1.sroll=15;
		s1.sname="RamShiyaRam";
		s1.sbg="A+";
		s1.ssub="Testing";
		s1.smobno=7903444241l;

		Student s2=new Student();
		s2.sroll=16;
		s2.sname="ShivJi";
		s2.sbg="O+";
		s2.ssub="Development";
		 s2.smobno=8809604121l;

		s1.display();
		s2.display();
		 */

		//Assigning the value of class using Constructor
	/*	Student s1=new Student(15,"Ravi","A+","Testinnn",123456789l);
	 * Student s2=new Student(16,"vaishnavi","B+","Development",890344421l);
		s1.display();
		*/
		
		//Assigning the value of class using Method
		
		Student s1=new Student();
		s1.setData(20, "Ravan", "B+", "Devoops", 9999999999l);
		
		Student s2=new Student();
		s2.setData(27, "Rani", "N+", "Phytho", 9876543210l);
		s2.display();
		System.out.println();
		s1.display();
		
		


	}

}
