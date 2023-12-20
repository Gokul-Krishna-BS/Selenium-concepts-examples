package selenium_mkt;

import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopup {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/gokul/OneDrive/Desktop/MKT/Core%20Java%20Selenium/learningHTML1_MKT.html");
		driver.switchTo().alert().accept();
		
	}

}
