package com.gl.organizationapp.model;

public class Hr_Department extends Super_Department	 {
	
	private String Activity ;
		
	public Hr_Department(){
		
		this.departmentName = "Hr Department";
		this.todayWork = "Fill today’s timesheet and mark your attendance";
		this.workDeadline = "Complete by EOD";
		this.Activity  = "team Lunch";
		
	}

	public String doActivity() {
		return Activity;
	}

	public void doActivity(String activity) {
		Activity = activity;
	}


	
}
