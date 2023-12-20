package selenium_mkt;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Shoe_Search {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:www.amazon.in");
		WebElement SearchField=driver.findElement(By.xpath("(//input)[4]"));
		SearchField.sendKeys("Shoes");
		SearchField.sendKeys(Keys.ENTER);
	}

}
