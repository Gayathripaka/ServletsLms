package com.virtusa.entities;

import java.sql.Date;

public class Leaves {
	
	private int  leave_Id;
	private int employee_Id;
	private String leave_Type;
	private Date from_Date;
	private Date to_Date;
	private String designation;
	private String leave_Status;
	public int getLeave_Id() {
		return leave_Id;
	}
	public void setLeave_Id(int leave_Id) {
		this.leave_Id = leave_Id;
	}
	public int getEmployee_Id() {
		return employee_Id;
	}
	public void setEmployee_Id(int employee_Id) {
		this.employee_Id = employee_Id;
	}
	public String getLeave_Type() {
		return leave_Type;
	}
	public void setLeave_Type(String leave_Type) {
		this.leave_Type = leave_Type;
	}
	public Date getFrom_Date() {
		return from_Date;
	}
	public void setFrom_Date(Date from_Date) {
		this.from_Date = from_Date;
	}
	public Date getTo_Date() {
		return to_Date;
	}
	public void setTo_Date(Date to_Date) {
		this.to_Date = to_Date;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public String getLeave_Status() {
		return leave_Status;
	}
	public void setLeave_Status(String leave_Status) {
		this.leave_Status = leave_Status;
	}
	@Override
	public String toString() {
		return "Leaves [leave_Id=" + leave_Id + ", employee_Id=" + employee_Id + ", leave_Type=" + leave_Type
				+ ", from_Date=" + from_Date + ", to_Date=" + to_Date + ", designation=" + designation
				+  ", leave_Status=" + leave_Status + "]";
	}
	

}
