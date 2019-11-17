package com.test.eight;

public class RunnableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread myThread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("hello from runnable");
				
			}
		});
		//myThread.run();	
		
		Thread myThreadLambda = new Thread(()->System.out.println("hello from runnable lambda"));
		//myThreadLambda.run();
		
		/*Thread myThreadLambdaMR = new Thread(RunnableExamplerun());
		myThreadLambdaMR.start();*/
	}

}
