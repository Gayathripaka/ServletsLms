package com.virtusa.DAO;

import java.sql.SQLException;

import com.virtusa.entities.Leaves;



public interface EmployeeLeaveDao {
public LeaveBalance viewLeaveBalances(int empId) throws ClassNotFoundException, SQLException;
	
	public boolean requestLeave(Leaves leave, int empId) throws ClassNotFoundException, SQLException;
}
