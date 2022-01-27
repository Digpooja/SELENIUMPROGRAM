package selenium2;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEdriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver","D:\\java\\Eclipse\\SeleniumBasics\\executables\\IEDriverServer.exe");
		InternetExplorerDriver idriver=new InternetExplorerDriver();
	     idriver.get("http://www.facebook.com");

		 idriver.getPageSource();
	     System.out.println("print page source:"+idriver.getPageSource());
    
	}

}
