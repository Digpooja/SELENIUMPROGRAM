package assignment1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//List<WebElement>name =driver.findElements(By.xpath("//table[@id=\"demoCredentials\"]/tbody/tr/td[2]"));
		WebElement name=driver.findElement(By.id("username"));
		name.sendKeys("admin ");
		WebElement pass=driver.findElement(By.name("pwd"));
		pass.sendKeys("manager" );
		WebElement login=driver.findElement(By.xpath("//a[@id='loginButton']"));
		login.click();
		Thread.sleep(5000);
		WebElement task=driver.findElement(By.xpath("//div[@id='container_tasks']"));
		task.click();
		String expectedtask="https://demo.actitime.com/tasks/tasklist.do";
		String actualtask=driver.getCurrentUrl();
		if(expectedtask.equals(actualtask)) {
			System.out.println("the page is match");}
		else {
			System.out.println("not match");}
		Thread.sleep(2000);
		//click on addnew
		WebElement addnew=driver.findElement(By.xpath("//div[text()='Add New']"));
		addnew.click();
		Thread.sleep(2000);
		//dropdown
		WebElement select=driver.findElement(By.xpath("//div[@class='item createNewTasks']"));
		select.click();
		Thread.sleep(2000);
		//select customor
		WebElement task1=driver.findElement(By.cssSelector("div[class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer\']"));
		task1.click();
		WebElement addnew1=driver.findElement(By.xpath("//div[@class=\'itemRow \']"));
		addnew1.click();
		Thread.sleep(2000);
		WebElement addnew2=driver.findElement(By.xpath("//input[@class=\'newCustomer newCustomerProjectField inputFieldWithPlaceholder\']"));
		addnew2.sendKeys("Pooja Patil ");
		WebElement addnew3=driver.findElement(By.xpath("//input[@class='newProject newCustomerProjectField inputFieldWithPlaceholder']"));
		addnew3.sendKeys("Anroid Testing");
		Thread.sleep(2000);
		WebElement addnew4=driver.findElement(By.xpath("//input[@class=\'inputFieldWithPlaceholder\']"));
		addnew4.sendKeys("Testing");

		//click on create task
		WebElement create=driver.findElement(By.xpath("//div[text()='Create Tasks']"));
		create.click();
		//validation
		String expectedtitle="https://demo.actitime.com/tasks/tasklist.do";
		String actualtitle=driver.getCurrentUrl();
		if(expectedtitle.equals(actualtitle)) {
			System.out.println("The url is validate");}
		else {
	      System.out.println("The url is not validate");}
		//click on testing
		WebElement clickT=driver.findElement(By.xpath("//div[@id='taskListBlock']"));
		clickT.click();
		


	}
}






















