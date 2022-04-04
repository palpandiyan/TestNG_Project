package org.testng.feuture;

import org.testng.annotations.Test;

public class Priority_Concept {
	
	
	@Test(priority =1)
	private void Collage() {
		System.out.println(" clg mark");

	}
	@Test(priority=0)//priority = zero
	private void Hssc() {
		System.out.println("Hssc mark");

	}
	@Test(priority=-1)
	private void sllc() {
		System.out.println(" sllc mark");

	}

}
