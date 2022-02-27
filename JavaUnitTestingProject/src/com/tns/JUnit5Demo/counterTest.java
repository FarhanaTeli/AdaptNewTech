package com.tns.JUnit5Demo;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
public class counterTest {
	Counter c=new Counter();
	public counterTest()
	{	
	}
	@Test
	public void Icrement()
	{
		assertTrue(c.increment()==1);
		assertTrue(c.increment()==2);
	}
	@Test
	public void Decrement()
	{
		assertTrue(c.decrement() == -1);
	}

}
