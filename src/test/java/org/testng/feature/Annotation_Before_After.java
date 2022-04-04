package org.testng.feature;

import org.testng.annotations.Test;

public class Annotation_Before_After {
	
	@Test
	private void woman() {
		System.out.println("woman");

	}
	@Test
	private void signin() {
		 System.out.println("signin");

	}
	@Test
	private void signout() {
		  System.out.println("signout");

	}

}
