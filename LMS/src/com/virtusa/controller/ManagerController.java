package com.virtusa.controller;

import java.sql.SQLException;

import com.virtusa.DAO.ManagerDAO;
import com.virtusa.service.ManagerService;

public class ManagerController {
	
	public void viewListOfLeaveRequests() throws ClassNotFoundException, SQLException {
		ManagerDAO managerDAO=new ManagerDAO();
		managerDAO.getListOfLeaves();
		
		
	}
	public void leavebalances(int empId) throws ClassNotFoundException, SQLException {
		ManagerDAO managerDAO=new ManagerDAO();
		managerDAO.checkLeaveBalances(empId);
		
		ManagerService managerService=new ManagerService();
		managerService.leaveBalances();
	}
	public void approveLeave(int empId) throws ClassNotFoundException, SQLException {
		ManagerService managerService=new ManagerService();
		managerService.leaveApproval(empId);
	}
	public void rejectLeave(int empId) throws ClassNotFoundException, SQLException {
		ManagerService managerService=new ManagerService();
		managerService.leaveRejection(empId);
	}

}
