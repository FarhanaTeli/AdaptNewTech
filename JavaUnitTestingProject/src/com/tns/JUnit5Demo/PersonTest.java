package com.tns.JUnit5Demo;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;
public class PersonTest 
{
	@Test
	public void GetFullName()
	{
		System.out.println("Full name is");
		Person pr=new Person("Robert","King");
		assertEquals("Robert King", pr.getFullName());
	}
	
	@Test
	public void NullIsInName()
	{
		System.out.println("Inside Null");
		Person pr1=new Person("Robert","King");
		assertNotNull("Full name null", pr1.getFullName());
		assertNotNull("First name null", pr1.getFirstName());
		assertNotNull("Last name null", pr1.getLastName());
	}
	@Test
	public void GetFirstName()
	{
		Person p2=new Person("Robert","King");
		assertEquals(p2.getFirstName(), "Robert");
	}
	@Test
	public void GetLastName()
	{
		Person p3=new Person("Robert","King");
		assertEquals(p3.getLastName(), "King");
	}

}
