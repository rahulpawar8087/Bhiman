package SeleniumF;

import java.util.List;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll 
{

	public static void main(String[] args)
	{

		//WebDriverManager.chromedriver().setup();

		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAHUL\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver Mallu=new ChromeDriver();
		Mallu.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js=(JavascriptExecutor)Mallu;
		//js.executeScript("window.scrollBy(0,3000)");
		//js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
		//List<WebElement>addition=Mallu.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));                                       
	//	System.out.println(addition.get(2).getText());
	}

}
