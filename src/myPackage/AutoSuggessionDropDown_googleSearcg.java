package myPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggessionDropDown_googleSearcg {
	public static void main(String[] args) throws InterruptedException{

		System.setProperty("webdriver.chrome.driver","E:\\\\Selenium\\\\SeleniumWebdriver\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		driver.findElement(By.id("APjFqb")).sendKeys("Facebook");
		Thread.sleep(3000);
		
		//Multiple selection store on list variable on Lsit 
		List<WebElement> list = driver.findElements(By.className("wM6W7d"));
				
		System.out.println("Size of auto suggestions: "+list.size());
		
		//Now we will check all suggetion and check with search value and compare
		for(WebElement listItem:list) {
			System.out.println("\n"+listItem.getText());
			if(listItem.getText().contains("login")) { // value already define "JAVA" //we can use contains() or equals()
				listItem.click();
				break;
			}
		} 
	}
}
