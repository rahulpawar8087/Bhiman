package SeleniumF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSPra1
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAHUL\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver Mallu=new ChromeDriver();
		Mallu.get("https://www.salesforce.com/in/");
		Mallu.findElement(By.cssSelector("#globalnavbar-header-container > div.header-right-content > div > div.global-nav-login-flydown.global-login > div > div > div.dropdown > a")).click();
		Mallu.findElement(By.cssSelector("#username")).sendKeys("worldsex");
		Mallu.findElement(By.cssSelector("#password")).sendKeys("worldsex");
		Mallu.findElement(By.cssSelector("#Login")).click();
		System.out.println(Mallu.findElement(By.cssSelector("#error")).getText());
	}
}
