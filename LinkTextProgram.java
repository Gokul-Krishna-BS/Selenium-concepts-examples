package selenium_mkt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LinkTextProgram {

	public static void main(String[] args) 
	{
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement gmaillink=driver.findElement(By.linkText("Gmail"));
		gmaillink.click();
	}

}
