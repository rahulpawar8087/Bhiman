package Testing2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumF.ChromeDriver;

public class Hello 
{
	public static WebDriver mallu;
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAHUL\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		mallu=new ChromeDriver();
		mallu.get("http://www.qaclickacademy.com/");
		mallu.findElement(By.cssSelector("#homepage > header > div.tools > div > nav > ul > li:nth-child(4) > a > span")).click();
	}
}
