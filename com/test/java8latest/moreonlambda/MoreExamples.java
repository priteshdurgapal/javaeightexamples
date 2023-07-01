package com.test.java8latest.moreonlambda;

public class MoreExamples  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		call();

	}

	public static void call() {
		Runnable task = new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<10;i++) {
				System.out.println("hello runnable");
				}
			}
		};
		Thread thread = new Thread(task);
		System.out.println(thread.getName());
		thread.start();
	}

}
