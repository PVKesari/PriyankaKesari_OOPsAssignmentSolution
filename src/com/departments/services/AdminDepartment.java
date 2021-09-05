package com.departments.services;

public class AdminDepartment extends SuperDepartment {
	
	private String departmentName; 
	private String todaysWork;
	private String workDeadline;
	
	public String getTodaysWork() {
		if(todaysWork!=null)
			return todaysWork;
			else
			return "Complete your documents Submission";
	}
	public void setTodaysWork(String todaysWork) {
		this.todaysWork = todaysWork;
	}
	public String getWorkDeadline() {
		if(workDeadline!=null) {
			return workDeadline;
		}
		return "Complete by EOD ";
	}
	public void setWorkDeadline(String workDeadline) {
		this.workDeadline = workDeadline;
	}
	public String departmentName() {
		if(departmentName!=null)
			return departmentName;
			else
			return "Admin Department ";
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	
	
	

}
