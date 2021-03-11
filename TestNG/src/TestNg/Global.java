package TestNg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//@SuppressWarnings("unused")
public class Global
{
	public static void main(String args[]) throws IOException
	{
	Properties p=new Properties();
	FileInputStream file1=new FileInputStream("C:\\Users\\RAHUL\\eclipse-workspace\\TestNG\\Input/abc.properties");
	p.load(file1);
	String s=p.getProperty("Name");
	System.out.println(s);
	}
}
