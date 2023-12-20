package selenium_mkt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLoginWithoutHover {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%"
		+ "2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net"
		+ "%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid."
		+ "claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%"
		+ "2Fspecs.openid.net%2Fauth%2F2.0");
		Thread.sleep(3000);
		WebElement un=driver.findElement(By.id("ap_email"));
		un.sendKeys("gokulbs@gmail.com");
		WebElement ContinueButton=driver.findElement(By.id("continue"));
		ContinueButton.click();
		Thread.sleep(3000);
		WebElement pw=driver.findElement(By.id("ap_password"));
		pw.sendKeys("123456");
		WebElement SigninButton=driver.findElement(By.id("signInSubmit"));
		SigninButton.click();
		
	}

}
