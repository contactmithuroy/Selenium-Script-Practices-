package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InnerFramExtra {
	public static void main(String[] args) {
		String browserType = "chrome";
		WebDriver driver;
		driver = utilities_1.DriverFectory_1.open(browserType);
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		
		driver.switchTo().frame("iframeResult"); // sqitch to outer iframe using id
		driver.switchTo().frame(0); // switch to inner iframe using index
		
		String innerText = driver.findElement(By.xpath("//h1")).getText();
		System.out.println("Text Paresent inside the inner frame: "+innerText);
		
		driver.switchTo().parentFrame(); // go to back frame. or parent frame/ outer frame
		
		String outerText = driver.findElement(By.xpath("//p")).getText();
		System.out.println("Text of the Parent/Outer frame: "+outerText);
		

	}

}
