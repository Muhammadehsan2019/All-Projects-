package WorkingWithHashSets;

import java.util.HashSet;
import java.util.Iterator;

public class Prac1HashSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		//Hashsets treeset, LinkedHashset, implemnents Set Interface
		
		//does not accept duplicate values
		//There is no guarantee elements stored in sequencial order. Randome order
	
	HashSet<String> hs = new HashSet<String>();
	
	hs.add("USA");
	hs.add("UK");
	hs.add("AFG");
	hs.add("UK");
	hs.add("Dubai");
	hs.add("Shot");
	
	System.out.println(hs);
	
	//System.out.println(hs.remove("UK"));
	
	
	System.out.println(hs.isEmpty());
	System.out.println(hs.size());
	System.out.println(hs.contains("USA"));
	
	//Iterator-is the interface
	
	Iterator <String> it=hs.iterator();
	while (it.hasNext())
	{
		
	
	System.out.println(it.next());
	}
	
	
	}

}
