package src.general;

public class VariablesDemo {

		// Class variable
		final static int a=1024;
		int b;
	    void func1() {
			final int c;
			c=10;
			System.out.println("Class Variable= "+a+" "+b);
			System.out.println("Local Variable= "+c);
	    //a=7890;
	    b=56;
	    System.out.println("Class Variable= "+a+" "+b);
	    }	
	    void func2() {
	    System.out.println("Clas Variable= "+a+" "+b);
	    }

	    public static void main(String[] args) {
	    	VariablesDemo obj=new VariablesDemo();
	    	System.out.println(obj.b);
	    	System.out.println(VariablesDemo.a);

	}

}
