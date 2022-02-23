package general;

public class This_Demo { 
	int num1;
	int num2;
	
	public This_Demo(int num1) {
		this.num1 = num1;
	}
	
	public This_Demo(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	void display() 
	{
		System.out.println("Num1= "+num1);
		System.out.println("Num2= "+num2);
	}

	public static void main(String[] args) {
		This_Demo obj=new This_Demo(100,150);
		obj.display();
		
		This_Demo obj1=new This_Demo(40);
		obj1.display();
		

	}

}
