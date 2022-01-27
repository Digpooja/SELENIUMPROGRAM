package assignment1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findcat2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\java\\Eclipse\\SeleniumBasics\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//maximize the page
		driver.manage().window().maximize();
		List<WebElement> flipkart=driver.findElements(By.cssSelector("div[class=\"eFQ30H\"]>a"));
		System.out.println("Options count: "+flipkart.size());
		for(int i=0;i<flipkart.size();i++) {
			WebElement option=flipkart.get(i);
			System.out.println(option.getText());}
		driver.quit();
	}

}





