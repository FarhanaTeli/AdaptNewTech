package com.tns.JUnit5Demo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
public class AssertDemo 
{
	// @Test always looking for a method
	@Test
	public void simple()
	{
		int A=2;
		int B=2;
		assertEquals(A, B);  // assert will always give true or false
	}
	
	@Test
	public void simple1()
	{
		int A=2;
		int B=1;
		assertEquals(A, B);  // assert will always give true or false
	}
	@Disabled
	@Test
	public void simple2()
	{
		int A=2;
		int B=3;
		assertEquals(A, B);  // assert will always give true or false
	}

}
