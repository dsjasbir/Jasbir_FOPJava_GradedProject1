package com.gl.organizationapp.service;


import com.gl.organizationapp.model.Admin_Department;
import com.gl.organizationapp.model.Hr_Department;
import com.gl.organizationapp.model.Super_Department;
import com.gl.organizationapp.model.Tech_Department;

public class display {
	
// polymorphism of methods  	
	
	public void displayfunctionalities(Super_Department dept) {
		System.out.println("==".repeat(20));
		System.out.println("Welcome to " + dept.getDepartmentName());
	  	System.out.println(dept.getTodayWork());
	  	System.out.println(dept.getWorkDeadline());
	 	System.out.println(dept.getIsTodayAHoliday());
}

	public void displayfunctionalities(Admin_Department dept) {
		System.out.println("==".repeat(20));
		System.out.println("Welcome to " + dept.getDepartmentName());
	  	System.out.println(dept.getTodayWork());
	  	System.out.println(dept.getWorkDeadline());
	 	System.out.println(dept.getIsTodayAHoliday());
}

	public void displayfunctionalities(Hr_Department dept) {
		System.out.println("==".repeat(20));
		System.out.println("Welcome to " +dept.getDepartmentName());
		System.out.println(dept.doActivity());
	  	System.out.println(dept.getTodayWork());
	  	System.out.println(dept.getWorkDeadline());
	 	System.out.println(dept.getIsTodayAHoliday());
}

	public void displayfunctionalities(Tech_Department dept) {
		System.out.println("==".repeat(20));
		System.out.println("Welcome to " + dept.getDepartmentName());
	  	System.out.println(dept.getTodayWork());
	  	System.out.println(dept.getWorkDeadline());
	  	System.out.println(dept.getTechStackInformation());
	 	System.out.println(dept.getIsTodayAHoliday());
}

	

}