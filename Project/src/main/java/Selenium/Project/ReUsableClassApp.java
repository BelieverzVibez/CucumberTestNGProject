package Selenium.Project;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ReUsableClassApp   {
static WebDriver driver;

public static WebDriver getdriver() {
	 driver = new ChromeDriver();
	return driver;


}
 

	public static void sendKeys(WebElement element,String value) throws IOException {
		try {
		
		/*	JavascriptExecutor j = (JavascriptExecutor)driver;

			j.executeScript("arguments[0].setAttribute('style','background:cyan;border:solid 2px red');",element);*/
		//element.sendKeys(value);
			
				/*j.executeScript("arguments[0].setAttribute('style','background:cyan;border:solid 2px red');",element);
			j.executeScript("arguments[0].setAttribute('value',"+"'"+value+"'"+")",element);*/

			
			
		
		}
		
		
		catch(Exception e){
			String dateName = new SimpleDateFormat(" E, dd-MMM-yyyy hh-mm-ss aa").format(new Date());
		  
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			// after execution, you could see a folder "FailedTestsScreenshots"
			// under src folder
			String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/"+ dateName
					+ ".png";
			File finalDestination = new File(destination);
			FileUtils.copyFile(source, finalDestination);
		}

	}
	
 public static void click(WebDriver driver,String xpath) {
		
		driver.findElement(By.xpath(xpath)).click();
		

	}
	

}
