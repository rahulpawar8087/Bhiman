package TryCatch;

import java.util.Scanner;

public class Maain

{
	public void add(int x[])
	{
		int result=0;
		//Scanner sc=new Scanner(System.in);
		//int x=sc.nextInt();
		for(int j=0;j<x.length;j++)
		{
		result=result+x[j];
		}
		System.out.println("reslut= "+result); 
	}
	public static void main(String args[]) 
	{
		int x[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int k=0;k<x.length;k++)
		{
		x[k]=sc.nextInt();
		}
		Maain obj=new Maain();
		
	//TestM2 obj= new TestM2();
	//obj.m2();
	//Scanner sc=new Scanner(System.in);
	int i=sc.nextInt();
	int a[]= {1,2,3,4};
	try
	{
	System.out.println(a[i]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Exception is their please Continue");
		Exception e1=new Exception();
	}
	finally
	{
		System.out.println("Finnally Bloack Must Continue");
	}
	
	obj.add(x);
	System.out.println("Executed");
	}
		
}
