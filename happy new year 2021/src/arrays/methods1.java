package arrays;

import java.util.Scanner;

public class methods1 
{
	int a,b;
	public int add(int a,int b)
	{
		//Scanner sc= new Scanner(System.in);
		//a=sc.nextInt();
		//Scanner sc= new Scanner(System.in);
		//b=sc.nextInt();
		int c=a+b;
		return c;
	}
	public static void main(String[] args)
	{
		
		methods1 o=new methods1();
		int c=o.add(12,12);
		System.out.println(c);
	}

}
