/**
 * 
 */
package connector;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;




public class DatabaseConnection{
	
	
	
	Scanner input = new Scanner(System.in);
	Connection connection = null;
	// Constructor (connector method below main method )
	public DatabaseConnection() {

		String url = "jdbc:mysql://localhost:3306/midterm";
		String user = "root";
		String password = "Password1";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, password);
			Statement statement = connection.createStatement();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException throwables) {
			throwables.printStackTrace();
		}
	}

	
	//EVERYTHING RUNS ON HERE!!!
	public static void main(String[] args) {
		
		connector();	
		promptSwitch();
	}

	//connector method
	public static void connector() {
		Scanner input = new Scanner(System.in);
		
		String url = "jdbc:mysql://localhost:3306/midterm";
		String user = "root";
		String password = "Password1";
		
		//Try statement to connect to database
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection = DriverManager.getConnection(url, user, password);
				    System.out.println("Welcome");
				    System.out.println("what would you like to do");
				    input.nextLine();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
	}catch (SQLException throwables) {
			throwables.printStackTrace();
		}
	}
	
	public void promptSwitch() {
		
		
		Employee employeeObject = new Employee();
        Scanner cc = new Scanner(System.in);
        
        String txt = cc.nextLine();
        switch(cc.nextLine()) 
        {
        case "clock in or out":
        	employeeObject.employeeAtt();
        	cc.nextLine();
        	break;
        case "find employee":
        	employeeObject.findEmployee();
        	cc.next();
        	//newPrompt();
        	break;
        case "add employee":
        	employeeObject.addEmployee();
        	cc.next();
        	//newPrompt();
        	break;
        case "delete employee":
        	employeeObject.deleteEmployee();
        	break;
        case "update employee":
        	employeeObject.updateEmployee();
        	break;
        case "stop":
        	connector();
        	break;
        default:
        	System.out.print("not a function");
        }
	}
	
	public String newPrompt(String input) {
		 Scanner tt = new Scanner(System.in);
		 input = tt.next();
		 System.out.println("Welcome back");
		    System.out.println("what would you like to do");
		    return input;
	}
}

