import java.util.Arrays;
import java.util.List;
public class UnBoundedWildCard {
	public static void display(List<?> ll)
	{
		for(Object o:ll)
		{
			System.out.println(o);
		}
	}
	public static void main(String[] args) 
	{
		List<Integer> l1=Arrays.asList(1,2,3);
		System.out.println("display Integer values");
		display(l1);
		
		List<String> l2=Arrays.asList("Hi","Hello","How are you");
		System.out.println("display String values");
		display(l2);
		
		List<Float> l3=Arrays.asList(2.2f,3.2f,1.4f);
		System.out.println("display Float values");
		display(l3);
		
		List<Double> l4=Arrays.asList(2.1,3.3,1.4);
		System.out.println("display Double values");
		display(l4);

	}

}
