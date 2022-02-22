package src.com;
// All WrapperClassDemo available in stack area
public class WrapperClassDemo {

	public static void main(String[] args) {
		//UnBoxing
		Integer i=new Integer(10);
		System.out.println("i= "+i);
		int b=i.intValue();
		System.out.println("b= "+b);
		
		//AutoBoxing
		int a=100;
		Integer i1=a;
		System.out.println("i1= "+i1);
		
	}

}
