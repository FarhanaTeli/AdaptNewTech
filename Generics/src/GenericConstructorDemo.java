public class GenericConstructorDemo {
	private double v;
	public <T extends Number>GenericConstructorDemo(T t)
	{
		v=t.doubleValue();
	}
	void show()
	{
		System.out.println("Valu of v is: "+v);
	}

	public static void main(String[] args) 
	{
		 System.out.println("Number to Double Conversion:");
		  GenericConstructorDemo obj=new GenericConstructorDemo(10);
		  obj.show();
		  
		  GenericConstructorDemo obj1=new GenericConstructorDemo(136.8F);
		  obj1.show();
	}

}
