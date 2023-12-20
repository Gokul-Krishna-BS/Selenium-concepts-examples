package selenium_mkt;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchPresidentOfIndia 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.id("APjFqb")).sendKeys("First president of India");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		String Title=driver.getTitle();
		for(int i=0;i<Title.length();i++)
		{
			System.out.println(Title.charAt(i));
		}
		driver.close();
	}

}
