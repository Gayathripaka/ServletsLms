package com.virtusa.service;

import java.sql.SQLException;

public interface ManagerService {
	public void leaveBalances() throws ClassNotFoundException, SQLException;
	public void leaveApproval(int empId) throws ClassNotFoundException, SQLException;
	public void leaveRejection(int empId) throws ClassNotFoundException, SQLException;
	
}
