package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

class Student
{
	int id;
	String name;
	int grade;
	
	public Student(int id, String name, int grade)
	{
		this.id = id;
		this.name = name;
		this.grade = grade;
	}

	public String toString() {
		String str="Student is [id=" + id + ", name=" + name + ", grade=" + grade + "]";
		return str;
	}	
}
class Employee
{
	int id;
	String name;
	String email;
	Float salary;
	public Employee(int id, String name, String email, Float salary)
	{
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}
	public String toString() {
		String str= "Employee [id=" + id + ", name=" + name + ", email=" + email + ", salary=" + salary + "]";
	    return str;
	}	
}
public class ArrayListDemo {
    @SuppressWarnings("removal")
	public static void main(String[] args) {
		Student s1=new Student(101,"Harry",10);
		Student s2=new Student(102,"Potter",10);
		Integer i=new Integer(100);
		String s="Collection Example";
		Float f=new Float(22.22f);
		Character ch=new Character('C');
		Employee e1=new Employee(101,"Harry","harry@gmail.com",40000.0f);
		Employee e2=new Employee(102,"Potter","potter@gmail.com",41000.0f);
		Employee e3=new Employee(103,"Thor","thor@gmail.com",45000.0f);
		Employee e4=new Employee(104,"Hulk","hulk@gmail.com",40000.0f);
		
		ArrayList al1=new ArrayList();
		al1.add(0,i);
		al1.add(1,s);
		al1.add(s1);
		al1.add(s2);
		System.out.println("Size: "+al1.size());
		
		ArrayList al2=new ArrayList(al1);
		al2.add(e1);
		al2.add(e2);
		al2.add(e3);
		al2.add(e4);
		//al2.addAll(al1);
		System.out.println("Size: "+al2.size());
		
		Iterator i1=al2.iterator();
		while(i1.hasNext())
		{
			Object o=i1.next();
			System.out.println(o);
		}

	}

}
