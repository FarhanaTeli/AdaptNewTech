package MultiThreadSynchronization;

import java.util.Scanner;

public class AccountMainClass {
	static int Balance=10000;

	public static void main(String[] args) {
		AClass a=new AClass();
		
		DepositThread dt1=new DepositThread(a,5000,"First"); 
		DepositThread dt2=new DepositThread(a,4000,"Second"); 
		WithDrawThread wt1=new WithDrawThread(a,1000,"First");
		WithDrawThread wt2=new WithDrawThread(a,10000,"Second");
		System.out.println("Enter your choice: ");
		System.out.println("1.Deposit");
		System.out.println("2.Withdraw");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		if(choice==1)
		{
			dt1.start();
			dt2.start();
		try
		{
			dt1.join();
			dt2.join();
		}
		catch(Exception e)
		{
			
		}
	    }
		else if(choice==2)
		{
			wt1.start();
			wt2.start();
			try
			{
				wt1.join();
				wt2.join();
			}
			catch(Exception e)
			{
				
			}
		}
		else
		{
			System.out.println("Invalid Input....");
		}
		System.out.println("Total Balance is : "+Balance);
		
	}

}
