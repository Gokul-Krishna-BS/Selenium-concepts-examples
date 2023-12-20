package selenium_mkt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDsiplayed {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement LastName=driver.findElement(By.id("5"));
		boolean LN=LastName.isDisplayed();
		if(LN==true)
		LastName.sendKeys("B S");

	}

}
