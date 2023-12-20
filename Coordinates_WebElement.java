package selenium_mkt;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coordinates_WebElement {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement CountryName= driver.findElement(By.linkText("Brazil"));
		Point xandy= CountryName.getLocation();
		System.out.println(xandy);
		int x= xandy.getX();
		int y= xandy.getY();
		System.out.println("X="+x);
		System.out.println("Y="+y);
	}

}
