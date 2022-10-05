package com.gl.organizationapp.Service;

import com.gl.organizationapp.model.Super_Department;

public class display {
	
	

	public void displayfunctionalities(Super_Department sd) {
		
	 System.out.println("==".repeat(10));	
		
	 if (sd.getDepartmentName() != null) {
		 System.out.println(sd.getDepartmentName());
	 }
	 
	 
	 if (sd.getTodayWork() != null) {
		 System.out.println(sd.getTodayWork());
	 }
	 
	 
	 if (sd.getWorkDeadline() != null) {
		 System.out.println(sd.getWorkDeadline());
	 }
	 
	 if (sd.getActivity() != null) {
		 System.out.println(sd.getActivity());
	 }
	  
	 
	 if (sd.getTechStackInformation() != null) {
		 System.out.println(sd.getTechStackInformation());
	 }
	 
	 if (sd.getIsTodayAHoliday() != null) {
		 System.out.println(sd.getIsTodayAHoliday());
	 }
	 
	
		

}
}