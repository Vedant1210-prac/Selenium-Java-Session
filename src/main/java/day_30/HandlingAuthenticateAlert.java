package day_30;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAuthenticateAlert {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//Syntax for authenticate popup
		https://username:password@the-internet.herokuapp.com/basic_auth
		
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
			
			driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
		driver.manage().window().maximize();
		
		
		
	}

}
