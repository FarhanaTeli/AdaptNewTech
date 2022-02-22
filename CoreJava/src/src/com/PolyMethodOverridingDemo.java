package src.com;
class Bank
{
	float getRateOfInterest()
	{
		return 6.5f;
	}
}
class SBI extends Bank
{
	float getRateOfInterest()
	{
		return 7.5f;
	}
}
class HDFC extends Bank
{
	float getRateOfInterest()
	{
		return 7.0f;
	}
}
class ICICI extends Bank
{
	float getRateOfInterest()
	{
		return 8.9f;
	}
}
public class PolyMethodOverridingDemo {

	public static void main(String[] args) {
		/*
		 * SBI sb=new SBI(); System.out.println(sb.getRateOfInterest());
		 */
		
		Bank bk=new SBI();  //Dynamic Binding(assigning child class object to parent class reference variable)
		System.out.println("SBI bank rate of interest is: "+bk.getRateOfInterest());
		
		Bank bk1=new HDFC();
		System.out.println("HDFC bank rate of interest is: "+bk1.getRateOfInterest());
		
		Bank bk2=new ICICI();
		System.out.println("ICICI bank rate of interest is: "+bk2.getRateOfInterest());

	}

}
