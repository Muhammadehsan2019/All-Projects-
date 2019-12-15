package WorkingWithArrayList;

import java.util.ArrayList;

public class Prac1ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Arraylist can accespt duplicate values
		
		//all these can accept duplicate values
		//Arraylist, LindedList, Vector, Implementing LIst Interface
		//you can access and insert any value in any index 
		
		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("Muhammad");
		arraylist.add("Muhammad");
		arraylist.add("Ehsan");
		arraylist.add(0, "Zuhoor");//ad Zuhoor to 0 index
		System.out.println(arraylist);
//		arraylist.remove(1);
//		arraylist.remove("Ehsan");//remove Ehsan
		
		System.out.println(arraylist);
		System.out.println(arraylist.get(2));
		
		System.out.println(arraylist.contains("Zuhoor"));
		boolean ispresent = arraylist.contains("zuhoor");//TRYING WITH SMALL z
		
		System.out.println(ispresent);
		System.out.println(arraylist.indexOf("Muhammad"));// find the index for Muhammad
		System.out.println(arraylist.isEmpty());//is arraylist empty? false 
		System.out.println(arraylist.size());
		
		
	}

}
