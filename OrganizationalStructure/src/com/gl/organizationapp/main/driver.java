package com.gl.organizationapp.main;

import com.gl.organizationapp.model.Admin_Department;
import com.gl.organizationapp.model.Hr_Department;
import com.gl.organizationapp.model.Super_Department;
import com.gl.organizationapp.model.Tech_Department;
import com.gl.organizationapp.Service.display;

public class driver {
	
	
 

	public static void main(String[] args) {
		//Supper Department 
		Super_Department superDept = new Super_Department();
		
		//Admin Department 	
		Admin_Department adminDept = new Admin_Department();

		//HR Department 	
		Hr_Department hrDept = new Hr_Department();

		//Tech Department 	
		Tech_Department techDept = new Tech_Department();

		//Display all Functionalities 
		
		display show = new display();
		show.displayfunctionalities(superDept);
		show.displayfunctionalities(adminDept);
		show.displayfunctionalities(hrDept);
		show.displayfunctionalities(techDept);
		
		
		
		
	}

}