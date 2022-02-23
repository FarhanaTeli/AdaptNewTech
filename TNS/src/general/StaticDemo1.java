package general;
class Student1
{
	int sid;  //stack area
	String sname;   //stack area
	static String college_name="BscIT";     //static area
	
Student1(int id, String name){   //stack area (constructor)
	sid=id;
	sname=name;
}
static void func() {  //static area
	college_name="MscIT";
}
void getInfo()
{
	System.out.println("Student id is: "+sid);
	System.out.println("Student name is: "+sname);
	System.out.println("Student college name is: "+college_name);
	
}
}
public class StaticDemo1 {

	public static void main(String[] args) {
		Student1 st1=new Student1(101,"Alex");
		Student1 st2=new Student1(102,"John");
		st1.getInfo();
		st2.getInfo();
		Student1.func();
		st1.getInfo();
		st2.getInfo();
	

	}

}
