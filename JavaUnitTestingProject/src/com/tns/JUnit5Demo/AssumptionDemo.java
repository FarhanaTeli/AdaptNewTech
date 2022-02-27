package com.tns.JUnit5Demo;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionDemo 
{
	@Test
	void testOnDevelpment()
	{
		System.setProperty("ENV", "DEV");  //True
		Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV"))); 
		//assumeTrue run if the result is true.
		//Remainder of test will proceed
	}
	
	@Test
	void testOnProduction()
	{
		System.setProperty("ENV", "PROD");
		Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")), AssumptionDemo::message); //False
		//Remainder of test will aborted
	}
	
	@Test
	void testOnProduction1()
	{
		System.setProperty("ENV", "PROD");
		Assumptions.assumeFalse("DEV".equals(System.getProperty("ENV")), AssumptionDemo::message); //False
		// assumeFalse run if the result is false
		//Remainder of test will proceed
	}
	
	@Test
	void testOnProduction2()
	{
		System.setProperty("ENV", "PROD");
		Assumptions.assumingThat("DEV".equals(System.getProperty("ENV")), AssumptionDemo::message); //True
		// assumingTrue run if the given assumption is true
		//Remainder of test will proceed
	}
	
	private static String message()
	{
		return "Today's:Test Execution Failed.....";
	}

}
