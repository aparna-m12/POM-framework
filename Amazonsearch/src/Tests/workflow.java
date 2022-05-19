package Tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workflow {
	
		   public static WebDriver driver;  
	    
	     @SuppressWarnings("deprecation")
		@Before  
	     public void initializeWebDriver() throws IOException {  
	          System.setProperty("webdriver.chrome.driver","C:\\Users\\arallabhandi\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	          WebDriver driver = new ChromeDriver(); 
	      
	          // To maximize browser  
	          driver.manage().window().maximize();  
	      
	          // Implicit wait  
	          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
	      
	          // To open amazon site  
	          driver.get("https:// www.amazon.com"); 
	          
	          //search for product
	     }

}
