package Array;
class Student1
{
	public int rollno;
	public String name;
	Student1(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}	
}
public class ArrayOfObject {

	public static void main(String[] args) {
		// declares an Array of integers.
		Student1[] arr;
		
		//allocating memory for 5 objects of type student
		arr=new Student1[5];
		
		//initialize the first elements of the array
		arr[0]=new Student1 (1,"Raj");
		
		//initialize the second elements of the array
		arr[1]=new Student1 (2,"Rahul");
		
		// so on......
		arr[2]=new Student1 (3,"Rakhi");
		arr[3]=new Student1 (4,"John");
		arr[4]=new Student1 (5,"Raju");
		
		//accessing the elements of the specified array
		for(int i=0; i<arr.length; i++)
			System.out.println("Element at "+i+":"+arr[i].rollno+" "+arr[i].name);
	}

}
