package selenium_mkt;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildPopUP {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in");
		WebElement SearchField= driver.findElement(By.id("twotabsearchtextbox"));
		SearchField.sendKeys("Shoes");
		SearchField.sendKeys(Keys.ENTER);
		WebElement ShoeSelect= driver.findElement(By.xpath("(//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2'])[24]"));
		ShoeSelect.click();
		Thread.sleep(3000);
		Set<String> ParentChildId= driver.getWindowHandles();
		Iterator<String> PC= ParentChildId.iterator();
		String ParentId= PC.next();
		String ChildId=PC.next();
//		System.out.println(ParentId);
//		System.out.println(ChildId);
		driver.switchTo().window(ChildId);
		driver.close();
		
	}

}
