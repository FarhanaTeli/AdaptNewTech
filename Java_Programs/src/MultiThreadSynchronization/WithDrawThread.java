package MultiThreadSynchronization;

public class WithDrawThread extends Thread{
	AClass obj;
	int amt;
	String msg;
	public WithDrawThread(AClass obj, int amt, String msg)
	{
		this.obj = obj;
		this.amt = amt;
		this.msg = msg;
	}
	@Override
	public void run() 
	{
		try
		{
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			
		}
		System.out.println("Withdraw message");
		obj.withdraw(amt);
	}	

}
