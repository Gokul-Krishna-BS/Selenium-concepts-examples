package selenium_mkt;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import zmq.socket.pubsub.Sub;

public class GrotechmindsRegistration {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement Username= driver.findElement(By.id("1"));
		Username.sendKeys("Gokul_GrotechMinds");
		WebElement Password= driver.findElement(By.id("3"));
		Password.sendKeys("gokul123");
		WebElement FirstName= driver.findElement(By.id("4"));
		FirstName.sendKeys("Gokul Krishna");
		WebElement LastName=driver.findElement(By.id("5"));
		LastName.sendKeys("B S");
		WebElement GenderRadioButton= driver.findElement(By.xpath("(//input[@name='radio-45'])[1]"));
		GenderRadioButton.click();
		WebElement SkillsDropdown =driver.findElement(By.name("menu-600"));
		Select s1=new Select(SkillsDropdown);
		s1.selectByValue("Technical Skills");
		WebElement Skillsdropdown1= driver.findElement(By.name("menu-802"));
		Select s2=new Select(Skillsdropdown1);
		s2.selectByValue("Selenium");
		WebElement CountryDropdown= driver.findElement(By.name("country"));
		Select s3=new Select(CountryDropdown);
		s3.selectByValue("United States");
		WebElement Paddress= driver.findElement(By.name("paddress"));
		Paddress.sendKeys("Gokul,Bengaluru,Karnataka");
		WebElement PermAddress= driver.findElement( By.name("permanentaddress"));
		PermAddress.sendKeys("Gokul, Trivandrum,Kerala");
		WebElement pincode= driver.findElement(By.name("pincode"));
		pincode.sendKeys("234568");
		WebElement ReligionDropdown= driver.findElement(By.name("menu-431"));
		Select s4=new Select(ReligionDropdown);
		s4.selectByValue("atheism");
		WebElement Checkbox= driver.findElement(By.xpath("//input[@name='checkbox-833[]']"));
		Checkbox.click();
		WebElement ResumeUpload= driver.findElement(By.name("file-935"));
		ResumeUpload.sendKeys("C:\\Users\\gokul\\OneDrive\\Desktop\\Vishal _3.2YOE (2).pdf");
		WebElement SubmitButton= driver.findElement(By.xpath("//input[@type='submit']"));
		SubmitButton.click();
				
	}

}
