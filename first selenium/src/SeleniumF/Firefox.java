package SeleniumF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox 
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\RAHUL\\Desktop\\Selenium\\geckodriver-v0.29.0-win32\\geckodriver.exe")
		WebDriver mallu=new FirefoxDriver();
		mallu.get("https://www.google.com");
		
	}
}
