package elements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {
	public static void main(String[] args) throws Exception  {
		//Step1: open browser
				System.setProperty("webdriver.chrome.driver","./executables/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				//full screen browser 
				driver.manage().window().maximize();
				/**Step2: enter required URL */
				driver.get("http://demo.automationtesting.in/Register.html");
				//implicit wait: Interface->Interface->Interface->abstract method*/
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				Thread.sleep(2000);
				WebElement signupbt=driver.findElement(By.name("signup"));
				System.out.println(signupbt.isDisplayed()+ ":"+signupbt.isEnabled());
				//to fetch innertext from html
				System.out.println("Button Name:"+signupbt.getText());
				//aartributes
				System.out.println("name attribute value: "+signupbt.getAttribute("class"));
				System.out.println("name attribute value: "+signupbt.getAttribute("name"));
				List<WebElement> buttons=driver.findElements(By.tagName("button"));
				System.out.println("Button count: "+buttons.size());
				for(int i=0;i<buttons.size();i++) {
					System.out.println(buttons.get(i).getAttribute("class"));
				}
	}


				


	}


