package SeleniumF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSel
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAHUL\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver Mallu=new ChromeDriver();
		Mallu.get("https://www.facebook.com/");
		//Mallu.get("https://www.google.com/");
		//Mallu.navigate().back();
		//Mallu.navigate().forward();
		Mallu.findElement(By.linkText("Forgotten password?")).click();
		Mallu.findElement(By.id("identify_email")).sendKeys("mallikarjun.glb7@gmail.com");
		Mallu.findElement(By.xpath("//*[@id=\"u_0_5\"]")).click();
		Mallu.findElement(By.xpath("//*[@id=\"send_sms:AYiS5QYemMIRZLobGIdmXizbBEcx733T2mtID5zARbqfFkF0u8oXRLDKngB4Mzz4UyA\"]")).click();
		Mallu.findElement(By.xpath("//*[@id=\"initiate_interstitial\"]/div[3]/div/div[1]/button")).click();
		//Mallu.close();
	//	Mallu.findElement(By.id("email")).sendKeys("mallikarjun.glb7@gmail.com");
	//	Mallu.findElement(By.id("pass")).sendKeys("mnm420rtk");
	//	Mallu.findElement(By.id("u_0_b")).click();
	//	Mallu.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[2]/div[4]/div[1]/span/div/div[1]/i")).click();
	//	Mallu.findElement(By.xpath("//*[@id=\"facebook\"]/body")).click();
		System.out.println(Mallu.getTitle());
		System.out.println(Mallu.getCurrentUrl());
	//  System.out.println(Mallu.getPageSource());
	
		
	}
}
