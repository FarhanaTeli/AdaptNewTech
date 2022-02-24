package CollectionFramework;
import java.util.LinkedHashSet;
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// Creating an empty LinkedHashSet of String type
		LinkedHashSet<String> lh=new LinkedHashSet<String>();
		
		//Adding element to LinkedHashSet
		lh.add("A");
		lh.add("B");
		lh.add("C");
		lh.add("D");
		
		// Note: This will not add new element
		// as a Already exists
		lh.add("A");
		lh.add("E");
		
		// Getting size of LinkedHasSet
		// Using size() method
		System.out.println("Size of LinkedHashSet= "+lh.size());
		System.out.println("Original LinkedHashSet= "+lh);
		
		// Removing existing entry from above set
		// Using remove() method
		System.out.println("Removing D from LinkedHashSet: "  +lh.remove("D"));
		
		// Removing existing entry from above set
		// Using remove() method
		System.out.println("Trying to remove Z from LinkedHashSet: "  +lh.remove("Z"));
		
		// Checking for element whether it is present inside
		// Set or not using contains() method
		System.out.println("Checking if A is present: "  +lh.contains("A"));
		
		// Now lastly printing the updated LinkedHashSet
		System.out.println("Updated LinkedHashSet: " +lh);
	}

}
