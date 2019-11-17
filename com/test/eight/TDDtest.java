package com.test.eight;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class TDDtest {

	private HelloWorld helloworld;
	
	@Before
	public void setup() {
		helloworld = new HelloWorld();
	}
	@Test
	public void testName() {
		
		String name="helloworld";
		Assert.assertEquals(name, helloworld.getWelcome());
	}
	
}
