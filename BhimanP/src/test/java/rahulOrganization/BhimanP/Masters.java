package rahulOrganization.BhimanP;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Masters 
{
	@Test
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAHUL\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver obj= new ChromeDriver();
		obj.get("http://103.50.162.196/testing/user-login.php");
		obj.findElement(By.cssSelector("#username")).sendKeys("9876543210");
		obj.findElement(By.cssSelector("#password")).sendKeys("admin");
		obj.findElement(By.cssSelector("#login_form > div.clearfix > div > button")).click();
		obj.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//Thread.sleep(5000);
		//obj.findElement(By.cssSelector("body > div.swal2-container > div.swal2-modal.show-swal2.visible > button.swal2-confirm.styled")).click();
		//obj.switchTo().alert().accept();
		//obj.findElement(By.cssSelector("body > div.swal2-container > div.swal2-modal.show-swal2.visible > button.swal2-confirm.styled")).click();
		//obj.get("http://103.50.162.196/testing/index.php");
		//obj.findElement(By.cssSelector("#respMenu > li:nth-child(2) > a > span.toggle-none")).click();
		//obj.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Actions A=new Actions(obj);
		A.moveToElement(obj.findElement(By.cssSelector("#respMenu > li:nth-child(2) > a > span.arrow"))).build().perform();
		obj.findElement(By.cssSelector("#respMenu > li:nth-child(2) > ul > li:nth-child(2)")).click();
		/*WebElement w=obj.findElement(By.cssSelector("#respMenu > li:nth-child(2) > a > span.arrow"));
		Select sel=new Select(w);
		List<WebElement> L=sel.getOptions();
		int a=L.size();
		System.out.println(a);*/
		
	}
}
