package com.test.eight;

public class HelloFunction {

	public void display(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
		/*
		 * int a[]=new int[4]; System.out.println(a[1]); System.out.println(a[2]);
		 */
		// TODO Auto-generated method stub
		// HelloFunction hellofunction = new HelloFunction();
		// HelloWorldGreeting helloworldgreeting = new HelloWorldGreeting();
		// helloworldgreeting.perform();
		// hellofunction.display();
		// Greeting helloWorldGreeting = new HelloWorldGreeting();
		// hellofunction.display(helloWorldGreeting);

		// Greeting myLambaFunction = () -> System.out.println("hello worl from
		// lambda");
		// MyAdd addFunction = (int a, int b) -> a + b;

		// inline instance of interface
		/*
		 * Greeting innerClassGreeting = new Greeting() { // implemetation
		 * 
		 * @Override public void perform() { // TODO Auto-generated method stub
		 * System.out.println("Hello anonymous inner class"); } };
		 */

		/*
		 * hellofunction.display(innerClassGreeting);
		 * hellofunction.display(myLambaFunction); myLambaFunction.perform();
		 */
		// test
		Greeting greet = new HelloWorldGreeting();
		greet.perform();
		HelloWorldGreeting greetimpl = new HelloWorldGreeting();
		greetimpl.perform();

		Greeting greetanony = new Greeting() {

			@Override
			public void perform() {
				// TODO Auto-generated method stub
				System.out.println("hello from inner anony");
			}

		};
		// HelloFunction hfn = new HelloFunction();
		// hfn.display(greetanony);
		// greetanony.perform();
		Greeting greetanonylambda = () -> System.out.println("hello from inner anony of lambda");

		greetanonylambda.perform();
	}
}

/*
 * interface MyLamba{ void foo(); }
 * 
 * interface MyAdd{ int add( int x, int y); }
 */