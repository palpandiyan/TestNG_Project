package org.testng.feuture;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_Concept {
	
	@Test
	private void adctin(String username , int password) {
		
		System.out.println("username:"+username);
		System.out.println("password:+password");

	}
	@DataProvider
	 private void test_data() {
		
		

	}

}
