package com.tns.JUnit5Demo.TestLifeCycle;
import java.util.logging.Logger;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
@TestInstance(Lifecycle.PER_CLASS)
interface TestInstanceLifeCycleDemo 
{
	@BeforeAll
	default void beforeAllTest()
	{
		System.out.println("Before all tests");
	}
	
	@AfterAll
	default void afterAllTest()
	{
		System.out.println("After all tests");
	}

	
	@Test
	default void testMethod()
	{
		System.out.println("This is test method....");
	}


}
