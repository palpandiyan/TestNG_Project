package org.runnerclasstestng;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.Baseclass.Base_Class_For_All_Project;
import org.apache.commons.exec.LogOutputStream;
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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

	


public class RunnerClass1234 extends Base_Class_For_All_Project {
	
   public static WebDriver driver = browser_configuration("chrome");
   
   public static Page_Object_Manager1 pog = new Page_Object_Manager1(driver);
   
	public static ExtentReports reports;
	public static ExtentTest test;
	public static ExtentSparkReporter spark_reporter;
	
	@BeforeTest
	private void report_Generation() {
		 spark_reporter = new ExtentSparkReporter("C:\\Usersrajalpandi\\eclipse-workspace\\Maven_Project_Class\\Reports_Apr\\Extent_Report.html");

		 reports = new ExtentReports();
		 
		 reports.attachReporter(spark_reporter);
		 
	}
	@AfterTest
	private void flush() {
		reports.flush();

	}


   
   
//	public static void main(String[] args) throws Throwable {
	
   @BeforeClass
    private void browserlaunch() throws Throwable {
	   String url = File_Reader_Dress.get_FRM().get_CR().get_url();
		getUrl(url);

	}
   
   @BeforeMethod
   private void Login() throws Throwable {
	   implicitwait();
	   clickOnElement(pog.getHpd().getLogin());
		String email = File_Reader_Dress.get_FRM().get_CR().get_email();
		inputValueElement(pog.getHpd().getEmail(),email);
		String password = File_Reader_Dress.get_FRM().get_CR().get_password();
		inputValueElement(pog.getHpd().getPassword(), password);
		clickOnElement(pog.getHpd().getSubmit());

}
   
  
   
   
   
   @Test private void casualdress() throws Exception {
	   implicitwait();

		//String url = File_Reader_Dress.get_FRM().get_CR().get_url();
		//getUrl(url);
		//clickOnElement(pog.getHpd().getLogin());
		//String email = File_Reader_Dress.get_FRM().get_CR().get_email();
		//inputValueElement(pog.getHpd().getEmail(),email);
		//String password = File_Reader_Dress.get_FRM().get_CR().get_password();
		//inputValueElement(pog.getHpd().getPassword(), password);
		//clickOnElement(pog.getHpd().getSubmit());
	   clickOnElement(pog.getDpp().getDress());
	    clickOnElement(pog.getDpp().getCasualdress());
		WebElement size = driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
		clickOnElement(pog.getDpp().getSize());
		dropdown("byvalue",pog.getDpp().getList(),"price:desc");
		clickOnElement(pog.getDpp().getImage());
		clickOnElement(pog.getDpp().getAddcard());
		clickOnElement(pog.getPdp().getProcced());
		clickOnElement(pog.getPdp().getProcced1());
		clickOnElement(pog.getPdp().getProcced2());
		clickOnElement(pog.getPdp().getAgree());
		clickOnElement(pog.getPdp().getProcced3());
		clickOnElement(pog.getPdp().getPayment());
		clickOnElement(pog.getPdp().getConfirmorder());
		takescreenshoot("C:\\Usersrajalpandi\\eclipse-workspace\\Selenium\\Screenshot\\purchase.png");
		
		

}  
   @Test private void summerdress() throws Exception {
	   implicitwait();

		//String url = File_Reader_Dress.get_FRM().get_CR().get_url();
		//getUrl(url);
		
	   clickOnElement(pog.getDpp().getDress());
	    clickOnElement(pog.getDpp().getCasualdress());
		WebElement size = driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
		clickOnElement(pog.getDpp().getSize());
		dropdown("byvalue",pog.getDpp().getList(),"price:desc");
		clickOnElement(pog.getDpp().getImage());
		clickOnElement(pog.getDpp().getAddcard());
		clickOnElement(pog.getPdp().getProcced());
		clickOnElement(pog.getPdp().getProcced1());
		clickOnElement(pog.getPdp().getProcced2());
		clickOnElement(pog.getPdp().getAgree());
		clickOnElement(pog.getPdp().getProcced3());
		clickOnElement(pog.getPdp().getPayment());
		clickOnElement(pog.getPdp().getConfirmorder());
		takescreenshoot("C:\\Usersrajalpandi\\eclipse-workspace\\Selenium\\Screenshot\\purchase.png");
		
		
}
   @Test private void winterdress() throws Exception {


      implicitwait();

		//String url = File_Reader_Dress.get_FRM().get_CR().get_url();
		//getUrl(url);
		
	   clickOnElement(pog.getDpp().getDress());
	    clickOnElement(pog.getDpp().getCasualdress());
		WebElement size = driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
		clickOnElement(pog.getDpp().getSize());
		dropdown("byvalue",pog.getDpp().getList(),"price:desc");
		clickOnElement(pog.getDpp().getImage());
		clickOnElement(pog.getDpp().getAddcard());
		clickOnElement(pog.getPdp().getProcced());
		clickOnElement(pog.getPdp().getProcced1());
		clickOnElement(pog.getPdp().getProcced2());
		clickOnElement(pog.getPdp().getAgree());
		clickOnElement(pog.getPdp().getProcced3());
		clickOnElement(pog.getPdp().getPayment());
		clickOnElement(pog.getPdp().getConfirmorder());
		takescreenshoot("C:\\Usersrajalpandi\\eclipse-workspace\\Selenium\\Screenshot\\purchase.png");
		
   }	
	@AfterMethod
	private void logout() {
		
		clickOnElement(pog.getPdp().getLogout());
	}
	 

   
}
		
		
		


