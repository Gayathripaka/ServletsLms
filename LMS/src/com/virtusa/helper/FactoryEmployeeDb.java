package com.virtusa.helper;

public class FactoryEmployeeDb {
	
	public static LeaveDao createLeavesDAO(){
		LeaveDao leaveDAO=new JDBCLeaveDao();
		return leaveDAO;
		
	}
	public static LeaveService createDepartmentsService(){
		LeaveService leaveService=new LeaveServiceImpl();
		return leaveService;
	}

}
