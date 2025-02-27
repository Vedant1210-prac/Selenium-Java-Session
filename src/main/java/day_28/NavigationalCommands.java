package day_28;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) throws MalformedURLException {


		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://demo.nopcommerce.com/");   // accept url in only string formate
		
		//driver.navigate().to("https://demo.nopcommerce.com/");   // accept in string and URL object formte
		
		
		/*URL myUrl = new URL("https://demo.nopcommerce.com/");
		
		driver.navigate().to(myUrl);
		*/
		
		driver.navigate().to("https://demo.nopcommerce.com/");   // accept in string and URL object formte
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.navigate().back();   //move backward from one page to another page
		
		
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();  // to move forward
		
		System.out.println(driver.getCurrentUrl());
		
		
		
		
		
		
		
		
	}

}
