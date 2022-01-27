package assignment1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitimes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\java\\Eclipse\\SeleniumBasics\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement acti=driver.findElement(By.cssSelector("table[id=\"demoCredentials\"]>tbody>tr:first-child>td:nth-of-type(2)"));
		String n1=acti.getText().split(" ")[1];
		driver.findElement(By.id("username")).sendKeys(acti.getText().split(" ")[1]);
		System.out.println("n1: "+n1);
		Thread.sleep(20);
		WebElement pass=driver.findElement(By.cssSelector("table[id=\"demoCredentials\"]>tbody>tr:nth-of-type(2)>td"));
		String n2=pass.getText().split(" ")[1];

		System.out.println("n2: "+n2);
		driver.findElement(By.name("pwd")).sendKeys(pass.getText().split(" ")[1]);

		driver.quit();



	}

}
