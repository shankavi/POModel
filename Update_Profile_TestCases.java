package pom_TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import page_Objects.Login_Page_Objects;
import page_Objects.Update_Page_Objects;

public class Update_Profile_TestCases {
	@Test
	public void update_profile() {
		//login -> my address -> add new adderss -> add address fields -> save
		//update already given objects
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Drivers\\chromedriver_ver88\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/");
		
		//call the finded element locators from Login_Page_Objects class
		
		Login_Page_Objects.signIn(driver).click();
		Login_Page_Objects.username(driver).sendKeys("pom@gmail.com");
		Login_Page_Objects.password(driver).sendKeys("demouser");
		Login_Page_Objects.submit(driver).click();
		
		
		//navigate to update page
		Update_Page_Objects.myAddress(driver).click();
		//update postal code
		Update_Page_Objects.update(driver).click();
		Update_Page_Objects.Zip_Potalcode(driver).clear();
		Update_Page_Objects.Zip_Potalcode(driver).sendKeys("20202");
		Update_Page_Objects.saveAdderss(driver).click();
		
		

		
		
		
	}
}
