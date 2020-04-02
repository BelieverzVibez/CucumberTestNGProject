package Selenium.Project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverActionConcept {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
	  System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Believerz\\Project\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		
		WebElement popClose=driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']"));
		popClose.click();

		
		WebElement ele=driver.findElement(By.xpath("//*[text()='TVs & Appliances']"));
		
		

		
		Actions act = new Actions(driver);
		
		act.moveToElement(ele).perform();
		
		Thread.sleep(2000);

		WebElement nextElee=driver.findElement(By.xpath("//*[text()='Fully Automatic Front Load']"));
		
		act.contextClick(nextElee).perform();
		
		Robot robo = new Robot();
		robo.setAutoDelay(2000);
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);
		robo.setAutoDelay(2000);

		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		

		
		
		Thread.sleep(8000);
		
		driver.quit();
		
		
	}
}
