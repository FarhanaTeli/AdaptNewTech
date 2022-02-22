package src.PracticePrograms;

public class SwitchCase {

	public static void main(String[] args) {
		int x = 1;
		
		switch(x)
		{
		case 1:
			System.out.println("The value of x is 1");
			
		case 2:
			System.out.println("The value of x is 2");
			break;
		case 3:
			System.out.println("The value of x is 3");
			break;
		default:
			System.out.println("The value of x is other than 1,2,3");
			break;
		}

	}

}
