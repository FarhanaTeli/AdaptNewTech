import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class ClientTest {

	public static void main(String[] args) 
	{
		Integer[] values=new Integer[] {10,20,30,40};
		
		List<String> li=new ArrayList<String>();
		li.add("Java");
		li.add("Python");
		li.add("C++");
		
		System.out.println("Array elements");
		Stream<Integer> stream=Arrays.stream(values);
		stream.forEach(System.out::println);
		
		System.out.println("-----------------------------");
		System.out.println("List elements");
		Stream<String> stream1=li.stream();
		stream1.forEach(System.out::println);
		
		Stream<String> stream2=Stream.of("A","B","C","D");
		System.out.println("-----------------------------");
		System.out.println("Stream elements");
		stream2.forEach(System.out::println);	
	}

}
