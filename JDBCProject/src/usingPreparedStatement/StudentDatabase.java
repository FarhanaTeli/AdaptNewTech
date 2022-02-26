package usingPreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

// Insert Data into Database using PreparedStatement
// Steps 1: Load and register driver
//       2: Establish the connection
//       3: Create platform to execute query
//       4: Execute query
//       5: process the result
//       6: Close the connection
public class StudentDatabase {
	private static Connection connection= null;
	private static Scanner scanner=new Scanner(System.in);
 
	public static void main(String[] args) 
	{
		StudentDatabase studentDatabase=new StudentDatabase();
		try 
		{
		Class.forName("com.mysql.cj.jdbc.Driver");   // 1.Load and register the driver
		String dbURL= "jdbc:mysql://localhost:3306/jdbcdb";
		String username="root";
		String password="root";
		connection= DriverManager.getConnection(dbURL, username, password);   //2.Establish the connection
		
		System.out.println("Enter choice for inserting record: ");
		int choice=Integer.parseInt(scanner.nextLine());

		switch(choice)
		{
		case 1:
			studentDatabase.insertRecord();
			break;
		default:
			break;
		}
		}
		catch(Exception e)
		{
			throw new RuntimeException("Something went wrong");
		}

	}
	private void insertRecord() throws SQLException
	{
		// Inside insert record
		String sql="insert into student(name, percentage, address) values(?,?,?)";  //this ? called as PlaceHolder
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		System.out.println("Enter name");
		preparedStatement.setString(1, scanner.nextLine());
		
		System.out.println("Enter percentage");
		preparedStatement.setDouble(2, Double.parseDouble(scanner.nextLine()));
		
		System.out.println("Enter address");
		preparedStatement.setString(3, scanner.nextLine());
		
		/*
		 * Set values dynamically
		preparedStatement.setString(1, "Rahul");
		preparedStatement.setDouble(2, 60.40);
		preparedStatement.setString(3, "Pune");
		*/
		int rows= preparedStatement.executeUpdate();
		
		if(rows>0)
		{
			System.out.println("Record inserted successfully");
		}
	}

}
