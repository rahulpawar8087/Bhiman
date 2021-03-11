package Exception;

public class ThrowsExcep 
{
	public void m1() throws ArrayIndexOutOfBoundsException
	{
		int a[]= {1,2,3};
		System.out.println(a[4]);
		System.out.println("Continue");
	}
}
