package arrays;

import java.util.Scanner;

public class constructorstring 
{
	public static void main(String[] args)
	{
		//char a[]= {'A','b','c','d'};
		Scanner sc=new Scanner(System.in);
		String s= sc.next();
		int len=s.length();
		for(int i=0;i<len;i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9' )
			{
				System.out.println("Type=Integer At Position = "+i + "Value= "+s.charAt(i));
			}
			else if((s.charAt(i)>='A' && s.charAt(i)<='Z' ))
			{
				System.out.println("Type=Char At"+i + "Value= "+s.charAt(i));
			}
			else 
			{
				System.out.println("Type=Special char At"+i + "Value= "+s.charAt(i));
			}
		}
		
		/* String t= ("abcd");
		System.out.print(s);
		System.out.println(t);
		String res= s+t;
		System.out.println(res);
		
		/*System.out.println(s.concat(t));
				if(s.equalsIgnoreCase(t))
		{
			System.out.println("True");
		}
		else
		
				System.out.println("False");
		*/
	}
	
}
