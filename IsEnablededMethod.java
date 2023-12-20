package selenium_mkt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnablededMethod {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement Username= driver.findElement(By.id("1"));
		boolean UN=Username.isEnabled();
		if(UN==true)
		Username.sendKeys("Gokul_GrotechMinds");
	}

}
