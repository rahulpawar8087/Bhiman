package SeleniumF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Spicejet 
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAHUL\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver Mallu=new ChromeDriver();
		Mallu.get("https://www.spicejet.com/");
		
		Mallu.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).click();
		Mallu.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_0")).click();
		Mallu.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("Pune");
		Mallu.findElement(By.cssSelector("#ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		Mallu.findElement(By.cssSelector("#ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("Chennai");
		Mallu.findElement(By.cssSelector("#ui-datepicker-div > div.ui-datepicker-group.ui-datepicker-group-first > table > tbody > tr:nth-child(4) > td.ui-datepicker-days-cell-over.ui-datepicker-current-day.ui-datepicker-today > a")).click();
		//WebElement object6=Mallu.findElement(By.cssSelector("#flightSearchContainer > div.picker-first2 > button"));
		//Select Cal=new Select(object6);
		//Cal.selectByValue("22");
		//Mallu.findElement(By.cssSelector("#flightSearchContainer > div.row1.adult-infant-child > label")).click();
		Mallu.findElement(By.cssSelector("#divpaxinfo")).click();
		
		WebElement object=Mallu.findElement(By.cssSelector("#ctl00_mainContent_ddl_Adult"));
		Select Drop=new Select(object);
		Drop.selectByIndex(2);
		WebElement object1=Mallu.findElement(By.cssSelector("#ctl00_mainContent_ddl_Child"));
		Select Drop1=new Select(object1);
		Drop1.selectByIndex(1);
		WebElement object2=Mallu.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency"));
		Select Drop2=new Select(object2);
		Drop2.selectByIndex(2);
		Mallu.findElement(By.cssSelector("#ctl00_mainContent_SeniorCitizenDiv > label")).click();
		Mallu.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();

		//Mallu.findElement(By.cssSelector("#ctl00_mainContent_ddl_Adult")).getAttribute("1");
		//Mallu.findElement(by)
	}
}
