package SeleniumF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchIE 
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.ie.driver","C:\\Users\\RAHUL\\Desktop\\Selenium\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");
		WebDriver mallu=new InternetExplorerDriver();
		mallu.get("https://www.google.com");
		
	}
}
