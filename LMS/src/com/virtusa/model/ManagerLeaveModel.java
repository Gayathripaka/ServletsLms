package com.virtusa.model;

public class ManagerLeaveModel {
	private int emp_id;
	private int leave_id;
	private String Leave_type;
	private int balance_of_leaves;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public int getLeave_id() {
		return leave_id;
	}
	public void setLeave_id(int leave_id) {
		this.leave_id = leave_id;
	}
	public String getLeave_type() {
		return Leave_type;
	}
	public void setLeave_type(String leave_type) {
		Leave_type = leave_type;
	}
	public int getBalance_of_leaves() {
		return balance_of_leaves;
	}
	public void setBalance_of_leaves(int balance_of_leaves) {
		this.balance_of_leaves = balance_of_leaves;
	}
	@Override
	public String toString() {
		return "ManagerLeaveModel [emp_id=" + emp_id + ", leave_id=" + leave_id + ", Leave_type=" + Leave_type
				+ ", balance_of_leaves=" + balance_of_leaves + "]";
	}

}
