package usingCollableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class StudentDatabase 
{
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
		
		System.out.println("1. usingPreparedStatement: Enter choice for inserting record ");
		System.out.println("2. usingResultSet: Enter choice for selecting record ");
		System.out.println("3. usingCollableStatement without parameter: Enter choice for selecting record ");
		System.out.println("4. usingCollableStatement with parameter: Enter choice for selecting record by using roll number");


		int choice=Integer.parseInt(scanner.nextLine());

		switch(choice)
		{
		case 1:
			studentDatabase.insertRecord();
			break;
		case 2:
			studentDatabase.selectRecord();
			break;
		case 3:
			studentDatabase.selectAllRecords();
			break;
		case 4:
			studentDatabase.selectRecordsByRollNumber();
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
        int rows= preparedStatement.executeUpdate();
		
		if(rows>0)
		{
			System.out.println("Record inserted successfully");
		}

	}
	public void selectRecord() throws SQLException 
	{
		System.out.println("Enter roll no to find result");
		int number= Integer.parseInt(scanner.nextLine());  //for user input
		String sql="select * from student where roll_number= "+number;
		// String sql="select * from student where roll_number=3";
		Statement statement= connection.createStatement();
		ResultSet result= statement.executeQuery(sql);
		
		if(result.next())
		{
			int rollNumber= result.getInt("roll_number");
			String name= result.getString("name");
			double percentage= result.getDouble("percentage");
			String address= result.getString("address");
			
			System.out.println("Roll number is: "+rollNumber);
			System.out.println("Name is: "+name);
			System.out.println("Percentage is: "+percentage);
			System.out.println("Address is: "+address);
		}
		else
		{
			System.out.println("No record found.......");
		}

	}
	/*
	 * Steps to create stored procedure in MySQL8.0 command line
	 * 1. To create getAll() procedure
	 *mysql> DELIMITER //
      mysql> CREATE PROCEDURE getAll()
          -> BEGIN
          -> SELECT * FROM STUDENT;
          -> END
          -> //
             Query OK, 0 rows affected (0.03 sec)
     *2. To create getRecord() procedure
     *mysql> DELIMITER //
      mysql> CREATE PROCEDURE getRecord(IN roll_no INT)
          -> BEGIN
          -> SELECT * FROM STUDENT WHERE ROLL_NUMBER= roll_no;
          -> END //
             Query OK, 0 rows affected (0.02 sec)        
	 */
	private void selectAllRecords() throws SQLException
	{
		CallableStatement callableStatement= connection.prepareCall("{ call getAll() }");
		ResultSet result= callableStatement.executeQuery();
		while(result.next())
		{
			System.out.println("Roll number is: "+result.getInt("roll_number"));
			System.out.println("Name is: "+result.getString("name"));
			System.out.println("Percentage is: "+result.getDouble("percentage"));
			System.out.println("Address is: "+result.getString("address"));
			System.out.println("**************************************************");
		}
	}
	
	private void selectRecordsByRollNumber() throws SQLException
	{
		System.out.println("Enter roll number to fetch details");
		int roll=Integer.parseInt(scanner.nextLine());
		CallableStatement callableStatement= connection.prepareCall("{ call getRecord(?) }");
		callableStatement.setInt(1, roll);
		// callableStatement.setInt(1, 5);
		ResultSet result= callableStatement.executeQuery();
		while(result.next())
		{
			System.out.println("Roll number is: "+result.getInt("roll_number"));
			System.out.println("Name is: "+result.getString("name"));
			System.out.println("Percentage is: "+result.getDouble("percentage"));
			System.out.println("Address is: "+result.getString("address"));
			System.out.println("**************************************************");
		}
	}

}
