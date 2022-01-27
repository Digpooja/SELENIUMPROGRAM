package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class vtigerElem {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.vtiger.com/vtigercrm/index.php");
	//int ("TimeUnit.SECONDS")=	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


		String gettitle=driver.getTitle();
		System.out.println("title:"+driver.getTitle());
	
    WebElement login=driver.findElement(By.id("username"));
   // login.click();
    login.clear();
   login.sendKeys("admin");
    WebElement password=driver.findElement(By.id("password"));
    password.clear();
    password.sendKeys("Test@123");
    WebElement loginbt=driver.findElement(By.className("button"));
   loginbt.click();
   String  expectedtitle="Dashboard";
   String actualtitle=driver.getTitle();
   System.out.println("Expectedtitle Dashboard");
   System.out.println("Actaual title:"+actualtitle);
if(expectedtitle.equals(actualtitle)) {
	   System.out.println("the title is match");}
	   else {
		   System.out.println("not match");}
WebElement logout=driver.findElement(By.id("menubar"));
logout.click();




	}
}


	

   
   
    



	
		


