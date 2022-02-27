package com.tns.JUnit5Demo.TestLifeCycle;
import org.junit.jupiter.api.Test;
class HelloWorldTest implements TestInstanceLifeCycleDemo
{
	@Test
	void test()
	{
		System.out.println("First test class");
	}

}
