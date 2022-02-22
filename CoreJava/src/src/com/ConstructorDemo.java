package src.com;

class Student
{
	int id;
	String name;
	String course;
	String email;
	
	Student(){
		
	}
	
	public Student(int id, String name, String course, String email) {
		
		this.id = id;
		this.name = name;
		this.course = course;
		this.email = email;
	}
	
	

	public Student(String name, String course) {
		
		this.name = name;
		this.course = course;
	}

	public void display() {
		System.out.println("Student Information:");
		System.out.println(id+" "+name+" "+course+" "+email);
	}
}

public class ConstructorDemo {

	public static void main(String[] args) {
		Student s=new Student();
		s.id=1;
		s.name="Farhana";
		s.course="CoreJava";
		s.email="fara@gmail.com";
		s.display();
		
		Student s1=new Student(2,"Zoya","BSc","afghi");
		s1.display();
		
		Student s2=new Student("Zain","Pharmacy");
		s2.display();

	}

}
