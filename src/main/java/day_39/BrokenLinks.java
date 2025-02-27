package day_39;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args)  {

		
		int noOfBrokenLink =0;
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.deadlinkcity.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement> listOfLink = driver.findElements(By.tagName("a"));
		
		for(WebElement LinkList : listOfLink) {
			
			String link = LinkList.getAttribute("href");
			
			if(link==null || link.isEmpty()) {
				
				System.out.println("href is empty");
				
				continue;
			}
			try {
			URL linkURL = new URL(link);   //converted href value to string to URL
			
			HttpURLConnection conn = (HttpURLConnection) linkURL.openConnection();       //open connection to the server
			
			conn.connect();   //connect URL to the server
			
			if(conn.getResponseCode()>=400) {
				
				System.out.println(link + "Broken Link");
				noOfBrokenLink++;
			}
			else {
				
				System.out.println(link + "not broken link");
			}
			}
			catch(Exception e) {
				
			}
			
			
		}
		
		System.out.println(noOfBrokenLink);
		
	}

}
