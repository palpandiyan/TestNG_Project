package org.pomdrees;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Dress_Page {

	public WebDriver driver;

//	@FindBy(xpath = "//a[@class='btn btn-default button button-medium']")
	@FindBy(xpath = "//a[@class='btn btn-default button button-medium']")
	private WebElement procced;
	@FindBy(xpath = "//a[@class='button btn btn-default standard-checkout button-medium']")
	private WebElement procced1;
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement procced2;
	@FindBy(id = "cgv")
	private WebElement agree;
	@FindBy(name = "processCarrier")
	private WebElement procced3;
	@FindBy(xpath = "//a[@class='bankwire']")
	private WebElement payment;
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement confirmorder;
	@FindBy(xpath="(//a[@rel=\"nofollow\"])[2]") private WebElement logout;

	/**
	 * @return the logout
	 */
	public WebElement getLogout() {
		return logout;
	}

	// @FindBy(xpath="C:\\\\Usersrajalpandi\\\\eclipse-workspace\\\\Selenium\\\\Screenshot\\\\purchase.png")private
	// WebElement takesscreen;
	public Payment_Dress_Page(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	/**
	 * @return the procced
	 */
	public WebElement getProcced() {
		return procced;
	}

	/**
	 * @return the procced1
	 */
	public WebElement getProcced1() {
		return procced1;
	}

	/**
	 * @return the procced2
	 */
	public WebElement getProcced2() {
		return procced2;
	}

	/**
	 * @return the agree
	 */
	public WebElement getAgree() {
		return agree;
	}

	/**
	 * @return the procced3
	 */
	public WebElement getProcced3() {
		return procced3;
	}

	/**
	 * @return the payment
	 */
	public WebElement getPayment() {
		return payment;
	}

	/**
	 * @return the confirmorder
	 */
	public WebElement getConfirmorder() {
		return confirmorder;
	}

}
