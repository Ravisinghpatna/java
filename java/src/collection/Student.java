package collection;

public class Student {
		int sid;
		String sname;
		String student;
		
		
		public Student(int sid,String sname,String student)
		{
			this.sid=sid;
			this.sname=sname;
			this.student=student;
		}


		@Override
		public String toString() {
			return student+"    "+sid+"   "+sname;
		}

	}


