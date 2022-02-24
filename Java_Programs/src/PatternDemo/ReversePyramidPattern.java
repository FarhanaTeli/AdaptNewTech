package PatternDemo;
import java.util.Scanner;
public class ReversePyramidPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//row denotes the number of rows you want to print
		int row=0;
		try
		{
			System.out.println("Enter the number of rows: ");
			row=sc.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Please enter valid input.....");
		}
		
		for (int i= 0; i<= row-1; i++)  
		{  
		for (int j=0; j<=i; j++)  
		{  
		System.out.print(" ");  
		}  
		for (int k=0; k<=row-1-i; k++)  
		{  
		System.out.print("*" + " ");  
		}  
		System.out.println();  
		}  
	}

}
