package selenium_mkt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonHoverOver_SignIn {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement SignInButton= driver.findElement(By.id("nav-link-accountList"));
		Actions a1=new Actions(driver);                                                                                           
		a1.moveToElement(SignInButton).perform();
		WebElement SignInButtonClick= driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]"));
		SignInButtonClick.click();
		WebElement un=driver.findElement(By.xpath("(//input)[7]"));
		un.sendKeys("gokulbs@gmail.com");
		WebElement ContinueButton=driver.findElement(By.xpath("(//input)[10]"));
		ContinueButton.click();
	}
	

}
