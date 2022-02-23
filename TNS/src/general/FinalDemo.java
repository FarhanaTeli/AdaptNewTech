package general;

public class FinalDemo {
	int a;
	final int b=10;
	
	final void m1()
	{
		a=4;
		System.out.println(a);
		//b=2;
	}
	void m2()
	{
	   	
	}

	public static void main(String[] args) {
		FinalDemo f=new FinalDemo();
		f.m1();

	}

}

  class Derived1 extends FinalDemo { 
	  void m2() 
	  {
  
      }
	  }
 