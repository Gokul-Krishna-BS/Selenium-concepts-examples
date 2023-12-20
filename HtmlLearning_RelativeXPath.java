package selenium_mkt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlLearning_RelativeXPath {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/gokul/OneDrive/Desktop/MKT/Core%20Java%20Selenium/learningHTML1_MKT.html");
		WebElement Username=driver.findElement(By.xpath("(//input)[1]"));
		Username.sendKeys("Gokul");
		WebElement Hint=driver.findElement(By.xpath("(//input)[2]"));
		Hint.sendKeys("My name");
		WebElement Password=driver.findElement(By.xpath("(//input)[3]"));
		Password.sendKeys("Gokul123");
		WebElement FirstName=driver.findElement(By.xpath("(//input)[4]"));
		FirstName.sendKeys("Gokul Krishna");
//		WebElement LastName=driver.findElement(By.xpath("(//input)[5]"));
//		LastName.sendKeys("B S");
//		Thread.sleep(2000);
		WebElement Submit=driver.findElement(By.xpath("(//input)[6]"));
		Submit.click();
	}

}
