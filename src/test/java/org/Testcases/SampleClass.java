package org.Testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SampleClass {

	@Test(priority = -2)
	@Parameters({ "Login" })
	private void MethodOne() {
		System.out.println("One");

	}

	@Test(priority = -1)
	@Parameters({ "Password" })
	private void MethodTwo() {
		System.out.println("Two");

	}

	@Test(priority = 0)
	@Parameters({ "Username" })
	private void MethodThree() {
		System.out.println("Three");

	}

}
