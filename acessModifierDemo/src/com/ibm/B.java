package com.ibm;

import com.A;

public class B extends A {
	protected int age = 10; //shadowing 
	
	void m2() {
		System.out.println(age);
	}

}
