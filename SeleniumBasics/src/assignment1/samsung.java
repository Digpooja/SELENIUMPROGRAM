package assignment1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class samsung {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gsmarena.com");
List<WebElement> mobiles=driver.findElements(By.cssSelector("div[class='brandmenu-v2 light l-box clearfix']>ul>li>a"));
		System.out.println("Options count: "+mobiles.size());
		for(int i=0;i<mobiles.size();i++) {
			 mobiles=driver.findElements(By.cssSelector("div[class='brandmenu-v2 light l-box clearfix']>ul>li>a"));
         System.out.println(mobiles.get(i).getText());
			mobiles.get(i).click();

			
			

	  
    	   
       }

	}
}


