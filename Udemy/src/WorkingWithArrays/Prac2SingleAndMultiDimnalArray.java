package WorkingWithArrays;

public class Prac2SingleAndMultiDimnalArray {

	public static void main(String[] args) {
		
		

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
//			
			
			//simple and preferest way to declare an array
		
		int b[] = {1,4,3,5,7,8};
		for (int j=0; j<b.length; j++)
		{
			System.out.println(b[j]);
		}
			
		///for Each loop for array, print only 7 from an array

		for(int v:b)
		{
			//System.out.println(v);
			if (v==7) {
				System.out.println(v);
				break;
			}
		}
			
		System.out.println("**********************--Multi Dimintional Array--***********************/////////////");
		
			////////////*********************---Multi Dimintional Array---***********************/////////////
			
			//important for interview 
		//what is multi dimentional array: 
	
		
		int array1[][]= new int [2][3];
		array1[0][0]=1;
		array1[0][1]=2;
		array1[0][2]=3;
		
		array1[1][0]=4;
		array1[1][1]=5;
		array1[1][2]=6;
		
		
			//System.out.println(array1[0][2] );
			//how to print all the rows and colums or print array1 
			
				for (int r=0;r<2;r++)//outer loop for ROW
				{
					for (int s=0; s<3; s++ )//inner loop COLUMN
					{
						System.out.println(array1[r][s]);
					}
				}
		//or declare as below
			
		int array2[][]= {{1,2,3},{24,5,6}};
		
		System.out.println(array2[1][0]);
		
		
		//how to print all the rows and colums or print array2 
		
		
		
	}

}
