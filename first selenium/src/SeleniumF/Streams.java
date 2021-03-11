package SeleniumF;

import java.util.stream.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Streams 
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAHUL\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver Mallu=new ChromeDriver();
		Mallu.get("https://www.fancode.com/");
		ArrayList<String> Al=new ArrayList<String>();
		List L=new ArrayList();
		Al.add("Gaurav");
		Al.add("Gupta");
		Al.add("Mallu");
		Al.add("Mathpati");
		for(int i=0;i<Al.size();i++)
		{
			String s=Al.get(i);
			System.out.println(s);
		}
		
		Stream.of("Gaurav","Mallu","Rahul").filter(s->s.endsWith("u")).limit(1).forEach(s->System.out.println(s));
		
	}
}
