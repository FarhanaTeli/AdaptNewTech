import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EmployeeMainClass 
{
	public static void main(String[] args) 
	{
     Employee e1=new Employee(103,"Alex","Senior Manager",60000);
     Employee e2=new Employee(104,"John","HR",70000);
     Employee e3=new Employee(105,"Johnny","Associate",40000);
     Employee e4=new Employee(106,"Rose","Manager",50000);
     
     List<Employee> l1=new ArrayList<Employee>();
     l1.add(new Employee(101,"Smith","Leader",60000));
     l1.add(new Employee(102,"Lisa","Sr Associate",80000));
     l1.add(e1);
     l1.add(e2);
     l1.add(e3);
     l1.add(e4);
     System.out.println("Elements in non sequential order......");
     Stream<Employee> estream=l1.parallelStream();
     estream.forEach(System.out::println);
     
     System.out.println("---------------------------------------");
     
     System.out.println("Elements in sequence order....");
     Stream<Employee> estream1=l1.stream();
     estream1.forEach(System.out::println);
	}
}
