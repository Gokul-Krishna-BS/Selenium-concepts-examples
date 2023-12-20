package selenium_mkt;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement GoogleSearchField = driver.findElement(By.id("APjFqb"));
		GoogleSearchField.sendKeys("Football");
		GoogleSearchField.sendKeys(Keys.ENTER);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
