package assignment1;

import org.openqa.selenium.chrome.ChromeDriver;

public class webBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\Eclipse\\SeleniumBasics\\executables\\chromedriver.exe");
	     ChromeDriver cdriver=new ChromeDriver();
	     //open url
	     cdriver.get("http://www.facebook.com");
	     //Fetching title
	    String actualTitle= cdriver.getTitle();
	     //print title
	     System.out.println("current page Title:"+cdriver.getTitle());
	     String expectedTitle="Facebook – log in or sign up";
	     //comparing both title
	     if(actualTitle.equals(expectedTitle)) 
	    	 System.out.println("The Title is MATCH");
	    	 else 
		    	 System.out.println("The Title did not MATCH");
	     //close the browser
	     cdriver.close();

	    	 }
	     }
	


	     

	


