package com.test.java8latest.multiexamples;

public interface MyInterface {

	default void printMy() {
		System.out.println("hello from default");
	}
	
	void printNonDefault();
}
