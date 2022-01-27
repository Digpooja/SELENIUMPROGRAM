package assignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class vtiger2 {

	public static void main(String[] args) {
		//OPEN BROWER
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//ENTER  URL
		driver.get("http://demo.vtiger.com/vtigercrm/index.php");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//VERIFY LOGIN PAGE TITLE
		System.out.println("before login title:"+driver.getTitle());
		//CLEAR USERANME 
		WebElement username=driver.findElement(By.id("username"));
		    username.clear();
		    //ENTER USERNAME
		   username.sendKeys("admin");
		   //CLEAR PASSWORD
		    WebElement password=driver.findElement(By.id("password"));
		    password.clear();
		    //ENTER PASSWORD
		    password.sendKeys("Test@123");
		    //CLICK ON LOGIN
		    driver.findElement(By.tagName("button")).click();
		    //VERIFY HOMPAGE TITLE
			System.out.println("AFTER login title:"+driver.getTitle());
			//CLICK ON LOGOUTLINK
		driver.findElement(By.className("userName")).click();

			driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
			
			//CLOSE THE BROWER
			//driver.close();




		    
		  
		

		
	
		

	}

}
