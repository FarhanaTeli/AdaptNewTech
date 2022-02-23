package general;
class Sample
{
	int a=10;
	public int b=20;
	private int c=30;
	protected int d=40;
	void disp()
	{
		System.out.println(a+b+c+d);
	}
}
class Derived extends Sample
{
	void disp1()
	{
		/*
		 * private class cannot be accessible within the subclass inside the same
		 * package.
		 * 
		 * //System.out.println(a+b+c+d);
		 */		
		System.out.println("Sum of a+b+d= "+(a+b+d));
	}
}
public class AccessSpecifierDemo {

	public static void main(String[] args) {
		System.out.println("Hello");
		Sample s=new Sample();
		s.disp();
		Derived d=new Derived();
		d.disp1(); //error occur like (the field Sample.c is not visible) because it is private
		

	}

}
