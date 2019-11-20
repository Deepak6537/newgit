package nreljn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Hello {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sree Kaam\\eclipse-workspace\\nreljn\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/login/");
		WebElement d = driver.findElement(By.xpath("//input[@type='text']"));
		d.sendKeys("beckhamdeepu46@gmail.com");
	
		WebElement p = driver.findElement(By.xpath("//input[@type='password']"));
		p.sendKeys("8056200313");
		
	    WebElement btn = driver.findElement(By.id("loginbutton"));
	    
	    btn.click();
		
	    driver.quit();


	}
}
