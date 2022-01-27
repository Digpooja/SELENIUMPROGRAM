package assignment1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findcat {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\java\\Eclipse\\SeleniumBasics\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		//maximize the page
		driver.manage().window().maximize();
		List<WebElement> topname=driver.findElements(By.cssSelector("ul[class=\"nav navbar-nav\"] >li>a"));
		System.out.println("Options count: "+topname.size());
		for(int i=0;i<topname.size();i++) {
			WebElement option=topname.get(i);
			System.out.println(option.getText());

		}
		driver.quit();
		

	}
}
