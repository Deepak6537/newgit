package nreljn;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebHandling {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sree Kaam\\eclipse-workspace\\nreljn\\driver\\chromedriver.exe" );
		
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.snapdeal.com/");
        
        driver.manage().window().maximize();
        
        WebElement d = driver.findElement(By.name("keyword"));
        
        d.sendKeys("watches");
        
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        
        WebElement e = driver.findElement(By.xpath("(//span[@class='search-text'])[1])"));
        e.click();
        
        //windows handling 
        
                  String ParId = driver.getWindowHandle(); 
                  System.out.println(ParId);
                  
                  Set<String> allwin = driver.getWindowHandles();
                  System.out.println(allwin);
                  
                  for (String a : allwin) {
                	  
                   if (!ParId.equals(a)) {
                	   
                	   driver.switchTo().window(a);
                   }
					
				}
        
        
        
        
      
		
		
			}

}
