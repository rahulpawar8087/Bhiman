package SeleniumF;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Footerauto 
{
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAHUL\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver Mallu=new ChromeDriver();
		Mallu.get("https://www.naukri.com/");
		WebElement FD=Mallu.findElement(By.cssSelector("div[class='footer anchorList']"));
		System.out.println(FD.findElements(By.tagName("a")).size());
		WebElement Col=FD.findElement(By.cssSelector("#root > div.footerGNBWrap > div.footer.anchorList > div > div:nth-child(1)"));
		System.out.println(Col.findElements(By.tagName("a")).size());
		for(int i=1;i<Col.findElements(By.tagName("a")).size();i++)
		{
			String Click=Keys.chord(Keys.CONTROL,Keys.ENTER);
			Col.findElements(By.tagName("a")).get(i).sendKeys(Click);
			//Thread.sleep(2000);
			
		}
		Mallu.getWindowHandles();
		Set<String> windows=Mallu.getWindowHandles();
		java.util.Iterator<String> it=windows.iterator();
		Mallu.switchTo().window(it.next());
		System.out.println(Mallu.getTitle());
		/*while(it.hasNext())
		{
			Mallu.switchTo().window(it.next());
			System.out.println(Mallu.getTitle());
		}*/
	}
}
