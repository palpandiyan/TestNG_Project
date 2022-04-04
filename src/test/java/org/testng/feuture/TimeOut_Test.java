package org.testng.feuture;

import org.testng.annotations.Test;

public class TimeOut_Test {
	
	@Test(timeOut = 7000)
	private void Browser_Execution() throws Throwable  {
		
		Thread.sleep(1000);//launch in the browser
		System.out.println("Browser launch");
		
		Thread.sleep(2000);// launch in the Url
		System.out.println("Url lanuch");
		
		Thread.sleep(1000);
		System.out.println("Credentials Entered");
		
		Thread.sleep(1000);
		System.out.println("Next page");
		
		

	}

}
