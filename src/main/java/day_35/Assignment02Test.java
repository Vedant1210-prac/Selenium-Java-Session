package day_35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Assignment02Test {
	static WebDriver driver = new ChromeDriver();
	static Actions act = new Actions(driver);
	static String URL = "https://demo.guru99.com/test/drag_drop.html";
	
	
	static void OpenURL() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(URL);
		
		driver.manage().window().maximize();
		
	}
	
	
	static void BankDetails() {
		
		WebElement Bank1 = driver.findElement(By.xpath("//li/a[normalize-space()='BANK']"));
		WebElement Debit_Account_target_Field = driver.findElement(By.xpath("//ol[@id='bank']/li[@class='placeholder']"));
		act.dragAndDrop(Bank1, Debit_Account_target_Field).perform();
	}
	
	static void BankAmount () {
		
		WebElement BankAmmountBtn = driver.findElement(By.xpath("//ul/li[2]/a[normalize-space()='5000']"));
		WebElement Debit_Ammount_target_Field = driver.findElement(By.xpath("//ol[@id='amt7']/li[@class='placeholder']"));
		
		act.dragAndDrop(BankAmmountBtn, Debit_Ammount_target_Field).perform();
		
	}
	
	static void SalesDetails() {
		
		WebElement Sales = driver.findElement(By.xpath("//ul/li/a[normalize-space()='SALES']"));
		WebElement Credit_Account_target_Field = driver.findElement(By.xpath("//ol[@id='loan']/li[@class='placeholder']"));
		
		act.dragAndDrop(Sales, Credit_Account_target_Field).perform();
	}
	
	static void SalesAmmount() {
		WebElement SalesAmmountBtn = driver.findElement(By.xpath("//ul/li[4]/a[normalize-space()='5000']"));
		WebElement Credit_Ammount_target_Field = driver.findElement(By.xpath("//ol[@id='amt8']/li[@class='placeholder']"));
		act.dragAndDrop(SalesAmmountBtn, Credit_Ammount_target_Field ).perform();
		
	}
	
	static void Validation() {
		
		WebElement PerfectBtn = driver.findElement(By.xpath("//a[normalize-space()='Perfect!']"));
		
		if(PerfectBtn.isDisplayed()) {
			
			System.out.println("Operation successful");
		}
	}

}
