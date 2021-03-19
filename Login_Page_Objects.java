package page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//here I extract a find elemnts and store as seperate methods
//it's helps for code reusablity (POM)
public class Login_Page_Objects {
	
	//Login page objects are 
	//signIn button , username , password , submitbutton
	
	/*
	 * public void username(here we need to add receiver parameter as "WebDriver driver") { 
	 * 	driver.findElement(By.name("email")); //driver cannot be resolved so we need to call the driver object from the mainlogin TCpage
	 *  }
	 *  //here return type is login class so we need to change return type(void) as 'WebElement' and add the 'return' keyword to the function
	//this is the way we extract the find properties/elements to the main code
	//a small correction, when we create a login object to the login class it's creating a dependency in login object class 
	 * so,it's not a best practics that'why we are going to change all methods as 'static' methods then we can access method directly  without object 
	 */
	
	public static WebElement signIn(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a"));
	}
	public static WebElement username(WebDriver driver) {
		return driver.findElement(By.name("email"));
	}
	
	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.id("passwd"));
	}
	
	public static WebElement submit(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\'SubmitLogin\']/span"));
	}


	
}
