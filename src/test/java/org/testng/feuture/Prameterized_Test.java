package org.testng.feuture;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Prameterized_Test {
	
	@Test
	@Parameters({"username","password"})
	private void credentialse(String username,String password) {
		
		System.out.println("username:"+username);
		System.out.println("password:"+password);

	}

		

	}
		

	
	


