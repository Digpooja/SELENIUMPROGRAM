package assignment1;


import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\Eclipse\\SeleniumBasics\\executables\\chromedriver.exe");
		     ChromeDriver cdriver=new ChromeDriver();
		     //open for url
		     cdriver.get("http://demo.actitime.com/");
		     //Get page title name
		     cdriver.getTitle();
		     //Get Title lenght
		  int titleLangth=cdriver.getTitle().length();
		     //print Title name
		     System.out.println("current page Title:"+cdriver.getTitle());
		     //print Title length
		     System.out.println("current Title length:"+cdriver.getTitle().length()); 
		     //Get page URL
		     cdriver.getCurrentUrl();
		     //Get page source
		     cdriver.getPageSource();
		     //page source length
		     int PageSourceLength=cdriver.getPageSource().length();
		     //print page length
		     System.out.println("current page length:"+cdriver.getPageSource().length());
		     //close the brower
		     cdriver.close();


		     

	}

}
