package com.ibm;

import com.A;

public class Application {
	public static void main(String[] args) {
		//B b = new A(); //Not allowed as
		//B b = new B();
		//A b = new B();
		A b = new B();
		((B)b).m2(); //Downcasting 
		
		System.out.println(b.age);
		b.m1();
	}
	
	

}
