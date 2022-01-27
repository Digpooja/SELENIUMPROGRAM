package assignment1;

import org.openqa.selenium.chrome.ChromeDriver;

public class browser3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\Eclipse\\SeleniumBasics\\executables\\chromedriver.exe");
	     ChromeDriver cdriver=new ChromeDriver();
	     //open google
	     cdriver.get("http://www.google.com");
	    // print url
	     System.out.println("current page url:"+cdriver.getCurrentUrl());
	     //page source
	     cdriver.getPageSource();
	     System.out.println("print page source:"+cdriver.getPageSource());
	     //length of page source
	     int PageSourceLength=cdriver.getPageSource().length();
	     System.out.println("current page Title:"+cdriver.getPageSource().length());

	     cdriver.close();


		

	}

}
