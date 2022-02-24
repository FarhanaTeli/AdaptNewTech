package PatternDemo;

import java.util.Scanner;

public class DimondShapePattern {

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
		int space=1;
		int i,j;
		space = row - 1;  
		for (j = 1; j<= row; j++)  
		{  
		for (i = 1; i<= space; i++)  
		{  
		System.out.print(" ");  
		}  
		space--;  
		for (i = 1; i <= 2 * j - 1; i++)  
		{  
		System.out.print("*");  
		}  
		System.out.println("");  
		}  
		space = 1;  
		for (j = 1; j<= row - 1; j++)  
		{  
		for (i = 1; i<= space; i++)  
		{  
		System.out.print(" ");  
		}  
		space++;  
		for (i = 1; i<= 2 * (row - j) - 1; i++)  
		{  
		System.out.print("*");  
		}  
		System.out.println("");  
		}  

	}

}
