package Selenium.Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioButtonDemo {

	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Believerz\\Project\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
	      WebElement CheckBox =driver.findElement(By.xpath("//*[@class='_5k_4']/span")); 
	      Select f = new Select(CheckBox);
	     
	   List<WebElement>  listOfAllSelected= f.getAllSelectedOptions();
	   
	   for(int i=0;i<listOfAllSelected.size();i++) {
		   System.out.println(listOfAllSelected.get(i).getText());
	   }
	       
	     // f.selectByIndex(23);
	    //  f.selectByValue("7");
	      
	    //  f.selectByVisibleText("May");
	      
	   
	   		
	     

        
		
		
	}
}