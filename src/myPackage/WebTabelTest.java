package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTabelTest {

	public static void main(String[] args) {
		String browserType = "chrome";
		WebDriver driver;
		driver = utilities_1.DriverFectory_1.open(browserType);
		driver.get("https://www.selenium.dev/ecosystem/");
		driver.manage().window().maximize();
		
		WebElement rows = driver.findElement(By.xpath("//div[@class='row justify-content-center p-5 td-box--100']//table[@class='table']/tbody/tr"));
		//Dimension dimension = rows.getSize();
		System.out.println("Total number of row:"+rows.getSize());
		
		WebElement columns = driver.findElement(By.xpath("//div[@class='row justify-content-center p-5 td-box--100']//table[@class='table']/thead/tr/th"));
		System.out.println("Total number of row:"+columns.getSize());
		
		//Retrieve specific row data
		//first column first row value
		WebElement tableText = driver.findElement(By.xpath("//div[@class='row justify-content-center p-5']//table[@class='table']//tr//p/a"));
		String text = tableText.getText();
		System.out.println("Table row text value is: "+text);
		
		//div[@class='row justify-content-center p-5']//table[@class='table']//tr[4]//th
		// 4th row first column value
		WebElement tableText2 = driver.findElement(By.xpath("//div[@class='row justify-content-center p-5']//table[@class='table']//tr[4]//th"));
		String text2 = tableText2.getText();
		System.out.println("Table row text value is: "+text2);
		
		// first row 3rd column value
		WebElement columnText = driver.findElement(By.xpath("//div[@class='row justify-content-center p-5']//table[@class='table']//tr[1]/td[2]"));
		String text3 = columnText.getText();
		System.out.println("Table row text value is: "+text3);
		
		
		// Retrieve all the data from the table 
		//div[@class='row justify-content-center p-5']//table[@class='table']//tbody//tr[1]/th
		//div[@class='row justify-content-center p-5']//table[@class='table']//tbody//tr[1]/td[1]
		
		for(int r =1; r<=10; r++) {
			
			for(int c =1; c<3; c++) {
				WebElement value = driver.findElement(By.xpath("//div[@class='row justify-content-center p-5']//table[@class='table']//tbody//tr["+r+"]/td["+c+"]"));
				String texts= value.getText();
				System.out.print(texts+ "                     ");
			}
			System.out.println();
		}
		
		
	}

}
