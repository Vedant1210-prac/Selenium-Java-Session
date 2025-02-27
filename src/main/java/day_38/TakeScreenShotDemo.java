package day_38;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotDemo {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("document.body.style.zoom='50%'");
		
		
		//1) Full Page ScreenShot
		
		TakesScreenshot Ts = (TakesScreenshot)driver;
		
		File sourceFile = Ts.getScreenshotAs(OutputType.FILE);
		
		//hardcoded path
		//File targetFile = new File("C:\\Users\\VEBHURE\\eclipse-workspace\\SeleniumWedDriver\\screenShots\\fullpage.png");
		
		//for Dynamic path 
		File targetFile = new File(System.getProperty("user.dir")+"\\screenShots\\\\fullpage3.png");
		sourceFile.renameTo(targetFile); //Copy the sourceFile to targetFile
		
		
		//2) Taking screenshot specific section 
		
		WebElement screenShotEle = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		
		File sourcefileOfEle = screenShotEle.getScreenshotAs(OutputType.FILE);
		
		File targetfileOfEle = new File(System.getProperty("user.dir")+"\\screenShots\\Specific.png");
		
		sourcefileOfEle.renameTo(targetfileOfEle);
		
		//3) Capturing the screenshot of specific element
		
		String timestamp = new SimpleDateFormat("yyyyMMdd_hhmmss").format(new Date()); 
		
		String Logo = "Logo"+"_"+timestamp+".png";
		
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		
		File sourceFileOfLogo = logo.getScreenshotAs(OutputType.FILE);
		
		File targetFileOfLogo = new File(System.getProperty("user.dir")+ "\\screenShots\\"+Logo);
		
		sourceFileOfLogo.renameTo(targetFileOfLogo);
		
		
	}

}
