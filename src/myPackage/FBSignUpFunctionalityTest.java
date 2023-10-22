package myPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FBSignUpFunctionalityTest {
	static String browser;
	static WebDriver driver;
	
	public static void main(String[] args) {
		setBrowser();
		browserConfig();
		runTest();
	
	}
	
	public static void setBrowser() {
		browser = "chrome";
	}
	
	public static void browserConfig() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\SeleniumWebdriver\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
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
