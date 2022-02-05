package com.mytestProject.interfaces;

public interface AddressInterface {
	
	public void getAddress();
	
	public default void display()   
	{  
	System.out.println("the display() method of DemoInterface1 invoked");  
	}  

}
