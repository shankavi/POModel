package page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Update_Page_Objects {
	
	//login -> my address -> add new adderss -> add address fields -> save
	
	/*
	 * public static WebElement signIn(WebDriver driver) { return
	 * driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a"))
	 * ; } public static WebElement username(WebDriver driver) { return
	 * driver.findElement(By.name("email")); }
	 * 
	 * public static WebElement password(WebDriver driver) { return
	 * driver.findElement(By.id("passwd")); }
	 * 
	 * public static WebElement submitLogin(WebDriver driver) { return
	 * driver.findElement(By.xpath("//*[@id=\'SubmitLogin\']/span")); }
	 */
	
	public static WebElement myAddress(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\'center_column\']/div/div[1]/ul/li[3]/a/span"));
	}
	
	public static WebElement addNewAddress(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\'center_column\']/div[2]/a/span"));
	}
	//add adress fields
	
	public static WebElement Address1 (WebDriver driver) {
		return driver.findElement(By.id("address1"));
	}
	
	public static WebElement Address2 (WebDriver driver) {
		return driver.findElement(By.id("address2"));
	}
	
	public static WebElement city (WebDriver driver) {
		return driver.findElement(By.id("city"));
	}
	
	public static WebElement state (WebDriver driver) {
		return driver.findElement(By.id("id_state"));
	}
	
	public static WebElement Zip_Potalcode (WebDriver driver) {
		return driver.findElement(By.id("postcode"));
	}
	
	public static WebElement country (WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\'id_country\']"));
	}
	
	public static WebElement home_phone (WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\'phone\']"));
	}
	
	public static WebElement mobhile (WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\'phone_mobile\']"));
	}

	public static WebElement aditionalInfo (WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\'other\']"));
	}
	
	public static WebElement addressReference (WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\'alias\']"));
	}

	public static WebElement saveAdderss (WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\'submitAddress\']/span"));
	}
	
	//update button
	public static WebElement update (WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/div/div[2]/ul/li[9]/a[1]/span"));
	}

//delete add newAdress
	
	public static WebElement delete (WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/div/div[2]/ul/li[9]/a[2]/span"));
	}




}
