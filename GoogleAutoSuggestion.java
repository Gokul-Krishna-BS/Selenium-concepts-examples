package selenium_mkt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutoSuggestion {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement Search=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		Search.sendKeys("India");
		Thread.sleep(2000);
		List<WebElement> AutoSuggestion= driver.findElements(By.xpath("(//div[@class='OBMEnb'])[1]/ul/li"));
		int count=AutoSuggestion.size();
		System.out.println(count);
		AutoSuggestion.get(5).click();
		
	}

}
