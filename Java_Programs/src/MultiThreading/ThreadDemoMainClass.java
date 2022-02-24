package MultiThreading;

public class ThreadDemoMainClass {

	public static void main(String[] args) {
		ThreadDemo thread1=new ThreadDemo(2000,"First");
		ThreadDemo thread2=new ThreadDemo(3000,"Second");
		
		thread1.start();
		thread2.start();
		try
		{
			thread1.join();
			thread2.join();
		}
		catch(Exception e)
		{
		}
			for(int i=0; i<10; i++)
			{
				try
				{
					Thread.sleep(1000);
				}
				catch(Exception e)
				{
				}
				System.out.println("Main"+i);
			}

	}

}
