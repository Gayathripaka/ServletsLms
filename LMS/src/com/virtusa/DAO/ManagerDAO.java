package com.virtusa.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.virtusa.entities.Leaves;
import com.virtusa.integrate.ConnectionManager;
import com.virtusa.model.ManagerLeaveModel;

public class ManagerDAO {
	
	public List<Leaves> getListOfLeaves() throws ClassNotFoundException, SQLException {
		Connection connection=ConnectionManager.openConnection();
		Statement statement=connection.createStatement();
		ResultSet resultSet=
				statement.executeQuery("select * from Leaves");
		List<Leaves> listOfLeaveRequest=new ArrayList<Leaves>();
		while(resultSet.next()) {
			Leaves leaves=new Leaves();
			leaves.setLeave_Id(resultSet.getInt("leave_Id"));
			leaves.setEmployee_Id(resultSet.getInt("emp_Id"));
			leaves.setLeave_Type(resultSet.getString("leave_Type"));
			leaves.setLeave_Status(resultSet.getString("leave_Status"));
			leaves.setFrom_Date(resultSet.getDate("from_Date"));
			leaves.setTo_Date(resultSet.getDate("to_Date"));
			leaves.setDesignation(resultSet.getString("designation"));
			listOfLeaveRequest.add(leaves);
			System.out.println(leaves);
		}
		ConnectionManager.closeConnection();
		return listOfLeaveRequest;
	}
	public List<ManagerLeaveModel> checkLeaveBalances(int empId)throws ClassNotFoundException, SQLException {
		
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement statement1=connection.prepareStatement("select emp_id,leave_id,leave_type from Leaves where emp_id=?");
		statement1.setInt(1, empId);
		ResultSet resultSet1=statement1.executeQuery();
		List<ManagerLeaveModel> leaveDetails=new ArrayList<ManagerLeaveModel>();
		ManagerLeaveModel managerLeaveModel=new ManagerLeaveModel();
		
			managerLeaveModel.setEmp_id(resultSet1.getInt("emp_id"));
			managerLeaveModel.setLeave_id(resultSet1.getInt("leave_id"));
			managerLeaveModel.setLeave_type(resultSet1.getString("Leave_type"));
			leaveDetails.add(managerLeaveModel);
		PreparedStatement statement2=connection.prepareStatement("select ? from leavebalance where emp_id=?");
		statement2.setString(1, resultSet1.getString("leave_type"));
		statement2.setInt(2, empId);
		ResultSet resultSet2=statement2.executeQuery();
		managerLeaveModel.setBalance_of_leaves(resultSet2.getInt(resultSet1.getString("leave_type")));
		leaveDetails.add(managerLeaveModel);
		return leaveDetails;
	}
	

}
