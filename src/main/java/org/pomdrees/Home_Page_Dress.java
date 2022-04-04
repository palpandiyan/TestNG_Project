package org.pomdrees;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page_Dress {
	
	public WebDriver driver;
	
	//@FindBy(xpath = "//a[@class='login']") private WebElement Login;
	
	@FindBy(xpath = "//a[@class='login']") private WebElement Login;
	/**
	 * @return the login
	 */
	public WebElement getLogin() {
		return Login;
	}

	@FindBy(id = "email") private WebElement Email;
	
	@FindBy(id = "passwd") private WebElement Password;
	
	@FindBy(id = "SubmitLogin") private WebElement Submit;

	public Home_Page_Dress(WebDriver driver2) {
	 this.driver = driver2;
	 PageFactory.initElements(driver, this);
	 
	}

	

	/**
	 * @return the email
	 */
	public WebElement getEmail() {
		return Email;
	}

	/**
	 * @return the password
	 */
	public WebElement getPassword() {
		return Password;
	}

	/**
	 * @return the submit
	 */
	public WebElement getSubmit() {
		return Submit;
	}
	
	
	
	
	

	

}
