package assignment1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fincat3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\java\\Eclipse\\SeleniumBasics\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//maximize the page

		List<WebElement>google =driver.findElements(By.xpath("//*[@id=\"nav-xshop\"]/a"));

		System.out.println("Options count: "+google.size());
		for(WebElement links : google)
		{
			System.out.println(links.getText());	
		}
		driver.quit();



	}
}
