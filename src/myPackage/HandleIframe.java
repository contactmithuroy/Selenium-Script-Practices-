package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\\\Selenium\\\\SeleniumWebdriver\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/iframe/");
		
		/*
		 * An inline frame (iframe) is a HTML element that loads another HTML page within the document. 
		 * Three way to handle iframe
		 * driver.switchTo().frame(name of the frame/ id of the frame)
		 * driver.switchTo().frame(WebElement)
		 * driver.switchTo().frmae(0) ->index number
		 */
		
		// 1st iframe
		driver.switchTo().frame(0); // using index number. base on how many iframe is there
		driver.findElement(By.xpath("//span[normalize-space()='Download Course Brochure']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
		//2nd iframe 
		driver.switchTo().frame(1);
		driver.findElement(By.name("alertbox")).click();
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
		//3rd iframe
		driver.switchTo().frame("formpage");
		driver.findElement(By.id("vfb-5")).sendKeys("Fuck");
		driver.switchTo().defaultContent();
			
	}

}
