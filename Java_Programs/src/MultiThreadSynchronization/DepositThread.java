package MultiThreadSynchronization;

public class DepositThread extends Thread{
	AClass obj;
	int amt;
	String msg;
	public DepositThread(AClass obj, int amt, String msg)  //Constructor
	{
		this.obj = obj;
		this.amt = amt;
		this.msg=msg;
	}
	@Override
	public void run() {
		try
		{
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			
		}
		System.out.println("Deposit Message");
		obj.deposit(amt);
	}
	
	
	

}
