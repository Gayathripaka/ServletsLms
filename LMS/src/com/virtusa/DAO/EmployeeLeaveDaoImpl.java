package com.virtusa.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeLeaveDaoImpl implements EmployeeLeaveDao{
	
	public LeaveBalance viewLeaveBalances(int empId) throws ClassNotFoundException, SQLException 
	{
		int status = 0;
		Connection connection = ConnectionManager.openConnection();
		PreparedStatement statement = connection.prepareStatement("select * from leavebalance where emp_id = ?");
		statement.setInt(1, empId);
		ResultSet resultSet = statement.executeQuery();
		LeaveBalance leaveBalance = null;
		if(resultSet.next())
		{
			System.out.println(resultSet.getInt(1) + "" + resultSet.getInt(2) + "" + resultSet.getInt(3));
			leaveBalance = new LeaveBalance(resultSet.getInt(2), resultSet.getInt(3), resultSet.getInt(4));
		}
		
		
		return leaveBalance;
	}

	@Override
	public boolean requestLeave(Leaves leave, int empId) throws ClassNotFoundException, SQLException 
	{
		boolean status = false;
		Connection connection = ConnectionManager.openConnection();
		PreparedStatement statement = connection.prepareStatement("insert into leaves_table values(0,?,?,?,?,?,?,?)");
		statement.setInt(1, empId);
		statement.setString(2, leave.getLeaveType());
		statement.setString(3, leave.getFromDate());
		statement.setString(4, leave.getToDate());
		statement.setString(5, leave.getDesignation());
		statement.setString(6, leave.getLeaveDesc());
		statement.setString(7, "Hold");
		int result = statement.executeUpdate();
		
		if(result > 0)
		{
			status = true;
		}
		
		return status;
	}

	public ArrayList<Leaves> viewRequestStatus(int empId) throws ClassNotFoundException, SQLException 
	{
		Leaves leave = null;
		ArrayList<Leaves> leaveList = new ArrayList();
		Connection connection = ConnectionManager.openConnection();
		PreparedStatement statement = connection.prepareStatement("select * from leaves_table where emp_id = ?");
		statement.setInt(1, empId);
		ResultSet resultSet = statement.executeQuery();
		while(resultSet.next())
		{
			leaveList.add(new Leaves(resultSet.getInt(1),resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(7), resultSet.getString(8)));
		}
		return leaveList;
	}

}
