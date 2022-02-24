package ExceptionHandling;
import java.util.Scanner;
public class throwException1 {
	static void validate(int age) 
	{
		if(age<18)
			throw new ArithmeticException("Not valid");
		else
			System.out.println("Welcome to vote");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the age");
		int age=sc.nextInt();
		try
		{
			validate(age);
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
		}
		System.out.println("Rest of the code....");

	}

}
