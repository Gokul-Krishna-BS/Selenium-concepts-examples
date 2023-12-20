package selenium_mkt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLoginPopUpClose {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		WebElement MobileNumberField= driver.findElement(By.xpath("//input[@class='_18u87m _3WuvDp']"));
		MobileNumberField.sendKeys("1234567821");
		WebElement CloseButton= driver.findElement(By.xpath("//span[.='✕']"));
		CloseButton.click();
		
	}

}
