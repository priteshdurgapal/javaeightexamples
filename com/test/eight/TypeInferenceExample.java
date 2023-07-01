package com.test.eight;

public class TypeInferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringLengthLambda myLambda = (s)->s.length();
		System.out.println(myLambda.getLength("Hello Lambda"));
	}
	
	interface StringLengthLambda {
		int getLength(String s);
	}

}
