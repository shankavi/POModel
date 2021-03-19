package pom_TestCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import page_Objects.Login_Page_Objects;
import page_Objects.Update_Page_Objects;

public class AddNew_TestCases {

	@Test
	public void add_NewAddress() {
		
		//login -> my address -> add new adderss -> add address fields -> save
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Drivers\\chromedriver_ver88\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/");
		
		//call the finded element locators from Login_Page_Objects class
		
		Login_Page_Objects.signIn(driver).click();
		Login_Page_Objects.username(driver).sendKeys("pom@gmail.com");
		Login_Page_Objects.password(driver).sendKeys("demouser");
		Login_Page_Objects.submit(driver).click();
		
		
		
		//delete previous add user
		
		Update_Page_Objects.myAddress(driver).click();
		Update_Page_Objects.delete(driver).click();
		//delete alert handling
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		//call the finded element locators from Update_Page_Objects class
		
		//Update_Page_Objects.myAddress(driver).click();
		Update_Page_Objects.addNewAddress(driver).click();
		Update_Page_Objects.Address1(driver).sendKeys("No - 123");
		Update_Page_Objects.Address2(driver).sendKeys("white road,");
		Update_Page_Objects.city(driver).sendKeys("NewYork");
		Update_Page_Objects.state(driver).sendKeys("Ohio");
		Update_Page_Objects.Zip_Potalcode(driver).sendKeys("14785");
		Update_Page_Objects.home_phone(driver).sendKeys("1236547890");
		Update_Page_Objects.mobhile(driver).sendKeys("9632587410");
		Update_Page_Objects.aditionalInfo(driver).sendKeys("my 2nd address");
		Update_Page_Objects.addressReference(driver).sendKeys(" New Address");
		Update_Page_Objects.saveAdderss(driver).click();
	
		

		
		
		
	}
}
