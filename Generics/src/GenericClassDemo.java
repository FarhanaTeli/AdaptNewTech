class GenericTest<T>
{
	T obj;

	void add(T obj) {
		this.obj = obj;
	}

	T get() {
		return obj;
	}	
	
}
public class GenericClassDemo
{
	public static void main(String[] args) 
	{
		GenericTest<Integer> obj=new GenericTest<Integer>();
		obj.add(3);
		System.out.println("GenericIntegerDemo is: "+obj.get());

	}

}
