package Selenium.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws Exception  {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Believerz\\Project\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		
		
		driver.get("https://chromedriver.chromium.org/downloads");
		
		String title =driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(1000);
       
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		String source=driver.getPageSource();
		System.out.println(source);
		
		driver.navigate().to("https://www.google.com/");

		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		

		
        WebElement pass =driver.findElement(By.xpath("//*[@class='gLFyf gsfi']"));
        pass.sendKeys("beleive yourself");   // use sendkeys to enter name in textbox
        
       String attributevalue= pass.getAttribute("value");
       System.out.println(attributevalue);   // to print sendkeys value which v given
       
       Thread.sleep(1500);
       pass.clear();
       
       
       
       String tagname=pass.getTagName();
       System.out.println(tagname);
       
       
       Boolean enable=pass.isEnabled();
       System.out.println(enable);

       Thread.sleep(1500);

       pass.sendKeys("beleive yourself");   // use sendkeys to enter name in textbox

       Thread.sleep(1500);
       
       WebElement clickOutside=driver.findElement(By.xpath("//*[@jsmodel='vWNDde']"));
       clickOutside.click();

       Thread.sleep(1500);

       
       WebElement clickSearch=driver.findElement(By.xpath("(//*[@class='gNO89b'])[2]"));
     
       boolean selected= clickSearch.isSelected();
      System.out.println(selected);
      
      String getText=clickSearch.getText();
      System.out.println(getText);
      
      String colour =clickSearch.getCssValue("color");
      System.out.println(colour);
      
      clickSearch.click();
      
      
       
       
       

      

		


	
		
		
		
		

	}

	

	

	
}
