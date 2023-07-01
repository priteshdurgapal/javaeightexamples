package com.test.java8latest.multiexamples;

public class MyInterfaceImpl implements MyInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyInterfaceImpl myInterfaceImpl = new MyInterfaceImpl();
		myInterfaceImpl.printNonDefault();

	}

	@Override
	public void printNonDefault() {
		// TODO Auto-generated method stub
		System.out.println("print here");
	}

}
