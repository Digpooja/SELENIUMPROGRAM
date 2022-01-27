package elements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class button1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./executables/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//full screen browser 
		driver.manage().window().maximize();
		/**Step2: enter required URL */
		driver.get("http://demo.automationtesting.in/Register.html");
		//implicit wait: Interface->Interface->Interface->abstract method*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		//when find button name 1st find button arrti and check its innertext 
		WebElement submitbt=driver.findElement(By.id("submitbtn"));
		System.out.println(submitbt.isDisplayed()+ ":"+submitbt.isEnabled());
		System.out.println("button name:"+submitbt.getText());
		//find refresh button
		WebElement refreshbt=driver.findElement(By.id("Button1"));
		System.out.println(refreshbt.isDisplayed()+ ":"+refreshbt.isEnabled());	
		System.out.println("button name1:"+refreshbt.getText());
		
		//how many buttons=go on screen press ctrl F and find( // button) for link find( //a)and use findelements and list
	           List<WebElement> buttons=driver.findElements(By.tagName("button"));
	           System.out.println("total buttons:"+buttons.size());
	           for(int i=0;i<buttons.size();i++) {
	           System.out.println(buttons.get(i).getAttribute("class"));
	           }
	           
		
		
	

	}

}
