package WorkingWithArrays;

public class Prac4SumOfNumsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array: array is a collection of objects

		//Question1, please find the sum of these numbers 2,5,8,7,4
		int sum =0;
		int c[]= {2,5,8,7,4};//2,5,8,7,4-->collection of objects present in array
		
		//i need the sum of these numbers 2,5,8,7,4
		
		for (int i=0; i<c.length; i++)
		{
			
			//System.out.println(c[i]);
			sum=sum+c[i];
			//sum=2+5+8+7+4
			
		}
		
		System.out.println(sum);
		
		
		
		
		
		
	}

}
