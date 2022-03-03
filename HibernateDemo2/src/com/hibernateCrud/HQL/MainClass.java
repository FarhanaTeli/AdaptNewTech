package com.hibernateCrud.HQL;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.query.Query;
import com.hibernateDemo.crud.Client;
public class MainClass 
{
	private static Scanner scanner=new Scanner(System.in);
	Session objsession=DBConnectHibernate.getSessionFactory().openSession();
	public static void main(String[] args) 
	{
		MainClass c=new MainClass();
		System.out.println("1. Delete:Delete records");

		int choice=Integer.parseInt(scanner.nextLine());
		switch(choice)
		{
		case 1:
			c.delete();
			break;
		default:
			break;
		}

	}
		public void delete()
		{
			try 
			{
				System.out.println("Enter person id to delete record");
				int id=Integer.parseInt(scanner.nextLine());
				String str="delete Persons where personId= "+id;
				objsession.beginTransaction();
				
				Query query=objsession.createQuery(str);
				query.executeUpdate();
				System.out.println("Record successfully deleted......");
							
			} 
			finally
			{
				objsession.close();
				
			}
		}

}
