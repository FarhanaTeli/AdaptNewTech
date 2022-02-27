package com.tns.JUnit5Demo;

public class Person {
	private String firstName;
	private String lastName;
	public Person(String firstName, String lastName) 
	{
		if(firstName==null && lastName==null )
		{
			throw new IllegalArgumentException("Both names cannot be null");
		}
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFullName()
	{
		String first=(this.firstName !=null)? this.firstName:"?";
		String last=(this.lastName !=null)? this.lastName:"?";
		return first + " " + last;
	}
	
	public String getFirstName()
	{
		return this.firstName;
	}
	public String getLastName()
	{
		return this.lastName;
	}
	
	public static void main(String[] args)
	{
		Person p=new Person("Zain","Zoya");
		System.out.println("Full Name Is:"+ p.getFullName());
		System.out.println("First Name Is:"+ p.getFirstName());
		System.out.println("Last Name Is:"+ p.getLastName());
	}

}
