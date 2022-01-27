package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class aftermethod {
	WebDriver driver;
	@BeforeMethod
	public void openbrower() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);}
		@Test
  public void verifytitle() {
			String expectedtitle="Google";
			String actualtitl=driver.getTitle();
			Assert.assertSame(actualtitl, expectedtitle, "The title name not match");
			System.out.println("The title name is match");}
			@Test
			public void testsearch() {
				WebElement searchInputField = driver.findElement(By.name("q"));
				Assert.assertTrue(searchInputField.isDisplayed());
				Assert.assertTrue(searchInputField.isEnabled());
				searchInputField.sendKeys("Automation questions");
				System.out.println(driver.getTitle());
				System.out.println("TestSearch is finished");}
			@AfterMethod
			public void laststep(){
				driver.close();
				System.out.println("prgm finish");


				
				
			}
	  
  }

