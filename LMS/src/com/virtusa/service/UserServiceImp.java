package com.virtusa.service;

import java.sql.SQLException;

import com.virtusa.DAO.UserDao;

import com.virtusa.helper.UserData;
import com.virtusa.model.UserModel;

public class UserServiceImp implements UserService {
	
private UserDao userDAO=null;
	
	public UserServiceImp() {
		this.userDAO=UserData.createUserDAO();
	}
	@Override
	public String authenticateService(UserModel userModel) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String userType=null;
		boolean validateUser=
				userDAO.userVerification(userModel.getEmpId() ,userModel.getPassword());
		
		if(validateUser) {
			userType=userDAO.returnUserType(userModel.getEmpId() ,userModel.getPassword());	

		}

		return userType;
	}
	


}
