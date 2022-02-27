package com.tns.parameterizedTest;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
/*
 * Parameterized tests make it possible to run test multiple times with different arguments.
 * Using @ParameterizedTest annotation.
 * @ValueSource annotation to specify String array as source of arguments.
 */
public class ParameterizedTestDemo 
{
	@ParameterizedTest
	@ValueSource(ints = {1,2,3})
	void withValueSource(int number)
	{
		assertNotNull(number);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"fara","Zoya"})
	void withValueSource1(String name)
	{
		assertNotNull(name);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"1","2","3","four"})
	void withValueSource2(int number)
	{
		assertNotNull(number);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"1","2","3","four"})
	void withValueSource3(String number)
	{
		assertNotNull(number);
	}

}
