package Inheritance;

import java.util.HashSet;
import java.util.Iterator;

public class hashset 
{
	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();
		hs.add(12);
		hs.add(11);
		hs.add(13);
		Iterator i=hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
}
