package AnnotationsDemo;
import java.lang.annotation.Annotation;
@SmartTV_Ann1(height = 14, os = "Linux", width=30)
class Samsung
{
	String model;
	double screensize;
	int price;
	public Samsung(String model, double screensize, int price) {
		this.model = model;
		this.screensize = screensize;
		this.price = price;
	}
	
	
}
public class Annoatation1 {

	public static void main(String[] args) {
		Samsung s1=new Samsung("TD40A", 81.3, 22696);
		System.out.println(s1.model);
		System.out.println(s1.screensize);
		System.out.println(s1.price);
		
		Class c=s1.getClass();
		Annotation an=c.getAnnotation(SmartTV_Ann1.class);
		SmartTV_Ann1 s=(SmartTV_Ann1)an;
		
		System.out.println(s.os());
		System.out.println(s.height());
		System.out.println(s.width());

	}

}
