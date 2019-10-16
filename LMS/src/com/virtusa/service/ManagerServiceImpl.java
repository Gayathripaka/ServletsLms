package com.virtusa.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.virtusa.integrate.ConnectionManager;
import com.virtusa.model.ManagerLeaveModel;

public class ManagerServiceImpl implements ManagerService {
	
	public void leaveBalances() throws ClassNotFoundException, SQLException {
		ManagerLeaveModel managerLeaveModel=new ManagerLeaveModel();
		System.out.println(managerLeaveModel.toString());
	}
	
	public void leaveApproval(int empId) throws ClassNotFoundException, SQLException {
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement statement=connection.prepareStatement("update leaves_table set status='Approved' where emp_id=?");
		statement.setInt(1, empId);
		statement.executeUpdate();
		System.out.println("Successfully approved leave request");
	}
	public void leaveRejection(int empId) throws ClassNotFoundException, SQLException {
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement statement=connection.prepareStatement("update leaves_table set status='Rejected' where emp_id=?");
		statement.setInt(1, empId);
		statement.executeUpdate();
		System.out.println("Successfully Rejected leave request");
	}
	

}
