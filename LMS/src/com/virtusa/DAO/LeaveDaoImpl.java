package com.virtusa.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LeaveDaoImpl implements LeaveDao {
	
	public List<Leaves> getAllLeaveTypes() throws ClassNotFoundException, SQLException 
	{
		Connection connection=ConnectionManager.openConnection();
		Statement statement=connection.createStatement();
		ResultSet resultSet=
				statement.executeQuery("select leave_type from leaves");
		
		List<Leaves> leaveList=new ArrayList<>();
		while(resultSet.next()) {
			Leaves leaves=new Leaves();
			leaves.setLeaveType(resultSet.getString("leave_type"));
			
		}
		ConnectionManager.closeConnection();
		return leaveList;
	}

}
