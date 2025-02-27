package day_47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	//constructor
	WebDriver driver;
	LoginPage(WebDriver driver){
		this.driver=driver;
	}
	
	//locators
	
	By UsernameTxt = By.xpath("//input[@placeholder='Username']");
	By PasswordTxt = By.xpath("//input[@placeholder='Password']");
	By LoginBtn = By.cssSelector("button[type='submit']");
	
	
	//Action Method
	
	public void setUsername (String user) {
		
		driver.findElement(UsernameTxt).sendKeys(user);
	}
	
	public void setPassword(String password) {
		
		driver.findElement(PasswordTxt).sendKeys(password);
	}
	
	public void click_On_LoginBtn() {
		
		driver.findElement(LoginBtn).click();
	}

}
