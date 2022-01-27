package assignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class draganddrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		//get url
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		//switch to frame
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='post-2669']/div[2]/div/div/div[1]/p/iframe")));
		//create instance
		Actions a1=new Actions(driver);
		//Identify source 
		WebElement frame1=driver.findElement(By.xpath("//ul[@id=\'gallery\']/li[1]"));
		Thread.sleep(2000);
		WebElement frame2=driver.findElement(By.xpath("//ul[@id=\'gallery\']/li[2]"));
		Thread.sleep(2000);
		WebElement frame3=driver.findElement(By.xpath("//ul[@id=\'gallery\']/li[3]"));
		Thread.sleep(2000);
		WebElement frame4=driver.findElement(By.xpath("//ul[@id=\'gallery\']/li[4]"));
		Thread.sleep(2000);
		//Identify target
		WebElement target=driver.findElement(By.xpath("//div[@id=\"trash\"]"));
		//call dragAndDrop() of actions class
		a1.dragAndDrop(frame1, target).build().perform();
		Thread.sleep(2000);
		a1.dragAndDrop(frame2, target).build().perform();
		Thread.sleep(2000);
		a1.dragAndDrop(frame3, target).build().perform();
		Thread.sleep(2000);
		a1.dragAndDrop(frame4, target).build().perform();
		Thread.sleep(2000);
		System.out.println("done");




















	}

}
