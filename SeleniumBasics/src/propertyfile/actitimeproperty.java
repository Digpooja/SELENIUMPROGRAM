package propertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class actitimeproperty {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream(".\\Testdata\\actitime.properties");
		Properties p1=new Properties();
		p1.load(fis);
		System.out.println(p1.getProperty("appurl"));
         System.out.println(p1.getProperty("username"));
		System.out.println(p1.getProperty("pwd"));


	}

}
