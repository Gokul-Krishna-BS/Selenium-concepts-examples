package selenium_mkt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningHTMLFile_Program {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(6));
		driver.get("file:///C:/Users/gokul/OneDrive/Documents/learningHTML1.html");
		//driver.switchTo().alert().accept();
		WebElement un=driver.findElement(By.xpath("(/html/body/input)[1]"));
		un.sendKeys("gokul");
		WebElement hint=driver.findElement(By.xpath("(/html/body/input)[2]"));
		hint.sendKeys("my name");
		WebElement password=driver.findElement(By.xpath("(/html/body/input)[3]"));
		password.sendKeys("gokul123");
		WebElement fname=driver.findElement(By.xpath("(/html/body/form/input)[1]"));
		fname.sendKeys("Gokul");
//		WebElement lname=driver.findElement(By.xpath("(/html/body/form/input)[2]"));
//		lname.sendKeys("B S");
		WebElement submitbutton=driver.findElement(By.xpath("(/html/body/form/input)[3]"));
		submitbutton.click();
		//driver.switchTo().alert().accept();
		driver.navigate().back();
		WebElement checkbox=driver.findElement(By.xpath("(/html/body/form/input)[5]"));
		checkbox.click();
		WebElement submitbtn=driver.findElement(By.xpath("(/html/body/form/input)[7]"));
		submitbtn.click();
		//driver.switchTo().alert().accept();
		driver.navigate().back();
		WebElement maleradiobutton=driver.findElement(By.xpath("(/html/body/input)[4]"));
		maleradiobutton.click();
		WebElement Relocatecheckbox=driver.findElement(By.xpath("(/html/body/input)[6]"));
		Relocatecheckbox.click();
		WebElement AboutusLink=driver.findElement(By.xpath("(/html/body/a)"));
		AboutusLink.click();
		driver.navigate().back();
		WebElement SignupButton=driver.findElement(By.xpath("(/html/body/input)[7]"));
		SignupButton.click();
		System.out.println("Interacted with components successfully");	
		
	}

}
