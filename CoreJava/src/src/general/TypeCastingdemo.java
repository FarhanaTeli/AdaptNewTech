package src.general;

public class TypeCastingdemo {

	public static void main(String[] args) {
		// widening/implicit typecasting
		
		byte b=12;
		float f=b;
		System.out.println("float: "+f);
		
		float f1=22.14f;
		double d=f1;
		System.out.println("double value: "+d);
		
		char ch='A';
		int i3=ch;
		System.out.println("int3 value: "+i3);
		
		char var1='\u00A7';
		int i4=var1;
		System.out.println("int4 value: "+i4);
		
		//narrowing/explicit typecasting
		
		double d1=10.532;
		long l=(long)d1;
		System.out.println("long value: "+l);
		
		float f2=34.56f;
		int i1=(int)f2;
		System.out.println("int1 value: "+i1);
		
		long l1=922337206854775806L;
		int i2=(int)l1;
		System.out.println("int2 value: "+i2);
		
		byte b1=90;
		char ch1=(char)b1;
		System.out.println("char1 value: "+ch1);
		
		
	}

}
