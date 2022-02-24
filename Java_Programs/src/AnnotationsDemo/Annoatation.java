package AnnotationsDemo;
import java.lang.annotation.Annotation;
@SmartPhone1()
//@SmartPhone1(os1="Android", version1=6)
class Nokia_Series
{
String model;
int screensize;
public Nokia_Series(String model, int screensize) {
	this.model = model;
	this.screensize = screensize;
}
}
public class Annoatation {
	public static void main(String[] args) {
		Nokia_Series obj=new Nokia_Series("Fire", 4);
		System.out.println(obj.model);
		System.out.println(obj.screensize);	
		
		Class c=obj.getClass();
		Annotation an=c.getAnnotation(SmartPhone1.class);
		SmartPhone1 s=(SmartPhone1)an;
		
		System.out.println(s.os1());
		System.out.println(s.version1());
	}

}
