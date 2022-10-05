package com.gl.organizationapp.model;

public class Hr_Department extends Super_Department	 {
		
	public Hr_Department(){
		
		departmentName = "Hr Department";
		todayWork = "Fill today’s timesheet and mark your attendance";
		workDeadline = "Complete by EOD";
		Activity  = "team Lunch";
		
	}

	 public String doActivity() {
		 
		 return Activity;
		 
	 }
	

}
