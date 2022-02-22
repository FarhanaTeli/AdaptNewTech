//Primitive Data Types-Integer
public class IntDataType_Demo {

	public static void main(String[] args) {
		byte maxbyte=127;
		byte minbyte=-128;
		System.out.println("Min range of byte is: "+minbyte+" Max range of byte is: "+maxbyte);
		short maxshort=32767;
		short minshort=-32768;
		System.out.println("Min range of short is: "+minshort+" Max range of short is: "+maxshort);

		int maxint=2147483647;
		int minint=-2147483648;
		System.out.println("Min range of int is: "+minint+" Max range of int is: "+maxint);

		long maxlong=9223372036854775807L;
		long minlong=-9223372036854775808L;
		System.out.println("Min range of long is: "+minlong+" Max range of long is: "+maxlong);
		
		float f=434.141245678345f;
		double d=3.14141414141414;
		System.out.println("Float value is: "+f+" Double value is: "+d);

	}

}
