package connector;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;


public class Payroll extends Employee {
	DatabaseConnection databaseConn = new DatabaseConnection();
	Employee emp = new Employee();
	Scanner input = new Scanner(System.in);
	
	

	//possible constructor
	public Payroll() {
		
	}
	
	//thursday (Andrea)
	//set pay rate
	public void setPayrate(){
		//add pay rate to specific employee 
	}
	//thursday
	//retrieve employee pay rate
	public void findPayrate() {
		//find employee pay rate
		try 
		{
		
		String payRate = "SELECT * payroll WHERE first_name = ?";
		PreparedStatement statement = databaseConn.connection.prepareStatement(payRate);
		System.out.println("Enter First name");
		statement.setString(1, myObj.nextLine());
		ResultSet result1 = statement.executeQuery();
		while(result1.next()) {
			
			System.out.println("pay rate for who");
			String find = result1.getString(myObj.nextLine());
			System.out.println(find);	
		}
		
		}catch (Exception e) {
			e.printStackTrace();			
	}	
		
	}
	
	//thursday possible
	//net pay
	public void netPay() {
		//HOLD OFF
		//calculations
		
	}
	
	//thursday (marquez)
	// Update Pay
	public void updatePay() {
		// ability to update pay rate
	}
	//thursday(remedial gal)
	//delete Pay
	public void deletePay() {
		//delete
	}
	
	//thursday(marquez)
	//direct deposit boolean
	public void deposit() {
		// update true or false
	}
	
	//gross Pay
	public void grossPay() {
		// the net pay
		//benefits
	}

}
