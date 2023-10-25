package myPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandleLinks {
	public static void main(String[] args) {
		String browserType = "chrome";
		WebDriver driver;
		driver = utilities_1.DriverFectory_1.open(browserType);
		driver.get("https://www.netflix.com/in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.MINUTES);
		
		//driver.findElement(By.linkText("Only on Netflix")).click(); // click full portion
		//driver.findElement(By.partialLinkText("Only")).click(); // click only specific word in anywhere
		
		// how to find all the links in the webpage and find them
		List<WebElement> links = driver.findElements(By.tagName("a"));
		//System.out.println("Web page link list: "+links.size());
		
		/*
		// Use normal for loop
		for(int i=0; i<links.size(); i++) {
			//Print link text
			String lnk = links.get(i).getText();
			System.out.println(lnk);
			// print link
			String hrefLink = links.get(i).getAttribute("href");
			System.out.println("Http link"+hrefLink);
		}
		*/
		//use for each loop
			for(WebElement link:links){
				System.out.println(link.getText());
				System.out.println(link.getAttribute("href"));
			}
	}
}
