package selenium_mkt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAmazon {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.amazon.in");
		WebElement MobilesLink = driver.findElement(By.linkText("Mobiles"));
		Actions a1=new Actions(driver);
		a1.doubleClick(MobilesLink).perform();
	}

}
