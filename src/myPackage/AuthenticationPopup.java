package myPackage;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

public class AuthenticationPopup {

	public static void main(String[] args) {
		String browerType = "chrome";
		WebDriver driver = utilities_1.DriverFectory_1.open(browerType);
		
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(4,TimeUnit.MINUTES);
		
		// Syntex
		// http://user:password@the-internet.herokuapp.com/basic_auth
		//Example : It will be automatic inject username and password
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		// Output will be get "Congratulations! You must have the proper credentials."
	}

}
