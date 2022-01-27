package assignment1;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class iebrower {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver","D:\\java\\Eclipse\\SeleniumBasics\\executables\\IEDriverServer.exe");

		//System.setProperty("Webdriver.ie.driver","D:\\java\\Eclipse\\SeleniumBasics\\executables\\IEDriverServer.exe");
		InternetExplorerDriver idriver=new InternetExplorerDriver();
		 idriver.get("http://www.google.com");
	   //  idriver.get("http://www.google.com");
	     System.out.println("current page url:"+idriver.getCurrentUrl());
	     




	}

}
