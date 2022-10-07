package com.gl.organizationapp.model;

public class Tech_Department extends Super_Department {
	
private String TechStackInformation ; 
	
public Tech_Department(){
		
		this.departmentName = "Tech Department";
		this.todayWork = "Complete coding of module 1";
		this.workDeadline = "Complete by EOD";
		this.TechStackInformation  = "Core Java";
		
	}

public String getTechStackInformation() {
	return TechStackInformation;
}

public void setTechStackInformation(String techStackInformation) {
	TechStackInformation = techStackInformation;
}


}
