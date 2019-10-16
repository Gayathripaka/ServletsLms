package com.virtusa.ui;

import java.sql.SQLException;

import com.virtusa.view.ManagerView;

public class ManagerUI {
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		ManagerView managerView=new ManagerView();
		managerView.ManagerPage();
	}

}
