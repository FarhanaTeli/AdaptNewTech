package CollectionFramework;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class IteratorExample {

	public static void main(String[] args) {
		List<Integer> lst=new ArrayList<Integer>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
	    
		Iterator<Integer> itr=lst.iterator();
		while(itr.hasNext())
		{
			Integer n=itr.next();
			System.out.println(n);
			if(n==5)
				itr.remove();
		}
		System.out.println("__________________________");
		System.out.println(lst);
	}
}
