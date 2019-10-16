package com.virtusa.ui;

import java.sql.SQLException;

import com.virtusa.view.EmployeeView;

public class EndUserUI {
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		EmployeeView mainView = new EmployeeView();
		mainView.mainMenu();
	}

}
