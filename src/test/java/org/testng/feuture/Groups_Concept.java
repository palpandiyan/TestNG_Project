package org.testng.feuture;

import org.testng.annotations.Test;

public class Groups_Concept {
	
	@Test(groups="Facebook")
	private void Facebook() {
		System.out.println("Facebook Home Page");

	}
	@Test(groups="Facebook")
	private void WhatsApp() {
		System.out.println("Whatsapp Status");

	}
	@Test
	private void Twitter() {
		System.out.println("Twitter Tending videios");

	}
	@Test
	private void Instagram() {
		System.out.println("Instagram Like Videos");

	}
	

		
		
		
	
	
	

	
	

	

	
		
	}
//	@Test
	//private void Instagram() {
	//	System.out.println("");

	//}
	
	
	
	

