package assignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class button {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\java\\Eclipse\\SeleniumBasics\\executables\\chromedriver.exe");
             WebDriver driver=new ChromeDriver();
 			driver.get("https://demoqa.com/automation-practice-form");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//maximize the page
              driver.manage().window().maximize();
              //find first name
            WebElement finame=driver.findElement(By.id("firstName"));
             System.out.println(finame.isDisplayed()+":"+finame.isEnabled());
             System.out.println("Name field:"+finame.getAttribute("id"));
             finame.sendKeys("Pooja");
             //find last name
             WebElement lastname=driver.findElement(By.id("lastName"));
             System.out.println(lastname.isDisplayed()+":"+lastname.isEnabled());
             System.out.println("Name field:"+lastname.getAttribute("id"));
             lastname.sendKeys("Patil");
             //Email field
             WebElement email=driver.findElement(By.id("userEmail"));
             System.out.println(email.isDisplayed()+":"+email.isEnabled());
             System.out.println("emailname:"+email.getAttribute("id"));
            email. sendKeys("patilpooja544@gmail.com");
            //select the female
          //  WebElement female=driver.findElement(By.className("custom-control-label"));
            WebElement female =driver.findElement(By.cssSelector("label[for='gender-radio-2']"));
            System.out.println(female.isDisplayed()+":"+female.isEnabled());
              female.click();
              //mob num
              WebElement mob1=driver.findElement(By.cssSelector("input[id='userNumber']"));
              System.out.println("monnum is displayed:"+mob1.isDisplayed());
                 mob1.sendKeys("9890405590");
                 //sunject
                 WebElement sub=driver.findElement(By.id("subjectsInput"));
                 sub.sendKeys("math");
                 
                 //hobbies
                 WebElement input =driver.findElement(By.id("hobbies-checkbox-1"));
                 


                 WebElement sports= driver.findElement(By.cssSelector("input[id='hobbies-checkbox-1']"));
       System.out.println("using label:"+sports.isSelected()+":"+sports.isDisplayed()+":"+sports.isEnabled());
       sports.click();
       System.out.println("using label:"+sports.isSelected()+":"+sports.isDisplayed()+":"+sports.isEnabled());


        System.out.println("using input:"+input.isSelected()+":"+sports.isDisplayed()+":"+sports.isEnabled());

                 

                 
              

              

            

             
             


             
     		
				
		

	}

}
