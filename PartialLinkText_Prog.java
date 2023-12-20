package selenium_mkt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText_Prog {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement PartialLink=driver.findElement(By.partialLinkText("Best"));
		PartialLink.click();
		WebElement Renewed=driver.findElement(By.partialLinkText("Renewed"));
		Renewed.click();
		WebElement LinkText = driver.findElement(By.linkText("Best Sellers"));
		LinkText.click();
		
	}

}
