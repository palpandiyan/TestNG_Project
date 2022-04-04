package org.pomdrees;

import org.openqa.selenium.WebDriver;

public class Page_Object_Manager1 {
	
	public Page_Object_Manager1(WebDriver driver2) {
		this.driver= driver2;
	}

	/**
	 * @return the hpd
	 */
	public Home_Page_Dress getHpd() {
		if(hpd==null) {
			hpd = new Home_Page_Dress(driver);
		}
		
		return hpd;
	}

	/**
	 * @return the dpp
	 */
	public Dress_Purchase_Page getDpp() {
		if(dpp==null) {
			dpp= new Dress_Purchase_Page(driver);
		}
		
		return dpp;
	}

	/**
	 * @return the pdp
	 */
	public Payment_Dress_Page getPdp() {
		
		if(pdp==null) {
			pdp = new Payment_Dress_Page(driver);
		}
		return pdp;
		
	}

	public WebDriver driver;
	
	private Home_Page_Dress hpd;
	
	private Dress_Purchase_Page dpp;
	
	private  Payment_Dress_Page pdp;
	
	
	
	
	
	

}
