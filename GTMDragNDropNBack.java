package selenium_mkt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GTMDragNDropNBack {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://grotechminds.com/drag-and-drop/");
		WebElement Cucumber=driver.findElement(By.xpath("(//div[@id='div1'])[1]"));
		WebElement DropBox=driver.findElement(By.xpath("(//div[@id='div2'])[1]"));
		Actions a1=new Actions(driver);
		a1.dragAndDrop(Cucumber, DropBox).perform();
		WebElement Cucumber1 = driver.findElement(By.xpath("(//div[@id='div2'])[1]"));
		WebElement Droppbox1 = driver.findElement(By.xpath("(//div[@id='div1'])[1]"));
		a1.dragAndDrop(Cucumber1, Droppbox1).perform();
	}

}
