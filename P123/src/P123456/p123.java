package P123456;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class p123 
{
	@AfterTest
	public void p1()
	{
	System.out.println("i am in test 1");	
	}
	@BeforeTest
	public void p2()
	{
	System.out.println("i am in test 2");	
	}
	@Test
	public void p3()
	{
	System.out.println("i am in test 3");	
	}
	
}
