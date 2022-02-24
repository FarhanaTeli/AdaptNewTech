package MultiThreadSynchronization;

public class AClass {
	int balance;
synchronized void deposit(int amt)
	{
		System.out.println("Getting Balance......");
		int newbalance=getBalance();
		balance=newbalance+amt;
		setBalance(balance);
		
	}
synchronized void withdraw(int amt)
{
	System.out.println("Getting Balance.......");
	int oldbalance=getBalance();
	if(amt>oldbalance)
	{
		System.out.println("Insufficient Balance!!!!");
	}
	else
	{
		balance=oldbalance-amt;
	}
	setBalance(balance);
}
int getBalance()
{
	return AccountMainClass.Balance;
}
void setBalance(int amt) {
	try
	{
		Thread.sleep(3000);
	}
	catch(Exception e)
	{
		
	}
	AccountMainClass.Balance=amt;
	
}


}
