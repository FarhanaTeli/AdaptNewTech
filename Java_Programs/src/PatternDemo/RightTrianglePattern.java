package PatternDemo;

import java.util.Scanner;

public class RightTrianglePattern {

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
		//outer loop for rows  
		for(i=0; i<row; i++)   
		{   
		//inner loop for columns  
		for(j=0; j<=i; j++)   
		{   
		//prints stars   
		System.out.print("* ");   
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println();   
		}   

	}

}
