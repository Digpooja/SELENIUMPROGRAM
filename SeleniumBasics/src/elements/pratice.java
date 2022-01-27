package elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class pratice {
     public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("testing");
		Thread.sleep(2000);
		
		List<WebElement> google=driver.findElements(By.xpath("//div[@class='aajZCb']/div[2]/ul/li"));
		System.out.println("total options:"+google.size());
		for(int i=0;i<google.size();i++) {
			System.out.println(google.get(i).getText());
			if(google.get(i).getText().equals("testing techniques")) {
				System.out.println(google.get(i).getText()+"it is present"+i);

				
			}
			

			
		}

	}

}
