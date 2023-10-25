package myPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutoCompliteDropDownSearch {

	public static void main(String[] args) throws InterruptedException {
		//With import other package for Web drive
				String browserType = "edge";
				WebDriver driver;
				driver = utilities_1.DriverFectory_1.open(browserType);
								
				driver.get("https://twoplugs.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(4,TimeUnit.MINUTES);
				
				driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
				//click live posting menu and go to live posting page 
				Thread.sleep(3000);
				//Catch search value in a WebElement variable
				WebElement searchBox = driver.findElement(By.id("autocomplete"));
				searchBox.clear(); // clear search box value if anything is there.
				searchBox.sendKeys("Tokyo");
				String text;
				
				do {
					searchBox.sendKeys(Keys.ARROW_DOWN);
					text = searchBox.getAttribute("value");
					if(text.equals("Tokyo Metropolitan Area")) {
						searchBox.sendKeys(Keys.ENTER);
						break;
					}
					
				}while(!text.isEmpty());
				
				//driver.navigate().forward();
				
				
				
	}

}
