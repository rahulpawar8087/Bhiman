package SeleniumF;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action1 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAHUL\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver Mallu=new ChromeDriver();
		Mallu.get("https://www.amazon.com/");
		Actions A=new Actions(Mallu);
		A.moveToElement(Mallu.findElement(By.cssSelector("#nav-link-accountList > span.nav-line-2.nav-long-width"))).build().perform();
		A.moveToElement(Mallu.findElement(By.cssSelector("#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Eirphone").doubleClick().build().perform();
	}
	

}
