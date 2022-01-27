package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FetchLocator 
{
	HashMap<String,HashMap<String, String>> objectLocators = new HashMap<>();
	HashMap<String, String> objectLocator = new HashMap<>();
	public FetchLocator()
	{
		try 
		{
			FileInputStream fis=new FileInputStream("D:\\java\\Eclipse\\SeleniumBasics\\Testdata\\objectLocators.xlsx");
			Workbook workbook=new XSSFWorkbook(fis);
			Sheet sheet=workbook.getSheet("ToolsQA");
			for(int i=0;i<sheet.getLastRowNum()-1;i++)
			{
				Row row=sheet.getRow(i);
				String objectName = row.getCell(0).getStringCellValue();
				String locatorType = row.getCell(1).getStringCellValue();
				String locatorValue = row.getCell(2).getStringCellValue();
				System.out.println(objectName +" "+ locatorType+" "+locatorValue);
				objectLocator.put(locatorType, locatorValue);
				objectLocators.put(objectName, objectLocator);
			}		
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		} 
	}

	public WebElement locator(WebDriver driver, String objectName,String locatorType)
	{
		WebElement element = null;
		String locator;
		switch(locatorType)
		{
			case "ID":
				locator = objectLocators.get(objectName).get(locatorType);
				System.out.println(locator);
				element = driver.findElement(By.id(locator));
				break;
			case "XPATH":
				locator = objectLocators.get(objectName).get(locatorType);
				element = driver.findElement(By.xpath(locator));
				break;
			case "LinkText":
				locator = objectLocators.get(objectName).get(locatorType);
				element = driver.findElement(By.linkText(locator));
				break;
		}
		
		return element;
	}
}
