package SeleniumF;
import org.openqa.selenium.By;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelLoc
{

	public static void main(String[] args)
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAHUL\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver Mallu=new ChromeDriver();
		Mallu.get("https://rahulshettyacademy.com/angularpractice/");
		/*WebElement abc=Mallu.findElement(By.cssSelector("body > app-root > form-comp > div > form > div:nth-child(1) > input"));
		Mallu.findElement(withTagName("label").above(abc).gettext());
		*/
		Mallu.getWindowHandles();

	}

}
