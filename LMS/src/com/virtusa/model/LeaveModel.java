package com.virtusa.model;

import com.lms.model.LeaveModel;

public class LeaveModel {
	private String leaveType;
	private int leaveBalances;
	private String leaveStatus;
	public LeaveModel() {
	}

	@Override
	public String toString() {
		return "LeaveModel [leaveType=" + leaveType + ", leaveBalances=" + leaveBalances + ", leaveStatus="
				+ leaveStatus + "]";
	}
	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	public int getLeaveBalances() {
		return leaveBalances;
	}

	public void setLeaveBalances(int leaveBalances) {
		this.leaveBalances = leaveBalances;
	}

	public String getLeaveStatus() {
		return leaveStatus;
	}

	public void setLeaveStatus(String leaveStatus) {
		this.leaveStatus = leaveStatus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + leaveBalances;
		result = prime * result + ((leaveStatus == null) ? 0 : leaveStatus.hashCode());
		result = prime * result + ((leaveType == null) ? 0 : leaveType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LeaveModel other = (LeaveModel) obj;
		if (leaveBalances != other.leaveBalances)
			return false;
		if (leaveStatus == null) {
			if (other.leaveStatus != null)
				return false;
		} else if (!leaveStatus.equals(other.leaveStatus))
			return false;
		if (leaveType == null) {
			if (other.leaveType != null)
				return false;
		} else if (!leaveType.equals(other.leaveType))
			return false;
		return true;
	}
	
	
}
