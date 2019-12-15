package WorkingWithArrays;

public class Prac3FindingIndxNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**********INTERVIEW QUESTION??? How to find the index number in the Array??*********/
		
		int sum =0;
		int c[]= {2,5,8,7,4};//2,5,8,7,4-->collection of objects present in array
		
		//find out the index for 7 
		
		for (int i=0; i<c.length; i++)
		{
			
		if (c[i]==7)
		{
			System.out.println(i);//how to stop the loop--break--
			break;//as soon as the index is found it will come out of the loop
		}
		}
		
		
		
	}

}
