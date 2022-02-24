package CollectionFramework;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
// Shared class used by threads
public class Buffer {
	private Queue<Integer> cq=new ConcurrentLinkedQueue<Integer>();
	 
	// Retrieving from the queue
	public void get()
	{
		System.out.println("Consumer received-" +cq.poll());
	}
	
	// Putting in the queue
	public void put(int i)
	{
		cq.add(i);
		System.out.println("Producer produced- "+i);
	}
}
