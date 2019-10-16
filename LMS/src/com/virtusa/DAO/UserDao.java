package com.virtusa.DAO;

import java.sql.SQLException;

public interface UserDao {
	
	public boolean userVerification(int empId,String password) throws ClassNotFoundException, SQLException;
	public String returnUserType(int empId,String password) throws ClassNotFoundException, SQLException;

}
