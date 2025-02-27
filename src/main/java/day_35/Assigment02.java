package day_35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment02 {

	public static void main(String[] args) {

		//WebDriver driver = new ChromeDriver();
		
		
		//String url= "https://demo.guru99.com/test/drag_drop.html";
		Assignment02Test.OpenURL();
		
		//driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		
		Assignment02Test.BankDetails();
		Assignment02Test.BankAmount();
		Assignment02Test.SalesDetails();
		Assignment02Test.SalesAmmount();
		Assignment02Test.Validation();
		
		
		
		
		
		
		
		



	}

}
