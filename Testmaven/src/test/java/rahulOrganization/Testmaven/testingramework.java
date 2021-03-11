package rahulOrganization.Testmaven;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.helpers.Loader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testingramework 
{
	
	@Test
	public void firsttest()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAHUL\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver obj= new ChromeDriver();
		obj.get("https://www.halaplay.com/");
	}
	@Test
	public void add()
		{
		int a=15;
		System.out.println("addition is "+'a');
		}
	private static Logger log=LogManager.getLogger(testingramework.class.getName());
	public static void main(String[] args) 
	{
		log.debug("I am debugging");
		log.error("this is error");
	}
} 
