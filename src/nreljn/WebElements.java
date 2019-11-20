package nreljn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sree Kaam\\eclipse-workspace\\nreljn\\driver\\chromedriver.exe" );
		
          WebDriver driver = new ChromeDriver();
          
          driver.get("https://www.toolsqa.com/automation-practice-table/");
          
          //to get all the rows
          List<WebElement> rows = driver.findElements(By.tagName("tr"));
          
          //for iterate each row
          for (WebElement r : rows) {
        	  
        	  //to get all the header
        	  List<WebElement> head = r.findElements(By.tagName("th"));
        	  
        	  for (WebElement h : head) {
        		  
        		 String text = h.getText();
        		 System.out.println(text);
        		 
        		 //to get all the cells 
        		 List<WebElement> cells = r.findElements(By.tagName("td"));
        		 
        		 //to iterate each cells
        		 for (WebElement c : cells) {
        			 
        			String texts = c.getText();
        			System.out.println(texts);
        			 
        					}
						}
			}
          }
}
