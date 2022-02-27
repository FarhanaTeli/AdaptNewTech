
public class Employee 
{
	int eid;
	String ename;
	String des;
	float salary;
	public Employee(int eid, String ename, String des, float salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.des = des;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", des=" + des + ", salary=" + salary + "]";
	}
	
}
