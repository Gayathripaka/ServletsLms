package com.virtusa.DAO;

import java.sql.SQLException;
import java.util.List;

import com.virtusa.entities.Leaves;
import com.virtusa.model.ManagerLeaveModel;

public interface ManagerDAO {
	public List<Leaves> getListOfLeaves() throws ClassNotFoundException, SQLException;
	public List<ManagerLeaveModel> checkLeaveBalances(int empId)throws ClassNotFoundException, SQLException;
}
