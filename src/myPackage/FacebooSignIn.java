package myPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebooSignIn {

	public static void main(String[] args) {

		String firstName = "Selenium";
		String lastName = "Mithu";
		String email = "adminmitu@gmail.com";
		String password = "12345Mithu";
		String gender = "Male";
		String month = "Jan";
		int day = 21;
		String year = "2000"; 
		
		//With import other package for Web drive
		String browserType = "edge";
		WebDriver driver;
		driver = utilities_1.DriverFectory_1.open(browserType);
		
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.MINUTES);
		
		//Without import package for Web drive
		/*
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\SeleniumWebdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver chrDriver = new ChromeDriver();
		chrDriver.get("https://www.facebook.com/signup");
		chrDriver.manage().window().maximize();
		chrDriver.manage().timeouts().implicitlyWait(4,TimeUnit.MINUTES);
		chrDriver.findElement(By.name("firstname")).sendKeys(firstName);
		chrDriver.findElement(By.name("lastname")).sendKeys(lastName);	
		chrDriver.findElement(By.name("reg_email__")).sendKeys(email);
		chrDriver.findElement(By.name("reg_email_confirmation__")).sendKeys(email);
		chrDriver.findElement(By.name("reg_passwd__")).sendKeys(password);
		
		new Select(chrDriver.findElement(By.id("month"))).selectByVisibleText(month);
		new Select(chrDriver.findElement(By.id("day"))).selectByIndex(day);
		new Select(chrDriver.findElement(By.name("birthday_year"))).selectByValue(year);
		
		
		//driver.findElement(By.xpath("//*[contains(text(),'Female')]")).click();//for female 
		chrDriver.findElement(By.xpath("//*[contains(text(),'"+gender+"')]")).click();//for male

		chrDriver.findElement(By.name("websubmit")).click();
		*/
		//Already have an account?
		//driver.findElement(By.className("_9bq5")).click();
		
		//chrDriver.close();
		//chrDriver.quit();
		
		
		//chrDriver.findElement(By.xpath("//input[@id='u_2_b_wq']")).sendKeys(firstName);
		//chrDriver.findElement(By.xpath("//input[@id='u_2_d_mL']")).sendKeys(lastName);
		//chrDriver.findElement(By.xpath("//input[@id='u_2_g_y6']")).sendKeys(email);
		//chrDriver.findElement(By.xpath("//*[@id=\"password_step_input\"]")).sendKeys(password);

		//new Select(chrDriver.findElement(By.id("month"))).selectByVisibleText("Jun");
		//new Select(chrDriver.findElement(By.id("day"))).selectByIndex(10);
		//new Select(chrDriver.findElement(By.name("birthday_year"))).selectByValue("2000");
		
		//driver.findElement(By.id("u_0_5_ag")).click();
		//chrDriver.findElement(By.xpath("//*[@id=\"u_0_5_Hs\"]")).click();
		
		//chrDriver.findElement(By.cssSelector("#u_0_9_LT")).click();
		//chromeDriver.findElement(By.xpath("//*[@id=\"skip_to_signin\"]/div[6]")).click();
		
		//driver.findElement(By.id("u_0_s_PE")).click();
		//driver.findElement(By.name("websubmit")).submit();
		//driver.findElement(By.class("[id=u_0_n]")).click();
		//driver.findElement(By.cssSelector("#u_0_s_PE")).clear();
	}

}
