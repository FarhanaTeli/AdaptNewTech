package src.com;
abstract class Bank1
{
	abstract float getRateOfInterest();
	void display()
	{
		System.out.println("Abstract Class");
	}
}
class SBI1 extends Bank1
{

	@Override
	float getRateOfInterest() {
		return 5.0f;
	}
	
}
class HDFC1 extends Bank1
{

	@Override
	float getRateOfInterest() {
		return 6.5f;
	}
	
}
class ICICI1 extends Bank1
{

	@Override
	float getRateOfInterest() {
		return 9.5f;
	}
	
}
public class AbstractionDemo {
	public static void main(String[] args) {
		Bank1 bk=new SBI1();  //Dynamic Binding(assigning child class object to parent class reference variable)
		bk.display();
		System.out.println("SBI bank rate of interest is: "+bk.getRateOfInterest());
		
		Bank1 bk1=new HDFC1();
		bk.display();
		System.out.println("HDFC bank rate of interest is: "+bk1.getRateOfInterest());
		
		Bank1 bk2=new ICICI1();
		bk.display();
		System.out.println("ICICI bank rate of interest is: "+bk2.getRateOfInterest());
		
	}
	

}
