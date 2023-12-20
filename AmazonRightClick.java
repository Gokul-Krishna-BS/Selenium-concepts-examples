package selenium_mkt;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonRightClick
{
	public static void main(String[] args) throws AWTException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement RightClickComponent= driver.findElement(By.linkText("Best Sellers"));
		Actions a1=new Actions(driver);
		a1.contextClick(RightClickComponent).perform();
		Robot r1=new Robot();
		for(int i=0;i<4;i++)
		{
			r1.keyPress(KeyEvent.VK_DOWN);
		}
		r1.keyPress(KeyEvent.VK_ENTER);
		
	}
}
