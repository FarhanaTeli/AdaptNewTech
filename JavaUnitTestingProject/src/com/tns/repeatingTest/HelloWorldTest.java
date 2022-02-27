package com.tns.repeatingTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
class HelloWorldTest implements RepeatingTestDemo
{
	@Test
	@RepeatedTest(6) // That will be automatically repeated 6 times.
	void test()
	{
		System.out.println("First test class");
	}

}