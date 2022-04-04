package org.testng.feuture;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Dependency_Test {

	@Test(dependsOnMethods = "watch" )
	private void mobile() {
		System.out.println("mobile");

	}

	@Test
	private void offer() {
		System.out.println("offer");

	}
	
	
	@Test
	private void watch() {
		System.out.println("time");

	}

}
