package CollectionFramework;
import java.util.HashMap;
import java.util.Map;
public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		// Creating HashMap
		map.put(1, "Mango"); //Put elements in map
		map.put(2, "Apple");
		map.put(3, "Orange");
		map.put(4, "Grapes");
		map.put(null , null);
		map.put(null, "Berry");
		map.put(5, null);
		
	    System.out.println("Iterating HashMap....");
	
	    for(Map.Entry m : map.entrySet())
	    {
	    	System.out.println(m.getKey()+" "+m.getValue());
	    }
		
	}

}
