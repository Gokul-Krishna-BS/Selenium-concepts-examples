package selenium_mkt;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonShoeChildPopup {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement SearchField= driver.findElement(By.id("twotabsearchtextbox"));
		SearchField.sendKeys("Shoes");
		SearchField.sendKeys(Keys.ENTER);
		WebElement SearchResult= driver.findElement(By.xpath("(//a[@class='a-link-normal s-underline-text "
				+ "s-underline-link-text s-link-style a-text-normal'])[1]"));
		SearchResult.click();
		Set<String> Ids = driver.getWindowHandles();
		Iterator<String> PCIds = Ids.iterator();
		String ParentId = PCIds.next();
		String ChildId = PCIds.next();
		driver.switchTo().window(ChildId);
		//Thread.sleep(2000);
		driver.close();
		
	}

}
