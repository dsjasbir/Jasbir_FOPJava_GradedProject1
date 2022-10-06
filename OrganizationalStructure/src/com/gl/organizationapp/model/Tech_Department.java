package com.gl.organizationapp.model;

public class Tech_Department extends Super_Department {
	
private String TechStackInformation ; 
	
public Tech_Department(){
		
		departmentName = "Tech Department";
		todayWork = "Complete coding of module 1";
		workDeadline = "Complete by EOD";
		TechStackInformation  = "Core Java";
		
	}

public String getTechStackInformation() {
	return TechStackInformation;
}

public void setTechStackInformation(String techStackInformation) {
	TechStackInformation = techStackInformation;
}


}
