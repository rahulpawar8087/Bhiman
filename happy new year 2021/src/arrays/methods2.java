package arrays;

import java.util.Scanner;

public class methods2 
{
	//public void sum();
	public void add(int x, int i)
	{
		int result=0;
		//Scanner sc=new Scanner(System.in);
		//int x=sc.nextInt();
		result=i+x;
		System.out.println("reslut= "+result);
		
	}
	public void add(int x[])
	{
		int result=0;
		//Scanner sc=new Scanner(System.in);
		//int x=sc.nextInt();
		for(int i=0;i<x.length;i++)
		{
		result=result+x[i];
		}
		System.out.println("reslut= "+result); 
	}
	public static void main(String[] args)
	{
		methods2 o=new methods2();
		int number[]= {1,2,3,4,5};
		o.add(number);
		o.add(7, 8);

	}

}
