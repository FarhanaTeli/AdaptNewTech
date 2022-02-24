package CollectionFramework;
import java.util.Iterator;
import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {
		TreeSet<String> ss=new TreeSet<String>();
		ss.add("Hash");
		ss.add("Set");
		ss.add("Demo");
		ss.add("Demo");
		//hs.add(new Integer(10));
		
		Iterator i=ss.iterator();
		while(i.hasNext())
		{
			Object o=i.next();
			System.out.println(o);
		}


	}

}
