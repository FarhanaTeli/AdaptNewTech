package CollectionFramework;

public class ConsumerTask implements Runnable{
	private Buffer buffer;
	public ConsumerTask(Buffer buffer)
	{
		this.buffer=buffer;
	}
	@Override
	public void run()
	{
		try
		{
			//delay to make sure producer start first
			Thread.sleep(30);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		buffer.get();
	}
  
}
