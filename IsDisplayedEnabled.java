package selenium_mkt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedEnabled {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement LastName=driver.findElement(By.id("5"));
		boolean LN=LastName.isDisplayed();
		boolean LN1=LastName.isEnabled();
		if(LN==true && LN1==true)
		LastName.sendKeys("B S");
		else
			System.out.println("Field not enabled or displayed");

	}

}
