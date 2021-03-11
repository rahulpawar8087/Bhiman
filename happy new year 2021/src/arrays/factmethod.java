package arrays;

import java.util.Scanner;

public class factmethod {

	public void fact()
	{
		int fac = 1;
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=a;i>0;i--)
		{
			 fac=fac*i;	
		}
		System.out.println(fac);
		
	}
	public static void main(String[] args)
	{
		factmethod o=new factmethod();
		o.fact();
	}

}
