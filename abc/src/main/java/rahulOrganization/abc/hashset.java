package rahulOrganization.abc;

import java.util.HashSet;
import java.util.Iterator;

public class hashset 
{
	//@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	
	{
		
	
		HashSet hs=new HashSet();
		hs.add(12);
		hs.add(11);
		hs.add(13);
		hs.add(9);
		Iterator i=hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		boolean abc=hs.contains(12);
		System.out.println(abc);
	System.out.println("hello");
	}
	
}
