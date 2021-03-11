package Testing2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Launchchrome 
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.ie.driver","C:\\Users\\RAHUL\\Desktop\\Selenium\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");
		WebDriver Mallu=new InternetExplorerDriver();
		Mallu.get("https://www.google.com");
		
	}
}
