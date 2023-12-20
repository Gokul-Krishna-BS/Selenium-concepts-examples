package selenium_mkt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ISelected {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement Checkbox= driver.findElement(By.xpath("//input[@name='checkbox-833[]']"));
		boolean CB=Checkbox.isSelected();
		if(CB==false)
		Checkbox.click();


	}

}
