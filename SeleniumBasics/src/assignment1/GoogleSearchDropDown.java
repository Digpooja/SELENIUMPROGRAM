package assignment1;

import java.util.List;

import org.openqa.selenium.*;

public class GoogleSearchDropDown extends SetupBrowser implements GoogleElements 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = setup(GoogleElements.url);
		driver.findElement(By.cssSelector(GoogleElements.serchTextBox)).sendKeys("Testing");
		Thread.sleep(3000);
		List<WebElement> googleSearch = driver.findElements(By.cssSelector(GoogleElements.searchOptions));
		for(int i=0;i<googleSearch.size();i++)
		{
			if(googleSearch.get(i).getText().equals("testing techniques"))
			{
				System.out.println(googleSearch.get(i).getText()+" is present at index: "+i);
			}
		}
		driver.quit();

	}

}
