package rahulOrganization.abc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class hashmap 
{
	public static void main(String[] args)
	{
		//HashMap<String,String> map=new HashMap<String,String>();
		HashMap m=new HashMap();
		m.put(1, "value");
		m.put(2, "value1");
		m.put(3, "val");
		Set allkeys=m.keySet();
		Iterator i=allkeys.iterator();
		while(i.hasNext())
		{
			System.out.println(m.get(i.next()));
		}
	}
}
