package Selenium.Project;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo {

	public static void main(String[] args) throws IOException {
		

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Believerz\\Project\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
	     String date = new SimpleDateFormat("Edd-MM-yyyyhh-mm-ssaa").format(new Date());
	     
	     TakesScreenshot screenshot = (TakesScreenshot)driver;
	     
	     File source= screenshot.getScreenshotAs(OutputType.FILE)	; 
	     
	    String name= "E:\\Selenium\\Believerz\\Project\\screenshots\\"+date+".png";
	    
	    File Destination = new File(name);
	    
	    FileUtils.copyFile(source, Destination);
	    
	    
	     
	     
	     
	     
	    
	    
	    
		
		
	}
}
