package selenium_mkt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAutoSuggestion {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(4000);
		WebElement CloseButton= driver.findElement(By.xpath("//span[.='✕']"));
		CloseButton.click();
		WebElement SearchField= driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		SearchField.sendKeys("Shoes");
		Thread.sleep(2000);
		List<WebElement> AutoSuggestion= driver.findElements(By.xpath("//div/form/ul/li"));
		int count=AutoSuggestion.size();
		AutoSuggestion.get(count-1).click();
	}

}
