package com.virtusa.view;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeView {
	
	Scanner sc = new Scanner(System.in);
	JDBCEmployeeDao empDao = new JDBCEmployeeDao();
	public void mainMenu() throws ClassNotFoundException, SQLException 
	{
		
		System.out.println("Enter Employee Id: ");
		int empId = sc.nextInt();
		
		System.out.println("Enter Password");
		String password = sc.next();
		
		String sEmpId = String.valueOf(empId);
		
		if(sEmpId.substring(0,3).equals("806"))
		{
			
			if(empDao.employeeLogin(empId, password))
			{
				employeeMenu(empId);
			}
			else
			{
				System.out.println("Invalid Credentials");
				mainMenu();
			}
		}
	}
	private void employeeMenu(int empId) throws ClassNotFoundException, SQLException
	{
		System.out.println("1.Check Leave Balances 2.Request Leave  3.View Request Status 4. Logout");
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("\nOption:");
		int option=scanner.nextInt();
		
		switch(option) {
		
		case 1:viewLeaveBalance(empId);
		       break;
		case 2:
			   requestLeave(empId);
			   break;
		case 3:viewRequestStatus(empId);
			   break;
		case 4:logout();
		   break;
		}
		
	}
	private void logout() throws ClassNotFoundException, SQLException 
	{
		mainMenu();
	}
	private void viewRequestStatus(int empId) throws ClassNotFoundException, SQLException 
	{
		ArrayList<Leaves> leaveList= empDao.viewRequestStatus(empId);
		
		for (Leaves l : leaveList) 
		{
            System.out.print("For Leave Request from " + l.getFromDate() + " to " + l.getToDate() + " of type " + l.getLeaveType() + " is with status " + l.getLeaveStatus()+ "\n");
		}
		employeeMenu(empId);
		
	}
	private void requestLeave(int empId) throws ClassNotFoundException, SQLException 
	{
		System.out.println("Enter Leave Type");
		String leaveType = sc.next();
		sc.nextLine();
		
		System.out.println("From date");
		String from_date = sc.next();
		
		System.out.println("To date");
		String to_date = sc.next();
		
		System.out.println("Designation");
		String designation = sc.next();
		sc.nextLine();
		
		System.out.println("Leave Description");
		String description = sc.nextLine();
		sc.close();
		
		Leaves leave = new Leaves(leaveType, from_date, to_date, designation, description);
		if(empDao.requestLeave(leave, empId))
		{
			System.out.println("Leave request sent");
		}
		
		employeeMenu(empId);
		
	}
	private void viewLeaveBalance(int empId) throws ClassNotFoundException, SQLException 
	{
		LeaveBalance leave = empDao.viewLeaveBalances(empId);
		System.out.println("Your Leave Balances are: ");
		System.out.println("Sick Leaves: " + leave.getSickLeave() + " Earned Leaves are: " + leave.getEarnedLeave() + " Bereavement Leaves are: " + leave.getBereavementLeave());
		
		employeeMenu(empId);
			
	}
	

}
