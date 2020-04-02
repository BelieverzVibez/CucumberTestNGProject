package Selenium.Project;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BrowserLaunch {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Believerz\\Project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		JavascriptExecutor j = (JavascriptExecutor)driver;


		WebElement radiobutton =driver.findElement(By.xpath("//*[text()='Prompt Pop up']"));
		WebElement sdd =driver.findElement(By.xpath("//*[text()='Confirm Alert box']"));

		
		j.executeScript("arguments[0].scrollIntoView(true)",sdd);
	
		
		radiobutton.click();
		Thread.sleep(1500);


		Alert alert = driver.switchTo().alert();
		Thread.sleep(500);

		alert.sendKeys("Yes");
		//alert.accept();

		
		
		
		
		
		/*Select s = new Select(radiobutton);
		
		s.selectByValue("6");*/

		
		/*WebElement password =driver.findElement(By.xpath("//*[@name='pass']"));
		password.sendKeys("sdfsf");
		
		WebElement clickbuton =driver.findElement(By.xpath("//*[@id='u_0_b']"));
		clickbuton.click();*/
		
		


		
	
		
		
		
	}
}
