package com.departments.services;

public class HrDepartment extends SuperDepartment {
	
	private String departmentName; 
	private String todaysWork;  
	private String workDeadline;
	private String doActivity;
	
	public String departmentName() {
		if(departmentName!=null)
			return departmentName;
			else
			return "Hr Department ";
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getTodaysWork() {
		if(todaysWork!=null)
		return todaysWork;
		else
		return  "Fill today’s worksheet and mark your attendance";
	}
	public void setTodaysWork(String todaysWork) {
		this.todaysWork = todaysWork;
	}
	public String getWorkDeadline() {
		if(workDeadline!=null)
		return workDeadline;
		else
		return "Complete by EOD ";
	}
	public void setWorkDeadline(String workDeadline) {
		this.workDeadline = workDeadline;
	}
	public String doActivity() {
		if(doActivity!=null)
		return doActivity;
		else
		return "team Lunch";
	}
	public void setDoActivity(String doActivity) {
		this.doActivity = doActivity;
	}

	
	
}
