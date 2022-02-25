public class GenericMethodDemo 
{
	public <E>void displayArrayElements(E[] elements)
	{
		for(E element:elements)
		{
			System.out.println("Array Elements is: "+element);
		}
		
	}
	public static void main(String[] args) 
	{
		GenericMethodDemo test=new GenericMethodDemo();
		Integer[] intArray= {2,3,4,7};
		String[] strArray= {"Java", "Programming", "Learning"};
		System.out.println("Integer Array Elements......");
		test.displayArrayElements(intArray);
		System.out.println("String Array Elements........");
		test.displayArrayElements(strArray);

	}

}
