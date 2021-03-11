package SeleniumF;

import java.util.List;
import java.util.stream.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Streamsexample
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAHUL\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver Mallu=new ChromeDriver();
		Mallu.get("https://www.fancode.com/");
		Mallu.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		Mallu.findElement(By.cssSelector("#root > div > div > div > div > div > div > table > thead > tr > th:nth-child(1) > span:nth-child(1)")).click();
		List<WebElement> L=Mallu.findElements(By.cssSelector("tr > td:nth-child(1)"));
		
		List<String> ori=L.stream().map(s->s.getText()).collect(Collectors.toList());
		
		
		List<String> sort=ori.stream().sorted().collect(Collectors.toList());
		System.out.println(ori);

	}

}
