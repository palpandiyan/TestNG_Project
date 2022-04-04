package org.testng.feuture;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {
	
	@Ignore
	private void Domastic() {
		System.out.println("State Player");

	}
	@Test(enabled = false)
	private void hello() {
		System.out.println("Player");

	}
	@Test(priority=1)
	private void internationalcricket() {
		System.out.println("indian players");

	}
	//@Ignore
	@Test(priority=2)
	private void Ipl() {
		System.out.println("foreign player and indian player");

	}
	

	

	

}
