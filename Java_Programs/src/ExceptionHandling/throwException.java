package ExceptionHandling;

public class throwException {

	public static void main(String[] args) {
		int a=20;
		int b=0;
		int p=5;
		
		int[] x=new int[4];
		
		try
		{
			if(b==0)
				throw new ArithmeticException ("This is arithmetic exception");	
			else
				a=a/b;
			System.out.println("a= "+a);
			x[p]=10;
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae.getMessage());
		}
		
		  catch(Exception ae) 
		{ 
			  System.out.println(ae.getMessage());
	    }
		 
		
	}

}
