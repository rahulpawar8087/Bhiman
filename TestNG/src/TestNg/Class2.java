package TestNg;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Class2
{
	@BeforeClass
	public void demo2()
	{
		System.out.println("In demo of class 2");
	}
	@Test
	public void after() {
		// TODO Auto-generated method stub
		System.out.println("After");

	}
}
