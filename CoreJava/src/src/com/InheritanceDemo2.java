package src.com;

//MultiLevel Inheritance
class Animal
{
	void eat()
	{
	System.out.println("eating.......");	
	}
}
class Dog extends Animal
{
	void bark() {
		System.out.println("barking.......");
	}
}
class BabyDog extends Dog
{
	void weep() {
		System.out.println("weeping.....");
	}
}
public class InheritanceDemo2 {

	public static void main(String[] args) {
		BabyDog bd=new BabyDog();
		bd.eat();
		bd.bark();
		bd.weep();
	}

}
