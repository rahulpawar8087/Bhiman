package SeleniumF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAHUL\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver GG=new ChromeDriver();
		GG.get("https://www.facebook.com/");
		GG.findElement(By.cssSelector("#email")).sendKeys("worldsex");
		GG.findElement(By.cssSelector("#pass")).sendKeys("worldsex");
		GG.findElement(By.cssSelector("#u_0_k")).click();
		GG.findElement(By.xpath("//*[@id=\"u_0_k\"]\r\n" + "")).click();	
}
}