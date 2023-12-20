package selenium_mkt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		WebElement un=driver.findElement(By.name("email"));
		un.sendKeys("gokul@email.com");
		WebElement pw=driver.findElement(By.name("pass"));
		pw.sendKeys("123@email");
		WebElement LoginButton=driver.findElement(By.name("login"));
		LoginButton.click();
		
	}

}
