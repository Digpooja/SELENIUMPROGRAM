package practice;

import org.testng.annotations.Test;

import utilties.utility1;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class PracticeXL extends utility1{
	public static WebDriver driver;
	FetchLocator fetchLocator = new FetchLocator();
	@Test
	public void f()
	{
		//fetchLocator.locator(driver, "Username", "ID").click();
		fetchLocator.locator(driver, "Username", "ID").sendKeys("admin");
		fetchLocator.locator(driver, "Password", "XPATH").sendKeys("manager");
		fetchLocator.locator(driver, "Login", "ID").click();
	}
	@BeforeMethod
	public void beforeMethod() 
	{
		driver = setUp("chrome", "https://demo.actitime.com/login.do");
	}

	@AfterMethod
	public void afterMethod() 
	{
		driver.close();
		driver.quit();
	}

}
