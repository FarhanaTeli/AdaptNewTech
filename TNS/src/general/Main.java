package general;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter a value: ");
		int a=sc.nextInt();  
		System.out.println("Enter b value: ");
		int b=sc.nextInt();
		System.out.println("Sum is: "+(a+b));
		Main obj=new Main();
		System.out.println(obj.getClass());
		System.out.println(obj.hashCode());
		
	}

}

/*
 * Note: static go to static memory
 *  not static go to stack memory 
 *  object go to heap memory
 */