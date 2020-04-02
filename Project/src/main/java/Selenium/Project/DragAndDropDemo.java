package Selenium.Project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {


	public static void main(String[] args) throws InterruptedException, AWTException {
		
	  System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Believerz\\Project\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/droppable/");
		
		
		WebElement popClose=driver.findElement(By.xpath("//*[@id='draggable']"));
		

		
		WebElement ele=driver.findElement(By.xpath("//*[@id='droppable']"));
		
		

		
		Actions act = new Actions(driver);
		
		// act.dragAndDrop(popClose, ele).perform();
		
		act.clickAndHold(popClose).moveToElement(ele).release(popClose).perform();
		
	}
}
