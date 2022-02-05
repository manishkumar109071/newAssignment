package com.mytestProject.muUtils;

public class MysuperClass {
	
	public static float calc(int p, int r, int t) {
		return (p*r*t);
		
	}
	

}

class testMyClass extends MysuperClass{
	
	public static float calc(int p, int r, int t) {
		return (p*r*t);
		
	}
	
	public static void main(String[] args) {
		testMyClass.calc(2, 2, 3);
	}
	
}
