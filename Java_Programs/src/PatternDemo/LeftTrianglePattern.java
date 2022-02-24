package PatternDemo;
import java.util.Scanner;
public class LeftTrianglePattern {

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
		
		//i for rows and j for columns      
		int i, j;       
		//Outer loop work for rows  
		for (i=0; i<row; i++)   
		{  
		//inner loop work for space      
		for (j=2*(row-i); j>=0; j--)         
		{  
		//prints space between two stars      
		System.out.print(" ");   
		}   
		//inner loop for columns  
		for (j=0; j<=i; j++ )   
		{   
		//prints star      
		System.out.print("* ");   
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println();   
		}   

	}

}
