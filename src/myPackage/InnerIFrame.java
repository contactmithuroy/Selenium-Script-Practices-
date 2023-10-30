package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class InnerIFrame {

	public static void main(String[] args) {
		String browerType = "chrome";
		WebDriver driver = utilities_1.DriverFectory_1.open(browerType);
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		// firstly click to iframe with inner ifram
		driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
		
		//Switch to next buttton
		WebElement outerFrame = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));

		//no need deafult content like other iframe. in this case no need to go back main contain
		// check HandleIframe class
		WebElement innerFrame = driver.findElement(By.xpath("//iframe[@src()='SingleFrame.html']"));
		driver.switchTo().frame(innerFrame);
		driver.findElement(By.xpath("//input[@type='text]")).sendKeys("Welcome");
		

	}

}
