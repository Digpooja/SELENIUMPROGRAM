package TestNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testng {
	WebDriver driver;
	@Test(priority=0)
	public void openBroserAndLogin() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();}
	@Test(priority=1)
	public void createAndVerifyTask() throws InterruptedException {
		driver.findElement(By.id("container_tasks")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\'item createNewTasks\']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\'itemRow cpItemRow \']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class=\'projectSelector customerOrProjectSelector selectorWithPlaceholderContainer\']")).sendKeys("New Project");
		Thread.sleep(2000);

		List<WebElement> task= driver.findElements(By.xpath("//tbody/tr/td[@class=\'nameCell first\']/input[@placeholder=\'Enter task name\']"));
		task.get(0).sendKeys("Testing");















	}
}
