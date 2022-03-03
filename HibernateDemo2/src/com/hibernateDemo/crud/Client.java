package com.hibernateDemo.crud;
import java.util.Scanner;
import org.hibernate.Session;
public class Client 
{
	private static Scanner scanner=new Scanner(System.in);
	Session session=HibernateDBConnect.getSessionFactory().openSession();
	public static void main(String[] args) 
	{
		Client c=new Client();
		System.out.println("1. Create:Insert data into records");
		System.out.println("2. Read:Retrieve data from records");
		System.out.println("3. Update:Update records");
		System.out.println("4. Delete:Delete records");

		int choice=Integer.parseInt(scanner.nextLine());
		switch(choice)
		{
		case 1:
			c.insertData();
			break;
		case 2:
			c.readData();
			break;
		case 3:
			c.updateData();
			break;
		case 4:
			c.deleteRecord();
			break;
		default:
			break;
		}
		/*
		 CRUD
	    
	    Session session=HibernateDBConnect.getSessionFactory().openSession();
		/* Create
		UserDatabase userDatabase=new UserDatabase("rahul101","ra123","Rahul","Gupta");
		session.beginTransaction(); 
		session.save(userDatabase);
		session.getTransaction().commit();
		*/
		/* Read
		Session session=HibernateDBConnect.getSessionFactory().openSession();
		UserDatabase userDatabase1=new UserDatabase(); session.beginTransaction();
		userDatabase1=session.get(UserDatabase.class, 102); 
		System.out.println(userDatabase1);
		session.getTransaction().commit();
		*/
		/* Update
		UserDatabase userDatabase2=new UserDatabase(); 
		session.beginTransaction();
		userDatabase2=session.get(UserDatabase.class, 105); 
		userDatabase2.setLname("Pancholi");
		System.out.println(userDatabase2); 
		session.getTransaction().commit();
		*/
		/* Delete
		UserDatabase userDatabase3=new UserDatabase(); 
		session.beginTransaction();
		userDatabase3=session.get(UserDatabase.class, 105); 
		session.delete(userDatabase3);
		session.getTransaction().commit();
		 */
	}
	// CRUD Operation using hibernate.
	// Step 1: Create
	public void insertData()
	{
		try
		{
			UserDatabase userDatabase=new UserDatabase("farah3103","zoz@143","Farah","Samani");
			session.beginTransaction(); 
			session.save(userDatabase);
			System.out.println("Data inserted successfully.....");
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	// Step 2: Read
	public void readData()
	{
		try
		{
			UserDatabase userDatabase1=new UserDatabase(); 
			session.beginTransaction();
			userDatabase1=session.get(UserDatabase.class, 109); 
			if(userDatabase1==null)
			{
				System.out.println("There is no user info for this given id");
			}
			else
			{
				System.out.println("Retrieve successfully " +userDatabase1);
			}
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	// Step 3: Update
	public void updateData()
	{
		try
		{
			UserDatabase userDatabase2=new UserDatabase(); 
			session.beginTransaction();
			userDatabase2=session.get(UserDatabase.class, 107); 
			userDatabase2.setLname("Teli");
			userDatabase2.setUsername("ft444");
			System.out.println("Record updated successfully " +userDatabase2); 
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	// Step 4: Delete
	public void deleteRecord()
	{
		try
		{
			UserDatabase userDatabase3=new UserDatabase(); 
			session.beginTransaction();
			userDatabase3=session.get(UserDatabase.class, 109); 
			session.delete(userDatabase3);
			System.out.println("Data deleted successfully....");
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
