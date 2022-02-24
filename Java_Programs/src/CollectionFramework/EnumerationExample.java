package CollectionFramework;
import java.util.Enumeration;
import java.util.Vector;
public class EnumerationExample {

	public static void main(String[] args) {
		Vector<Integer> vector=new Vector<Integer>();
		vector.add(1);
		vector.add(4);
		vector.add(6);
		vector.add(3);
		vector.add(2);
		
		Enumeration<Integer> elements=vector.elements();
		while(elements.hasMoreElements())
		{
			Integer n=elements.nextElement();
			System.out.println(n);
		}
		System.out.println("_________________________________");
		System.out.println(vector);

	}

}
