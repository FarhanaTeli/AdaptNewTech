package com.hibernateDemo.crud;

import java.util.Properties;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class HibernateDBConnect 
{
	private static SessionFactory objsf;
	public static SessionFactory getSessionFactory()
	{
		if(objsf==null)
		{
			try
			{
				Configuration objcfg=new Configuration();
				Properties objprop=new Properties();
				objprop.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
				objprop.put(Environment.URL, "jdbc:mysql://localhost:3306/hibernate");
				objprop.put(Environment.USER, "root");
				objprop.put(Environment.PASS, "root");
				objprop.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
				objprop.put(Environment.SHOW_SQL, "true");
				objprop.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
				objprop.put(Environment.HBM2DDL_AUTO, "update");
				objcfg.setProperties(objprop);
				objcfg.addAnnotatedClass(UserDatabase.class);
				ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder().applySettings(objcfg.getProperties()).build();
				System.out.println("Hibernate java config serveiceRegistry created");
				objsf=objcfg.buildSessionFactory(serviceRegistry);
			}
			catch(HibernateException e)
			{
				System.out.println(e);
			}
		}
		return objsf;
	}


}
