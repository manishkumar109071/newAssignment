package com.mytestProject.interfaces;

public interface EmployeeInterface {
	
	void getEmployee();
	
	public default void display()   
	{  
	System.out.println("the display() method of DemoInterface1 invoked");  
	}  

}
