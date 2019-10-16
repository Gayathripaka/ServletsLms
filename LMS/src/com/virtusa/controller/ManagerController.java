package com.virtusa.controller;

import java.sql.SQLException;

import com.virtusa.DAO.ManagerDAO;
import com.virtusa.DAO.ManagerDAOImpl;
import com.virtusa.service.ManagerService;
import com.virtusa.service.ManagerServiceImpl;

public class ManagerController {
	
	public void viewListOfLeaveRequests() throws ClassNotFoundException, SQLException {
		ManagerDAOImpl managerDAOImpl=new ManagerDAOImpl();
		managerDAOImpl.getListOfLeaves();
		
		
	}
	public void leavebalances(int empId) throws ClassNotFoundException, SQLException {
		ManagerDAOImpl managerDAOImpl=new ManagerDAOImpl();
		managerDAOImpl.checkLeaveBalances(empId);
		
		ManagerServiceImpl managerServiceImpl=new ManagerServiceImpl();
		managerServiceImpl.leaveBalances();
	}
	public void approveLeave(int empId) throws ClassNotFoundException, SQLException {
		ManagerServiceImpl managerServiceImpl=new ManagerServiceImpl();
		managerServiceImpl.leaveApproval(empId);
	}
	public void rejectLeave(int empId) throws ClassNotFoundException, SQLException {
		ManagerServiceImpl managerServiceImpl=new ManagerServiceImpl();
		managerServiceImpl.leaveRejection(empId);
	}

}
