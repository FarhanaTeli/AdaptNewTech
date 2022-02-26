package finalJDBCPrjUsingBatch;
// Final JDBC project 
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
		System.out.println("5. Enter choice for update record using PreparedStatment");
        System.out.println("6. Enter choice for delete record");
        System.out.println("7. Batch processing");
        
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
		case 5:
			studentDatabase.updateRecord();
			break;
		case 6:
			studentDatabase.deleteRecord();
			break;
		case 7:
			studentDatabase.batchProcessing();
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
	
	// For inserting record usingPreparedStatement
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
	
	// For selecting record usingResultSet
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
	
	// For selecting records with or without parameter usingCollableStatement
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
	
	// For update record usingStatement and usingResultSet
	private void updateRecord() throws SQLException
	{
		System.out.println("Enter roll number to update record");
		int roll= Integer.parseInt(scanner.nextLine());
		String sql= "select * from student where roll_number= "+roll;
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
			
			System.out.println("What do you want to update?");
			System.out.println("1. Name");
			System.out.println("2. Percentage");
			System.out.println("3. Address");
			
			int choice=Integer.parseInt(scanner.nextLine());
			// update student set name='deep' where roll_number=5;
			String sqlQuery= "update student set ";
			switch(choice)
			{
			case 1:
				System.out.println("Enter new name");
				String newName=scanner.nextLine();
				sqlQuery=sqlQuery + "name = ? where roll_number = "+rollNumber;
				PreparedStatement preparedStatement= connection.prepareStatement(sqlQuery);
				preparedStatement.setString(1, newName);
				int rows= preparedStatement.executeUpdate();
				if(rows>0)
				{
					System.out.println("Record updated successfully.");
				}
				break;
			case 2:
				System.out.println("Enter new percentage");
				double newPercentage=Double.parseDouble(scanner.nextLine());
				sqlQuery=sqlQuery + "percentage = ? where roll_number = "+rollNumber;
				PreparedStatement preparedStatement1= connection.prepareStatement(sqlQuery);
				preparedStatement1.setDouble(1, newPercentage);
				int rows1= preparedStatement1.executeUpdate();
				if(rows1>0)
				{
					System.out.println("Record updated successfully.");
				}
				break;
			case 3:
				System.out.println("Enter new address");
				String newAddress=scanner.nextLine();
				sqlQuery=sqlQuery + "address = ? where roll_number = "+rollNumber;
				PreparedStatement preparedStatement2= connection.prepareStatement(sqlQuery);
				preparedStatement2.setString(1, newAddress);
				int rows2= preparedStatement2.executeUpdate();
				if(rows2>0)
				{
					System.out.println("Record updated successfully.");
				}
				break;
			default:
				break;
			}

		}
		else
		{
			System.out.println("Records not found.....");
		}
	}
	
	// For delete record usingStatement
	public void deleteRecord() throws SQLException
	{
		System.out.println("Enter roll number to delete.");
		int rollNumber=Integer.parseInt(scanner.nextLine());
		String sql = "delete from student where roll_number = "+rollNumber;
		Statement statement= connection.createStatement();
		int rows= statement.executeUpdate(sql);
		if(rows>0)
		{
			System.out.println("Record is deleted successfully...");
		}
	}
	
	// usingBatch
	public void batchProcessing() throws SQLException
	{
		connection.setAutoCommit(false);
		
		String sql1= "INSERT INTO STUDENT (NAME, PERCENTAGE, ADDRESS) VALUES ('Alexender',68,'Japan')";
		String sql2= "INSERT INTO STUDENT (NAME, PERCENTAGE, ADDRESS) VALUES ('Lee Min Hoo',68,'South Korea')";
		String sql3= "INSERT INTO STUDENT (NAME, PERCENTAGE, ADDRESS) VALUES ('Kim Taehyung',68,'South Korea')";
		
		Statement statement= connection.createStatement();
		statement.addBatch(sql1);
		statement.addBatch(sql2);
		statement.addBatch(sql3);
		
		int[] rows= statement.executeBatch();
		for (int i : rows)
		{
			if(i>0)
			{
				continue;
			}
			else
			{
				connection.rollback();
			}
		}
		connection.commit();
	}

}
