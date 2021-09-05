package com.departments.services;

public class SuperDepartment {

	private String departmentName;
	private String todaysWork;
	private String workDeadline;
	private String isTodayAHoliday;
	
	public String departmentName() {
		if(departmentName!=null)
		return departmentName;
		else
		return "Super Department ";
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getTodaysWork() {
		
		if(todaysWork!=null)
			return todaysWork;
			else
			return "No Work as of now ";
		
	}
	public void setTodaysWork(String todaysWork) {
		this.todaysWork = todaysWork;
	}
	public String getWorkDeadline() {
		if(workDeadline!=null) {
			return workDeadline;
		}
		return " Nil ";
	}
	public void setWorkDeadline(String workDeadline) {
		this.workDeadline = workDeadline;
	}
	public String isTodayAHoliday() {
		if(isTodayAHoliday!=null) {
			return isTodayAHoliday;
		}
		return "Today is not a holiday";
	}
	public void setIsTodayAHoliday(String isTodayAHoliday) {
		this.isTodayAHoliday = isTodayAHoliday;
	}
	
	
	
}
