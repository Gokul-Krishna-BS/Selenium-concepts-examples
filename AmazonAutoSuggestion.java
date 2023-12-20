package selenium_mkt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAutoSuggestion 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement SearchField = driver.findElement(By.id("twotabsearchtextbox"));
		SearchField.sendKeys("Shoes");
		Thread.sleep(2000);
		List<WebElement> ShoesAutoSuggestion = driver.findElements(By.xpath("((//div[@class='two-pane-results-container'])"
				+ "/div/div/div)"));
		int count=ShoesAutoSuggestion.size();
		System.out.println("No. of autosuggestions:"+count);
		ShoesAutoSuggestion.get(0).click();
	}
}
