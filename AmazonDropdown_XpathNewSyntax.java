package selenium_mkt;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonDropdown_XpathNewSyntax {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement Dropdown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select s1=new Select(Dropdown);
		s1.selectByVisibleText("Books");
		WebElement SearchField= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		SearchField.sendKeys("Humans");
		SearchField.sendKeys(Keys.ENTER);
		//System.out.println(s1.getOptions());
		
	}

}
