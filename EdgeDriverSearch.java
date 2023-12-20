package selenium_mkt;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverSearch {

	public static void main(String[] args)
	{
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bing.com");
		WebElement SearchTextArea = driver.findElement(By.id("sb_form_q"));
		SearchTextArea.sendKeys("Mathematics");
		SearchTextArea.sendKeys(Keys.ENTER);
	}

}
