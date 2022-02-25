interface MinMax<T extends Comparable<T>>
{
	T min();
	T max();
}
public class GenericInterfaceDemo<T extends Comparable<T>>
implements MinMax<T>
{
	   T[] values; 
	public GenericInterfaceDemo(T[] values) 
	{
		this.values = values;
	}

	@Override
	public T min() {
		T t1=values[0];
		
		 for (int i = 1; i < values.length; i++)
	            if (values[i].compareTo(t1) < 0)
	                t1 = values[i];
		 return t1;
	}

	  @Override public T max() {
		  T t1=values[0];
	  
	      for (int i = 1; i < values.length; i++) 
		       if (values[i].compareTo(t1) > 0) t1 =values[i]; 
	      return t1; }
	 

	public static void main(String[] args) 
	{
		Integer arr[] = { 3, 6, 2, 8, 6 };
		GenericInterfaceDemo<Integer> obj1=new GenericInterfaceDemo<Integer>(arr);
		
		System.out.println("Minimum value is : "+obj1.min());
		System.out.println("Minimum value is : "+obj1.max());
	}

}
