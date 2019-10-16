package com.virtusa.controller;

import java.sql.SQLException;

import com.virtusa.exception.UserException;
import com.virtusa.helper.UserData;
import com.virtusa.model.UserModel;
import com.virtusa.service.UserService;
import com.virtusa.view.EmployeeView;
import com.virtusa.view.HrMainView;
import com.virtusa.view.ManagerView;

public class UserLoginController {
	
	private UserService userService;
	public UserLoginController() {
		this.userService=UserData.createUserService();		
	}
	
	public void userVerification(UserModel usermodel) throws ClassNotFoundException, SQLException {
	
		String userType=
				userService.authenticateService(usermodel);	
		
		if(userType.contentEquals("EMPLOYEE")) {
			EmployeeView employeeView=new EmployeeView();
			employeeView.employeeHomePage();
		    }
		
		if(userType.contentEquals("MANAGER")) {
			ManagerView managerView=new ManagerView();
			managerView.ManagerPage();
		    }
		
		if(userType.contentEquals("HR")) {
			HrMainView hrMainView=new HrMainView();
			hrMainView.hrMainView();
		    }		
}

}
