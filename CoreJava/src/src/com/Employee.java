package src.com;

public class Employee {
	int id;
	String name;
	String email;
	float salary;
	
	public Employee()
	{
		
	}

	public Employee(int id, String name, String email, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}
	public Employee(int id)
	{
		this.id=id;
	}
	
	public String toString()
	{
	String str="("+id+","+name+","+email+","+salary+")";
	return str;
	}

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.id=101;
		e1.name="Farhana";
		e1.email="zozafa";
		e1.salary=54.34f;
		System.out.println(e1.toString());
		
		Employee e2=new Employee();
		e2.id=102;
		System.out.println(e2.toString());
	}

}
