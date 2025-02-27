package day_47;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_New {
	
	
	//Constructor
	WebDriver driver;
	
	LoginPage_New(WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	//Locators
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement Username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement Password;
	
	@FindBy(css="button[type='submit']")
	WebElement LoginBtn;
	
	
	/*//For more than one element we can use
	
	@FindBy(xpath="xpath")
	List<WebElement> list;*/
	
	
	
	//Action Methods
	
	void setUsername(String user) {
		
		Username.sendKeys(user);
	}
	
	void setPassword(String password) {
		
		Password.sendKeys(password);
	}
	
	void click_Btn() {
		
		LoginBtn.click();
	}
	
	

}
