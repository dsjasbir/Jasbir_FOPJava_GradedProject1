package com.gl.organizationapp.model;

public class Super_Department {
	
	public String departmentName,todayWork,workDeadline,isTodayAHoliday ;
	
	public Super_Department(){
		
		this.departmentName = "Super Department";
		this.todayWork = "No Work as of now";
		this.workDeadline = "Nil";
		this.isTodayAHoliday =  "Today is not a holiday";
		
	}
	
	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getTodayWork() {
		return todayWork;
	}

	public void setTodayWork(String todayWork) {
		this.todayWork = todayWork;
	}

	public String getWorkDeadline() {
		return workDeadline;
	}

	public void setWorkDeadline(String workDeadline) {
		this.workDeadline = workDeadline;
	}

	public String getIsTodayAHoliday() {
		return isTodayAHoliday;
	}

	public void setIsTodayAHoliday(String isTodayAHoliday) {
		this.isTodayAHoliday = isTodayAHoliday;
	}

	

	
}
