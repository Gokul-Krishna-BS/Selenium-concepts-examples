package selenium_mkt;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch_AbsoluteXpath {

	public static void main(String[] args)
	{
		//ChromeDriver driver=new ChromeDriver();
		//FirefoxDriver driver=new FirefoxDriver();
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement SearchField=driver.findElement(By.xpath("((/html/body/div/div)[3]/form/div/div"
				+ "/div/div/div)[2]/textarea"));
		SearchField.sendKeys("India");
		SearchField.sendKeys(Keys.ENTER);
	}

}
