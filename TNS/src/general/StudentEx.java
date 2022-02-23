package general;
class Student
{
	int sid;
	String sname;
	String college_name;
	
	public Student(int sid, String sname, String college_name) {
		this.sid = sid;
		this.sname = sname;
		this.college_name = college_name;
	}
	void getInfo()
	{
		System.out.println("Student id is: "+sid);
		System.out.println("Student name is: "+sname);
		System.out.println("Student college name is: "+college_name);
	}
	
}
public class StudentEx {

	public static void main(String[] args) {
		Student st=new Student(101,"Alex","BscIT");
		st.getInfo();
		Student st1=new Student(102,"John","MscIT");
		st1.getInfo();

	}

}
