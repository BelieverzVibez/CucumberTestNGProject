package Selenium.Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlingDemo {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Believerz\\Project\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		 //  pass.sendKeys("E:\\Selenium\\readData.txt");
		
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		
        WebElement er=driver.findElement(By.xpath("//*[text()='click']"));
        er.click();
        
        String parentwindow=driver.getWindowHandle();
        Set<String> all=driver.getWindowHandles();
      
      /*  List<String> ls= new ArrayList<String>();
        ls.addAll(all);*/
        
        for(String df:all) {
        	
        	if(!df.equals(parentwindow)) {
        		driver.switchTo().window(df);
        	}
        }
        
        

	}
}
