package day_37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingBarDemo {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.worldometers.info/geography/flags-of-the-world/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		//1) scroll page by using pixle number
		/*js.executeScript("window.scrollBy(0, 3000)", "");
		
		System.out.println(js.executeScript("return window.pageYOffset;"));
*/		
		
		
		//2) scroll page till webElement
		
		/*WebElement flag1 = driver.findElement(By.xpath("//a[@href='/img/flags/iv-flag.gif']"));
		
		js.executeScript("arguments[0].scrollIntoView()", flag1);
		
		System.out.println(js.executeScript("return window.pageYOffset"));*/
		
		
		//3) Scroll the page till last end
		
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		
		System.out.println(js.executeScript("return window.pageYOffset"));
		
		
		
		//4)scrolling starting of page
		
		js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
		
		System.out.println(js.executeScript("return window.pageYOffset"));
		
		
		
	}

}
