package assignment1;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilties.utility1;

public class windows extends utility1 {
	static WebDriver driver;
	@Test
	public void testwindow() throws InterruptedException {
		driver=setUp("chrome","https://etrain.info/in");
		System.out.println("Home window currentURL: "+driver.getCurrentUrl());
		//get current window id
		String homeWinId=driver.getWindowHandle();
		System.out.println("Home window id: "+homeWinId);
		//click on button to open new tab/window
		driver.findElement(By.xpath("//a[@href='http://www.indianrail.gov.in/enquiry/StaticPages/StaticEnquiry.jsp?StaticPage=reservation_Rules.html&locale=en']")).click();
		//get the window ids of all the browser window open by webdriver
		Set<String> allWinIds=driver.getWindowHandles();
		System.out.println("All win ids: "+allWinIds);//2 Win IDs
		//get child window id
		allWinIds.remove(homeWinId);
		System.out.println("All win ids after removing homewinid: "+allWinIds);
		String childWinId=allWinIds.iterator().next();
		driver.switchTo().window(childWinId);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()='Services']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='SMS Service']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='www.indianrail.gov.in']")).click();
		//click on new url
		Set<String> allWinIds1=driver.getWindowHandles();
		System.out.println("All win ids: "+allWinIds1);//3Win IDs
		//get child window id
		allWinIds1.remove(childWinId);
		System.out.println("All win ids after removing homewinid: "+allWinIds1);
		String child2=allWinIds1.iterator().next();
		driver.switchTo().window(child2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h3[text()='INDIAN RAILWAYS PASSENGER RESERVATION ENQUIRY']")).getText();




	}

}
