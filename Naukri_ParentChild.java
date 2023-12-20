package selenium_mkt;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri_ParentChild {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.naukri.com");
		WebElement NaukriLoginButton = driver.findElement(By.id("login_Layer"));
		NaukriLoginButton.click();
		WebElement GoogleButton = driver.findElement(By.className("google"));
		GoogleButton.click();
		Set<String> Ids = driver.getWindowHandles();
		Iterator<String> PidCid = Ids.iterator();
		String NaukriWindowId = PidCid.next();
		String GoogleWindowId = PidCid.next();
		System.out.println("Naukri window Id="+NaukriWindowId);
		System.out.println("Google window ID="+GoogleWindowId);
		driver.switchTo().window(GoogleWindowId);
		driver.close();
		
		
	}

}
