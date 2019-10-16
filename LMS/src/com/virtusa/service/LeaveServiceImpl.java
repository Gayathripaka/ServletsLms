package com.virtusa.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.virtusa.LeaveService;

public class LeaveServiceImpl implements LeaveService {
	
	private LeaveDao leaveDAO;
	public LeaveServiceImpl() 
	{
		this.leaveDAO=FactoryEmployeeDb.createLeavesDAO();
		
	}
	@Override
	public List<LeaveModel> retrieveLeaves() 
	{
		List<LeaveModel> leaveModelList=new ArrayList<>();
		try {
		List<Leaves> leaveList=LeaveDao.getAllLeaveTypes();
		for(Leaves leave:leaveList) {
			LeaveModel leaveModel=new LeaveModel();
			leaveModel.setLeaveType(leave.getLeaveType());
			leaveModel.setLeaveBalances(leave.getLeaveBalances());
			leaveModelList.add(leaveModel);
		}
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		System.out.println("!ERROR[Retrieval of leaves failed!!!]");
	}
	return leaveModelList;
		
	}

}
