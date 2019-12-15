package WorkingWithHashmapsAndHashTables;


import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Prac2HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Difference Between Hashmaps and HashTables:
		 * Hashmap vs Hashtable
1. HashMap is non synchronized. It is not-thread safe and can’t be shared between many threads without proper synchronization code whereas Hashtable is synchronized. 
It is thread-safe and can be shared with many threads.
2. HashMap allows one null key and multiple null values whereas Hashtable doesn’t allow any null key or value.
3. HashMap is generally preferred over HashTable if thread synchronization is not needed

Why HashTable doesn’t allow null and HashMap does?
To successfully store and retrieve objects from a HashTable, the objects used as keys must implement the hashCode method and the equals method.
 Since null is not an object, it can’t implement these methods. HashMap is an advanced version and improvement on the Hashtable. HashMap was created later.
		 */
		
				Hashtable<Integer,String>hm = new Hashtable<Integer,String>();
				
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
