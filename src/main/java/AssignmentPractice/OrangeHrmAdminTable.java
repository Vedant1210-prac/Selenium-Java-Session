package AssignmentPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmAdminTable {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		String MainUserNameText= driver.findElement(By.xpath("//p[normalize-space()='Username : Admin']")).getText();
		
		String MainPasswordText = driver.findElement(By.xpath("//p[normalize-space()='Password : admin123']")).getText();
		
		String userName = MainUserNameText.substring(11,16);
		
		System.out.println(userName);
		
		String Password = MainPasswordText.substring(11,19);
		
		System.out.println(Password);
		
		driver.findElement(By.cssSelector("input[name=username]")).sendKeys(userName);
		
		driver.findElement(By.cssSelector("input[name=password]")).sendKeys(Password);
		
		driver.findElement(By.cssSelector("button[type=submit]")).click();
		
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		
		List<WebElement> table = driver.findElements(By.xpath("//div[@role='table']/div[@class='oxd-table-body']/div"));
		
		System.out.println(table.size());
		
		for(int i = 1; i<=table.size(); i++) {
			
			
				
			String username = driver.findElement(By.xpath("//div[@role='table']/div[@class='oxd-table-body']/div["+i+"]/div/div[2]")).getText();
			String User_Role = driver.findElement(By.xpath("//div[@role='table']/div[@class='oxd-table-body']/div["+i+"]/div/div[3]")).getText();
			
			System.out.println(username+ "\t" +User_Role);
			
		}
		
		
	}

}
