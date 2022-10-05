package com.gl.organizationapp.model;

public class Super_Department {
	
	protected String departmentName,todayWork,workDeadline,isTodayAHoliday,Activity,TechStackInformation;
	
	public String getActivity() {
		return Activity;
	}

	public void setActivity(String activity) {
		Activity = activity;
	}

	public Super_Department(){
		
		departmentName = "Super Department";
		todayWork = "No Work as of now";
		workDeadline = "Nil";
		isTodayAHoliday = "Today is not a holiday";
		
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

	public String getTechStackInformation() {
		return TechStackInformation;
	}

	public void setTechStackInformation(String techStackInformation) {
		TechStackInformation = techStackInformation;
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
