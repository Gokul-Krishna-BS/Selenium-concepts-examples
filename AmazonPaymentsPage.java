package selenium_mkt;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPaymentsPage {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://www.amazon.in");
		WebElement SearchField= driver.findElement(By.id("twotabsearchtextbox"));
		SearchField.sendKeys("Realme Mobiles");
		SearchField.sendKeys(Keys.ENTER);
		WebElement SearchResult = driver.findElement(By.xpath("(//a[@class='a-link-normal s-underline-text"
				+ " s-underline-link-text s-link-style a-text-normal'])[11]"));
		SearchResult.click();
		Set<String> Ids = driver.getWindowHandles();
		Iterator<String> ParentChildIds = Ids.iterator();
		String ParentId = ParentChildIds.next();
		String ChildId = ParentChildIds.next();
		driver.switchTo().window(ChildId);
		WebElement BuynowButton = driver.findElement(By.id("buy-now-button"));
		BuynowButton.click();
		WebElement UsernameField = driver.findElement(By.id("ap_email"));
		UsernameField.sendKeys("krishnasaseendran29@gmail.com");
		WebElement ContinueButton = driver.findElement(By.id("continue"));
		ContinueButton.click();
		WebElement PasswordField = driver.findElement(By.id("ap_password"));
		PasswordField.sendKeys("rahmanlegacy");
		WebElement SignInButton = driver.findElement(By.xpath("//input[@type='submit']"));
		SignInButton.click();
		driver.findElement(By.xpath("((//h3[@class='a-color-base clickable-heading expand-collapsed-panel-trigger'])[2])")).click();
		
	}

}
