package com.virtusa.service;

import java.sql.SQLException;

import com.virtusa.model.UserModel;

public interface UserService {
	public String authenticateService(UserModel userModel) throws ClassNotFoundException, SQLException;
}
