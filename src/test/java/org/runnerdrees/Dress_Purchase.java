package org.runnerdrees;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.Baseclass.Base_Class_For_All_Project;
import org.apache.commons.io.FileUtils;
import org.configurationdress.Configuration_Reader_Dress;
import org.configurationdress.File_Reader_Dress;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.pomdrees.Dress_Purchase_Page;
import org.pomdrees.Home_Page_Dress;
import org.pomdrees.Page_Object_Manager1;
import org.pomdrees.Payment_Dress_Page;

public class Dress_Purchase extends Base_Class_For_All_Project {
	
   public static WebDriver driver = browser_configuration("chrome");
   
   public static Page_Object_Manager1 pog = new Page_Object_Manager1(driver);
   

	
   //public static Home_Page_Dress hpd = new Home_Page_Dress(driver);
   
  // public static  Dress_Purchase_Page dpp= new Dress_Purchase_Page(driver);
   
  // public static Payment_Dress_Page pdp = new Payment_Dress_Page(driver);
   
	public static void main(String[] args) throws Throwable {

		//System.setProperty("webdriver.chrome.driver",
				//"C:\\Usersrajalpandi\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		
		//clickOnElement(element);
		
		//driver.get("http://automationpractice.com/index.php?id_category=8&controller=category");
		
		String url = File_Reader_Dress.get_FRM().get_CR().get_url();
		getUrl(url);
	
		
		//driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		implicitwait();
		
		//WebElement login = driver.findElement(By.xpath("//a[@class='login']"));
		//login.click();
		clickOnElement(pog.getHpd().getLogin());
		
		//WebElement email = driver.findElement(By.id("email"));
		//email.sendKeys("palpandiyanp361997@gmail.com");
		//inputValueElement(pog.getHpd().getEmail(), "palpandiyanp361997@gmail.com");
		String email = File_Reader_Dress.get_FRM().get_CR().get_email();
		inputValueElement(pog.getHpd().getEmail(),email);
		
		//WebElement password = driver.findElement(By.id("passwd"));
		//password.sendKeys("pandiyan3697");
		//inputValueElement(pog.getHpd().getPassword(), "pandiyan3697");
		String password = File_Reader_Dress.get_FRM().get_CR().get_password();
		inputValueElement(pog.getHpd().getPassword(), password);
		
		//WebElement button = driver.findElement(By.id("SubmitLogin"));
		//button.click();
		clickOnElement(pog.getHpd().getSubmit());
		
	   // WebElement dress = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
	   // dress.click();
	   clickOnElement(pog.getDpp().getDress());
		
	    
	   // WebElement casualdress = driver.findElement(By.xpath("(//a[contains(@title,'You are looking for a dress for every day?')])[1]"));
		//casualdress.click();
	    clickOnElement(pog.getDpp().getCasualdress());
		
		WebElement size = driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
        //size.click();
		clickOnElement(pog.getDpp().getSize());
		
		
		//WebElement list = driver.findElement(By.id("selectProductSort"));
		
		//Select s = new Select(list);
		//s.selectByValue("price:desc");
		dropdown("byvalue",pog.getDpp().getList(),"price:desc");
		
		//WebElement img = driver.findElement(By.xpath("//img[@width='250']"));
		//img.click();
		clickOnElement(pog.getDpp().getImage());
		
		//WebElement addcart = driver.findElement(By.name("Submit"));
		//addcart.click();
		clickOnElement(pog.getDpp().getAddcard());
		
		
		
		//WebElement proceed = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
	 //	proceed.click();
		clickOnElement(pog.getPdp().getProcced());
		
		//WebElement proceesd1 = driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
		//proceesd1.click();
		
		clickOnElement(pog.getPdp().getProcced1());
		
		//WebElement proceesd2 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		//proceesd2.click();
		clickOnElement(pog.getPdp().getProcced2());
		
		//WebElement agree = driver.findElement(By.id("cgv"));
		//agree.click();
		clickOnElement(pog.getPdp().getAgree());
		
		//WebElement proceesd3 = driver.findElement(By.name("processCarrier"));
		//proceesd3.click();
		clickOnElement(pog.getPdp().getProcced3());
		
		//WebElement payment = driver.findElement(By.xpath("//a[@class='bankwire']"));
		
		//payment.click();
		clickOnElement(pog.getPdp().getPayment());
		
		//WebElement confirmorder = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		//confirmorder.click();
		clickOnElement(pog.getPdp().getConfirmorder());
		
//		TakesScreenshot ts = (TakesScreenshot) driver;
		
//		File location = ts.getScreenshotAs(OutputType.FILE);
		
//		File dest = new File("C:\\Usersrajalpandi\\eclipse-workspace\\Selenium\\Screenshot\\purchase.png");
		
//		FileUtils.copyFile(location, dest);
		takescreenshoot("C:\\Usersrajalpandi\\eclipse-workspace\\Selenium\\Screenshot\\purchase.png");
		
//		WebElement logout = driver.findElement(By.xpath("(//a[@rel=\"nofollow\"])[2]"));
		//logout.click();
		clickOnElement(pog.getPdp().getLogout());
	}
}
		
		
		
		
		
		
	
		
		//list1.click();
		
		
		
		
		