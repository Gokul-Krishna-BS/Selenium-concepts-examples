package selenium_mkt;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchIndia {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.id("APjFqb")).sendKeys("India");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
		driver.close();
	}

}
