package assignment1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath {
    public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.demoblaze.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement>mobiles =driver.findElements(By.xpath("//div[@id=\"tbodyid\"]/div/div/div/h4"));
		System.out.println("Options count: "+mobiles.size());
		for(int i=0;i<mobiles.size();i++) {
			WebElement option=mobiles.get(i);
			System.out.println(option.getText());}
		//for price
		List<WebElement>price =driver.findElements(By.xpath("//div[@id=\"tbodyid\"]/div/div/div/h5"));
		System.out.println("Options count: "+price.size());
		for(int i=0;i<price.size();i++) {
			WebElement option=price.get(i);
			System.out.println(option.getText());}
		//for button
        WebElement button=driver.findElement(By.xpath("//button[@id='next2']"));
        System.out.println("mobnum is displayed:"+button.isDisplayed());
        button.click();
        Thread.sleep(5000);
        //for nxt page
        List<WebElement>mobiles2 =driver.findElements(By.xpath("//div[@id=\"tbodyid\"]/div/div/div/h4"));
		System.out.println("Options count: "+mobiles2.size());
		for(int i=0;i<mobiles2.size();i++) {
			WebElement option1=mobiles2.get(i);
			System.out.println(option1.getText());}
		//for price
		List<WebElement>price2 =driver.findElements(By.xpath("//div[@id=\"tbodyid\"]/div/div/div/h5"));
		System.out.println("Options count: "+price.size());
		for(int i=0;i<price2.size();i++) {
			WebElement option2=price2.get(i);
			System.out.println(option2.getText());}
		String button1="Next";
		
		if(button1.equals(button)) {
			System.out.println("is dispalyed");}
		else {
			System.out.println("is not dispalyed");}


			
		
		}
		
		
		//driver.quit();
		
    
		
	
		


		

	}


