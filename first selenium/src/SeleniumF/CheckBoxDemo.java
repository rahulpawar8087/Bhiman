package SeleniumF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAHUL\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver Mallu=new ChromeDriver();
		Mallu.get("https://rahulshettyacademy.com/AutomationPractice/");
		Mallu.findElement(By.cssSelector("#checkBoxOption1")).click();
		System.out.println(Mallu.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
		Mallu.findElement(By.cssSelector("#checkBoxOption1")).click();
		System.out.println(Mallu.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
		//Assert.assertTrue(Mallu.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
		System.out.println(Mallu.findElements(By.cssSelector("[type='checkbox']")).size());
		

	}

}
