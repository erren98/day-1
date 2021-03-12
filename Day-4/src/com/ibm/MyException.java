package com.ibm;

//Cutom Exception to make the user understand the problem
//Good Practice
public class MyException extends Exception{
	public MyException(){
		
	}
	public MyException(String message) {
		super(message);
	}
	
	

}
