package org.testng.feuture;

import org.testng.annotations.Test;

public class Groups_Of_Groups_Concept {
	
	@Test(groups="Twitter")
	private void Twiter() {
		System.out.println("Twitter New Videos");

	}
	@Test(groups="twitter")
	private void Instagram() {
		System.out.println("Insta Page Following");

	}
	@Test(groups="wynkmusic")
	private void WynkMusic() {
		System.out.println("Tamil callertunew");

	}
	@Test(groups="wynkmusic")
	private void Playmusic() {
		System.out.println("Love songs");

	}

}
