package selenium_mkt;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassnameLocator_Prog {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement searchfield=driver.findElement(By.className("gLFyf"));
		searchfield.sendKeys("India");
		searchfield.sendKeys(Keys.ENTER);
		
		
	}

}
