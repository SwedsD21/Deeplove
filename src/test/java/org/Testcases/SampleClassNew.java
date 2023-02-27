package org.Testcases;

import org.testng.annotations.Test;

public class SampleClassNew {
	@Test(priority = -5)
	private void MethodOne() {
		System.out.println("four");

	}

	@Test(priority = -2)
	private void MethodTwo() {
		System.out.println("five");

	}

	@Test(priority = 6,enabled = false)
	private void MethodThree() {
		System.out.println("six");

	}

}
