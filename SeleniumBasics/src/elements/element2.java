package elements;


import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class element2 {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//url
		driver.get("https://opensource-demo.orangehrmlive.com");
		//imlicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//set window size as we don't have minimize method in selenium
		//driver.manage().window().setSize(new Dimension(500, 600));
		//maximze 
		driver.manage().window().maximize();
		//forgot password
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		//back
		driver.navigate().back();
		Thread.sleep(2000);
		//forward
		driver.navigate().forward();
		Thread.sleep(2000);
		//reload
		driver.navigate().refresh();
		//move to another url
		driver.navigate().to("https://www.google.com");



		


		

	}

}
