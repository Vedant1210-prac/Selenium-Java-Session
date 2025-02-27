package day_38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RunTestIncognitoMode {

	public static void main(String[] args) {

		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--incognito");

		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://testautomationpractice.blogspot.com/");

	}

}
