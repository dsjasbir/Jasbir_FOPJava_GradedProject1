package com.gl.organizationapp.Service;


import com.gl.organizationapp.model.Admin_Department;
import com.gl.organizationapp.model.Hr_Department;
import com.gl.organizationapp.model.Super_Department;
import com.gl.organizationapp.model.Tech_Department;

public class display {
	
// polymorphism of methods  	
	
	public void displayfunctionalities(Super_Department sd) {
		System.out.println("==".repeat(20));
		System.out.println("Welcome to " + sd.getDepartmentName());
	  	System.out.println(sd.getTodayWork());
	  	System.out.println(sd.getWorkDeadline());
	 	System.out.println(sd.getIsTodayAHoliday());
}

	public void displayfunctionalities(Admin_Department sd) {
		System.out.println("==".repeat(20));
		System.out.println("Welcome to " + sd.getDepartmentName());
	  	System.out.println(sd.getTodayWork());
	  	System.out.println(sd.getWorkDeadline());
	 	System.out.println(sd.getIsTodayAHoliday());
}

	public void displayfunctionalities(Hr_Department sd) {
		System.out.println("==".repeat(20));
		System.out.println("Welcome to " +sd.getDepartmentName());
	  	System.out.println(sd.getTodayWork());
	  	System.out.println(sd.getWorkDeadline());
	  	System.out.println(sd.doActivity());
	 	System.out.println(sd.getIsTodayAHoliday());
}

	public void displayfunctionalities(Tech_Department sd) {
		System.out.println("==".repeat(20));
		System.out.println("Welcome to " + sd.getDepartmentName());
	  	System.out.println(sd.getTodayWork());
	  	System.out.println(sd.getWorkDeadline());
	  	System.out.println(sd.getTechStackInformation());
	 	System.out.println(sd.getIsTodayAHoliday());
}

	

}