package selenium2;

import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","D:\\java\\Eclipse\\SeleniumBasics\\executables\\geckodriver.exe");
		FirefoxDriver fdriver=new FirefoxDriver();

	}

}
