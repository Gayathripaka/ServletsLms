package com.virtusa.entities;

public class LeaveBalance {
	private int empId;
	private int sickLeave;
	private int earnedLeave;
	private int bereavementLeave;
	
	
	public LeaveBalance(int sickLeave, int earnedLeave, int bereavementLeave)
	{
		this.sickLeave = sickLeave;
		this.earnedLeave = earnedLeave;
		this.bereavementLeave = bereavementLeave;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getSickLeave() {
		return sickLeave;
	}
	public void setSickLeave(int sickLeave) {
		this.sickLeave = sickLeave;
	}
	public int getEarnedLeave() {
		return earnedLeave;
	}
	public void setEarnedLeave(int earnedLeave) {
		this.earnedLeave = earnedLeave;
	}
	public int getBereavementLeave() {
		return bereavementLeave;
	}
	public void setBereavementLeave(int bereavementLeave) {
		this.bereavementLeave = bereavementLeave;
	}

	
}
