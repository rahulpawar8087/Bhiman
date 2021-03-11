package SeleniumF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reddiff
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAHUL\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver Bullu=new ChromeDriver();
		Bullu.get("https://www.rahulshettyacademy.com/AutomationPractice///");
		//Bullu.findElement(By.cssSelector("a[title*=Already]")).click();
		//Bullu.findElement(By.cssSelector("input[maxlength*='30']")).sendKeys("worldsex");
		//Bullu.findElement(By.cssSelector("input[name*=pa]")).sendKeys("worldsex");
		WebElement staticDropdown=Bullu.findElement(By.cssSelector("#dropdown-class-example"));
		
	}
}
		