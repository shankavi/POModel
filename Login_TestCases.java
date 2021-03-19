package pom_TestCases;

import org.testng.annotations.Test;

import page_Objects.Login_Page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * main page link - > http://automationpractice.com/index.php?controller=authentication#account-creation
 * Login user name -> Email : pom@gmail.com
 * Login password -> Password : demouser
 * 
 */
public class Login_TestCases {
	  
  @Test
public void Login() {
	 
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver_ver88\\chromedriver.exe");
		
	  WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/");
		/*
		 * //here we call the Login_Page_Objects and create object
		 * 
		 * Login_Page_Objects loginPageObj = new Login_Page_Objects(); //plz go & add
		 * recever parameter for the username method
		 * loginPageObj.username(driver).sendKeys("pom@gmail.com");; //The static method
		 * username(WebDriver) from the type Login_Page_Objects should be accessed in a
		 * static way //so above created objected is not needed we can directly access
		 * the Login_Page_Objects class //becz Login_Page_Objects class methods are
		 * static methods :)
		 */
		//Scripting using POM
		//Call class . method . inputActions 
		Login_Page_Objects.signIn(driver).click();
		Login_Page_Objects.username(driver).sendKeys("pom@gmail.com");
		Login_Page_Objects.password(driver).sendKeys("demouser");
		Login_Page_Objects.submit(driver).click();
		
		//driver.quit();
		
		/*//scripting without usin POM
		 * 
		 * driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a"))
		 * .click();
		 * 
		 * driver.findElement(By.name("email")).sendKeys("pom@gmail.com");
		 * 
		 * driver.findElement(By.id("passwd")).sendKeys("demouser");
		 * 
		 * driver.findElement(By.xpath("//*[@id=\'SubmitLogin\']/span")).click();
		 * 
		 * driver.quit();
		 */
		
		
  }
}
