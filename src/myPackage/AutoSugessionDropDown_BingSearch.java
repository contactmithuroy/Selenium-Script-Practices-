package myPackage;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugessionDropDown_BingSearch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\\\Selenium\\\\SeleniumWebdriver\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		driver.findElement(By.id("sb_form_q")).sendKeys("Java");
		
		//Multiple selection store on list variable on Lsit 
		List<WebElement> list = driver.findElements(By.className("sa_tm_text"));
				
		System.out.println("Size of auto suggestions: "+list.size());
		
		//Now we will check all suggetion and check with search value and compare
		for(WebElement listItem:list) {
			System.out.println("\n"+listItem.getText());
			if(listItem.getText().contains("download")) { // value already define "JAVA" //we can use contains() or equals()
				listItem.click();
				break;
			}
		} 
	}
}
