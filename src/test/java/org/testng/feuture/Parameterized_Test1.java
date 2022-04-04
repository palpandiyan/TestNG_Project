package org.testng.feuture;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Test1 {



	
	@Test
	@Parameters({"username","password"})
	private void credentialse(@Optional("palpandiyan")String username,@Optional("pandiyan@367")String password) {
		
		System.out.println("username:"+username);
		System.out.println("password:"+password);


}
}
