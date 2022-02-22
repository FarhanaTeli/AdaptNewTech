package src.com;
class Animal3
{
	int legs;
	String name;
	String color;
	
	public Animal3() {   //constructor1
		System.out.println("This is default constructor");
	}

	public Animal3(String name) {   //constructor2
		this();
		this.name = name;
	}

	public Animal3(String name, String color) {   //constructor3
		this(name);
		this.color = color;
	}

	public Animal3(int legs, String name, String color) {    //constructor4
		this(name,color);
		this.legs = legs;
	}
	
	void display()
	{
		System.out.println("Animal Description:");
		System.out.println(color+" "+"color"+" "+name+" "+"with"+" "+legs+" "+"legs.");
	}	
}
public class ThisDemo {

	public static void main(String[] args) {
		Animal3 obj1=new Animal3(4,"Cat","White");
		obj1.display();
		
		Animal3 obj2=new Animal3("Dog","Brown");
		obj2.display();
		
		Animal3 obj3=new Animal3("Horse");
		obj3.display();

	}

}
