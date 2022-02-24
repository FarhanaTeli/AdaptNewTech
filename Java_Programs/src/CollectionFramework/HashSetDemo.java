package CollectionFramework;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("Hash");
		hs.add("Set");
		hs.add("Demo");
		hs.add("Demo");
		//hs.add(new Integer(10));
		
		Iterator i=hs.iterator();
		while(i.hasNext())
		{
			Object o=i.next();
			System.out.println(o);
		}

	}

}
