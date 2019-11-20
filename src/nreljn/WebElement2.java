package nreljn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement2 {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sree Kaam\\eclipse-workspace\\nreljn\\driver\\chromedriver.exe" );
		
          WebDriver driver = new ChromeDriver();
          
          driver.get("https://www.toolsqa.com/automation-practice-table/");
          
          //using normal for loop
          List<WebElement> rows = driver.findElements(By.tagName("tr"));
          
             for (int i = 0; i < 5; i++) {
            	 
            	WebElement r = rows.get(i);
            	
            	List<WebElement> cells = r.findElements(By.tagName("td"));
            	
            	for (int j = 0; j < cells.size(); j++) {
            		
            		WebElement h = cells.get(j);
            		
            		String text = h.getText();
            		System.out.println(text);
            		
            		
            		
            		
            		
					
				}
            	 
            	
             }
}
}
