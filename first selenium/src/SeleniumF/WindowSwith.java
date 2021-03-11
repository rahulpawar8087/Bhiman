package SeleniumF;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class WindowSwith
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAHUL\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver Mallu=new ChromeDriver();
		Mallu.get("https://www.naukri.com/");
		Mallu.findElement(By.cssSelector("#root > div.headGNBWrap.initial.fixed > div > ul.midSec.menu > li:nth-child(4) > a > div")).click();
		Set<String> win=Mallu.getWindowHandles();
		Iterator<String> it=win.iterator();
		String o1=it.next();
		String o2=it.next();
		Mallu.switchTo().window(o2);
		String s=Mallu.findElement(By.cssSelector("#root > div > div > div > div:nth-child(2) > div > div.off-leftside > h1")).getText();
		System.out.println(s);
		String abc=s.split("your")[1].trim();
		Mallu.switchTo().window(o1);
		Mallu.findElement(By.cssSelector("#qsb-keyword-sugg")).sendKeys(abc);
		// to take webelement screenshot only
		WebElement abcd=Mallu.findElement(By.cssSelector("#qsb-keyword-sugg"));
		File f=abcd.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(f, new File ("log.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
