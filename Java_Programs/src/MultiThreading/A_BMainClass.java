package MultiThreading;

public class A_BMainClass {
	public static void main(String[] args)
	{
		A a1=new A(10,1,"FIRST");
		A a2=new A(5,0,"SECOND");
		B b1=new B("Farah");
		
		Thread t1=new Thread(a1);
		Thread t2=new Thread(a2);
		Thread t3=new Thread(b1);
		t3.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		
		try
		{
			t1.join();
			t2.join();
			t3.join();
		}
		catch(Exception e)
		{
		}
		System.out.println("HAVE A NICE DAY!!!!!");	
	}

}
