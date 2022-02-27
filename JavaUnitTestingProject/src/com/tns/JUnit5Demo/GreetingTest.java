package com.tns.JUnit5Demo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
public class GreetingTest 
{
	@Test
	public void testGreet()
	{
	  Greeting greeting=new Greeting();
	  assertEquals("Unexpected result!!!!","WELCOME TO JAVA!!!!",greeting.greet());
	}
}
