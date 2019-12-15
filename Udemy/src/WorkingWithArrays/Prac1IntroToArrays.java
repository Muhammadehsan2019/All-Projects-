package WorkingWithArrays;

public class Prac1IntroToArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//What is an Array? A container with stores multiple values of same data type
		
		
		int a []=new int [5];//new keyword allocates the space for the a array
		
		a[0]=2;
		a[1]=6;
		a[2]=5;
		a[3]=1;
		a[4]=3;
	
		for (int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);//retrieve values present in this array
		}
}
}