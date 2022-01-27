package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class elements1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\Eclipse\\SeleniumBasics\\executables\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.get("http://demo.actitime.com/login.do");
         //locate username field
         WebElement username=driver.findElement(By.id("username"));
         //ENTER USERNAME
         username.sendKeys("admin");
         //loacate password field
         WebElement password=driver.findElement(By.name("pwd"));
         //ENTER PASSWORD
         password.sendKeys("manager");
         WebElement login=driver.findElement(By.id("loginButton"));
        // WebElement login=driver.findElement(By.id("loginButton"));

         
        // CLICK LOGIN
         login.click();
         
	}

}
