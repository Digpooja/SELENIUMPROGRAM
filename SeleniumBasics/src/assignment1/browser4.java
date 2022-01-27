package assignment1;

import org.openqa.selenium.chrome.ChromeDriver;

public class browser4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\java\\Eclipse\\SeleniumBasics\\executables\\chromedriver.exe");
		ChromeDriver cdriver=new ChromeDriver();
		cdriver.get("https://opensource-demo.orangehrmlive.com");
		//cdriver.close();

	}

}
