import java.util.ArrayList;
import java.util.Iterator;

public class GenericClassDemo1
{
	public static void main(String[] args) 
	{
		  ArrayList<String> list=new ArrayList<String>();
		  list.add("India");
		  list.add("Korea");
		  list.add("America");
		  
		  String country=list.get(0);
		  System.out.println("Country Element is: "+country);
		  
		  Iterator<String> itr=list.iterator(); while(itr.hasNext()) {
		  System.out.println(itr.next()); }
		 
	}

}
