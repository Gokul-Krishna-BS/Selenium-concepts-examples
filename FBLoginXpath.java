package selenium_mkt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLoginXpath {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement Username = driver.findElement(By.xpath("//input[@name='email']"));
		Username.sendKeys("1234@email.com");
		WebElement Password = driver.findElement(By.xpath("//input[@name='pass']"));
		Password.sendKeys("4566666");
		WebElement LoginButton = driver.findElement(By.xpath("//button[@name='login']"));
		LoginButton.click();
	}

}
