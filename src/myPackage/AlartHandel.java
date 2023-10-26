package myPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlartHandel {

	public static void main(String[] args) throws InterruptedException {
		String browserName = "chrome";
		WebDriver driver = utilities_1.DriverFectory_1.open(browserName);
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		/*
		//Alert window with ok button
		//driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		*/
		
		/*
		//Alert window with ok & cancel button
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		//driver.switchTo().alert().accept(); // Close alret by using ok button
		driver.switchTo().alert().dismiss(); // close alert by using cancel button
		*/
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		Alert alertwindow = driver.switchTo().alert();
		System.out.println("The message displayed on alert "+alertwindow.getText());
		alertwindow.sendKeys("Welcome");
		alertwindow.accept();
		//
		
	}

}
