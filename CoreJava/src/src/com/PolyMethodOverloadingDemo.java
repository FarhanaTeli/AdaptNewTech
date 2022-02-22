package src.com;

public class PolyMethodOverloadingDemo {
	int add(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
	float add(float a,float b)
	{
		float sum=a+b;
		return sum;
	}
	
	float add(int a,float b,int c)
	{
		float sum=a+b+c;
		return sum;
	}
	float add(float a,int b,int c)
	{
		float sum=a+b+c;
		return sum;
	}
	
	public static void main(String[] args) {
		PolyMethodOverloadingDemo pm=new PolyMethodOverloadingDemo();
		System.out.println(pm.add(2, 3));
		System.out.println(pm.add(2.1f, 3.3f));
		System.out.println(pm.add(4, 3.1f, 2));
		System.out.println(pm.add(2.1f, 3, 2));
	}

}
