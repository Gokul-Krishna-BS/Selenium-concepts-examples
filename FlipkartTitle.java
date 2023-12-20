package selenium_mkt;

import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTitle {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		System.out.println(driver.getTitle());
		driver.close();
	}

}
