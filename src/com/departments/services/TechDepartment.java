package com.departments.services;

public class TechDepartment extends SuperDepartment {
	
	private String departmentName; 
    private String todaysWork;  
    private String workDeadline;
    private String techStackInformation;
    
	public String departmentName() {
		
		if(departmentName!=null)
		return departmentName;
		else
			return " Tech Department ";
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getTodaysWork() {
		if(todaysWork!=null)
		return todaysWork;
		else
			return  "Complete coding of module 1";
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
	public String getTechStackInformation() {
		if(techStackInformation!=null)
		return techStackInformation;
		else
		return "core Java";
	}
	public void setTechStackInformation(String techStackInformation) {
		this.techStackInformation = techStackInformation;
	}

    

}
