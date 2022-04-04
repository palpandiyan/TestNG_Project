package org.pomdrees;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dress_Purchase_Page {
	
		
	
	public WebDriver driver;
	@FindBy(xpath="(//a[@title='Dresses'])[2]") private WebElement dress;
	@FindBy(xpath="(//a[contains(@title,'You are looking for a dress for every day?')])[1]") private WebElement casualdress;
	@FindBy(xpath="(//input[@type='checkbox'])[3]") private WebElement size;
	@FindBy(id="selectProductSort")private WebElement list;
	@FindBy(xpath="//img[@width='250']")private WebElement image;
	@FindBy(name="Submit")private WebElement addcard;
	
	public Dress_Purchase_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);

}

	/**
	 * @return the dress
	 */
	public WebElement getDress() {
		return dress;
	}

	/**
	 * @return the casualdress
	 */
	public WebElement getCasualdress() {
		return casualdress;
	}

	/**
	 * @return the size
	 */
	public WebElement getSize() {
		return size;
	}

	/**
	 * @return the list
	 */
	public WebElement getList() {
		return list;
	}

	/**
	 * @return the image
	 */
	public WebElement getImage() {
		return image;
	}

	/**
	 * @return the addcard
	 */
	public WebElement getAddcard() {
		return addcard;
	}
	
}
