package CollectionFramework;
import java.util.Map;
import java.util.TreeMap;
public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<Integer, String> map=new TreeMap<Integer, String>();
		map.put(101, "Amit");
		map.put(102, "Kajal");
		map.put(100, "Harsh");
		map.put(103, "John");
		/*
		 * map.put(null, "Manik"); TreeMapp doesn't allow null key it will only allow
		 * null value.
		 */		
		map.put(105, null);
		for(Map.Entry m : map.entrySet())
	    {
	    	System.out.println(m.getKey()+" "+m.getValue());
	    }
		

	}

}
