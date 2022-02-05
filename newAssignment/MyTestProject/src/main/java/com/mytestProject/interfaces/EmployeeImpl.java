package com.mytestProject.interfaces;

public class EmployeeImpl implements EmployeeInterface, AddressInterface {

	@Override
	public void display() {
		
		AddressInterface.super.display();
	}

	@Override
	public void getAddress() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getEmployee() {
		// TODO Auto-generated method stub
		
	}


	
	

}
