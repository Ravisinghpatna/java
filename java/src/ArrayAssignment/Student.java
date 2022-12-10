package ArrayAssignment;

public class Student implements Comparable<Student>
{
int sid;
String name;
public Student (int sid,String name)
{
	this.sid=sid;
	this.name=name;
}
public String toString()
{
	return name+" "+sid;
}
public int compareTo(Student s)
{
	if(this.sid==s.sid)
		return 0;
	else if(this.sid>s.sid)
		return 1;
	else
		return -1;
	
}
}


	

