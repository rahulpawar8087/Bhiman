package SeleniumF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frameworktesting 
{
	public static WebDriver mallu;
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAHUL\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		mallu=new ChromeDriver();
		mallu.get("http://www.qaclickacademy.com/");
	}
	
}
