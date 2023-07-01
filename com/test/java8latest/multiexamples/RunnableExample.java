package com.test.java8latest.multiexamples;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RunnableExample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable task = () -> {
			System.out.println("Hello");
		};
		
		ExecutorService executor = Executors.newFixedThreadPool(1);
		executor.execute(task);
		
		Callable<String> callable = () -> {
			String s = "hello";
			System.out.println(s);
			return s;
		};
		
		ExecutorService executor2 = Executors.newFixedThreadPool(1);
		Future<String> furture = executor2.submit(callable);

	}

}
