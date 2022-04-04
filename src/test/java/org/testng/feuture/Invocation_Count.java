package org.testng.feuture;

import org.testng.annotations.Test;

public class Invocation_Count {
	
	
	@Test(priority=-1)
	private void Browser_Lanch() {
		
		System.out.println("Browser lanch");

	}
	@Test
	private void Lanch_Url() {
		
		System.out.println("Lanch Url");

	}
	@Test(invocationCount=3)
	private void refresh() {
		System.out.println("Refresh");

	}

}
