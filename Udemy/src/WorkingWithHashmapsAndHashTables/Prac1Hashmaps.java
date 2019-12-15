package WorkingWithHashmapsAndHashTables;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Prac1Hashmaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//hashmaps are taking values as a key
		
		HashMap<Integer,String>hm = new HashMap<Integer,String>();
		
		hm.put(0, "Hello!");

		hm.put(1, "How");

		hm.put(2, "are");

		hm.put(3, "you");

		
		//System.out.println(hm);
		
		//System.out.println(hm.get(2));
		hm.remove(0);
		//System.out.println(hm);
		
		//Interview Question: passing some ke and val, exctract me those keys and values to set collections
		//creat a hashtable and pass the table to the set collection and print the key and value separately using the iterator 
		//hashtable -pass table set collections
		Set sn=hm.entrySet();//converting the hashmaps to Set
		
		Iterator it = sn.iterator();
		
		
		while (it.hasNext())
		{
			Map.Entry mp=(Map.Entry)it.next();//
			System.out.println(mp);
			
			System.out.println("The Key is: "+mp.getKey());
			System.out.println("The Value is: "+mp.getValue());
		}
		
		
		
		
	}

}
