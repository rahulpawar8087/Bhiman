package SeleniumF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Drop
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAHUL\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver Mallu=new ChromeDriver();
		Mallu.get("https://www.rahulshettyacademy.com/AutomationPractice///");
		//WebElement object=Mallu.findElement(By.cssSelector("#dropdown-class-example"));
		//Select drop=new Select(object);
		//drop.selectByIndex(2);
		//drop.selectByVisibleText("Option1");
	//	drop.selectByValue("option3");
		Mallu.findElement(By.cssSelector("#dropdown-class-example")).click();
		Mallu.findElement(By.cssSelector("#dropdown-class-example > option:nth-child(3)")).click();
		Mallu.findElement(By.cssSelector("#dropdown-class-example > option:nth-child(4)")).click();
	}
	

}
