package rahulOrganization.abc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class arraylist 
{
	public static void main(String[] args)
	{
		arraylist obj=new arraylist();
		obj.add();
	}
	public void add()
	{
		ArrayList a=new ArrayList();
		a.add(4);
		System.out.println(a.size());
		a.add(1,"element");
		a.add(12);
		a.add(20);
		a.add("rahul");
		System.out.println(a.get(1));
		Iterator ir=a.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		a.remove(2);
		Object ar[]=a.toArray();
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
			
	}
}
