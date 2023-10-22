package myPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookLoginTestWithCustomDriver {
	static String browser;
	static WebDriver driver;
	
	//String browserType = "edge";
	//Static WebDriver driver;
	//driver = utilities_1.DriverFectory_1.open(browserType);
	
	public static void main(String[] args) {
		browserConfig();
		runTest();
	
	}
	
	
	public static void browserConfig() {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.MINUTES);
		
	}
	
	public static void runTest() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("adminmitu@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12345Mithu");
		driver.findElement(By.name("login")).click();
		System.out.println("SUccessull runTest()");
		//driver.close();
		//driver.quit();
	}
}
