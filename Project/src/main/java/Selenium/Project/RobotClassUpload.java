package Selenium.Project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RobotClassUpload {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Believerz\\Project\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		 //  pass.sendKeys("E:\\Selenium\\readData.txt");
		
		/*
		driver.get("http://demo.guru99.com/test/upload/");
		
		
		 WebDriverWait wait = new WebDriverWait(driver,10);
	        
	       
	        
        WebElement er=driver.findElement(By.xpath("//*[@id='uploadfile_0']"));
        wait.until(ExpectedConditions.visibilityOf(er));
        er.click();
	

        
        String path = "E:\\Selenium\\java.docx";
        Robot robo = new Robot();
        robo.setAutoDelay(2000);
        StringSelection select = new StringSelection(path);
        
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
        
        robo.keyPress(KeyEvent.VK_CONTROL);
        robo.keyPress(KeyEvent.VK_V);
        robo.setAutoDelay(2000);

        robo.keyRelease(KeyEvent.VK_CONTROL);
        robo.keyRelease(KeyEvent.VK_V);


        robo.setAutoDelay(2000);

        robo.keyPress(KeyEvent.VK_ENTER);
        robo.keyRelease(KeyEvent.VK_ENTER);

        */
        driver.get("https://www.ilovepdf.com/word_to_pdf");

        String path="C:\\Users\\selva\\Desktop\\a.docx";

        driver.findElement(By.xpath("//*[text()='Select WORD files']")).click();
        Robot robot = new Robot();
        ClipboardOwner Owner =null;
        robot.setAutoDelay(1000);
        StringSelection selection = new StringSelection(path);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, Owner);
       robot.keyPress(KeyEvent.VK_CONTROL); 
       robot.keyPress(KeyEvent.VK_V);
       robot.setAutoDelay(1000);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        robot.setAutoDelay(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

       
        
        
        

		
	}
}
