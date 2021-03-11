package SeleniumF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class GreenCart 
{

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAHUL\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver Mallu=new ChromeDriver();
		
		
		Mallu.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		//Mallu.findElement(By.cssSelector(""));
		//Mallu.findElement(By.cssSelector("#root > div > div.products-wrapper > div > div:nth-child(1) > div.stepper-input > a.increment\r\n")).click();
		Mallu.findElement(By.cssSelector("#root > div > div.products-wrapper > div > div:nth-child(1) > div.product-action > button")).click();
		Thread.sleep(2000);
		//Mallu.findElement(By.cssSelector("#root > div > div.products-wrapper > div > div:nth-child(2) > div.stepper-input > a.increment\r\n")).click();
		Mallu.findElement(By.cssSelector("#root > div > div.products-wrapper > div > div:nth-child(2) > div.product-action > button")).click();
		Thread.sleep(2000);
		Mallu.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		//Mallu.findElement(By.cssSelector("#root > div > div.products-wrapper > div > div:nth-child(3) > div.stepper-input > a.increment")).click();
		Mallu.findElement(By.cssSelector("#root > div > div.products-wrapper > div > div:nth-child(3) > div.product-action > button")).click();
		
		Thread.sleep(2000);
		Mallu.findElement(By.cssSelector("#root > div > header > div > div.cart > a.cart-icon > img")).click();
		Thread.sleep(2000);
		Mallu.findElement(By.cssSelector("#root > div > header > div > div.cart > div.cart-preview.active > div.action-block > button")).click();
		Mallu.get("https://rahulshettyacademy.com/seleniumPractise/#/cart");
		Mallu.findElement(By.cssSelector("#root > div > div > div > div > div > input")).click();
		Thread.sleep(2000);
		Mallu.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/input")).sendKeys("abc");
		Thread.sleep(2000);
		Mallu.findElement(By.cssSelector("#root > div > div > div > div > div > input")).sendKeys("rahulshettyacademy");
		Thread.sleep(2000);
		Mallu.findElement(By.cssSelector("#root > div > div > div > div > div > button")).click();
		Thread.sleep(2000);
		Mallu.findElement(By.cssSelector("#root > div > div > div > div > button")).click();
		Thread.sleep(2000);

	}

}
