package TestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;



public class Mallu1 
{
	@Parameters({"mallu"})
	@Test
	public void test_01(String key)
	{
		System.out.println("Value is "+key);
	}
	@Test(dataProvider="tallu")
	public void test2(String k1,String k2)
	{
		System.out.println(k1);
		System.out.println(k2);
	}
	@DataProvider
	public Object[][] tallu()
	{
		Object bullu[][]=new Object[3][2];
		bullu[0][0]="Bamberi";
		bullu[0][1]="bam";
		bullu[1][0]="bam1";
		bullu[1][1]="bamberi2";
		bullu[2][0]="bam3";
		bullu[2][1]="bam4";
		return bullu;
	}
	
}
