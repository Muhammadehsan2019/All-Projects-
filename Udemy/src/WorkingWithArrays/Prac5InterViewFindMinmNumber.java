package WorkingWithArrays;

public class Prac5InterViewFindMinmNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//==========================INTERVIEW QUESTION==========================
				//find the minimum number from the below matrix 
		/*
		 * 2 4 5
		 * 6 7 8
		 * 9 1 5
		 */
	
		int abc[][]= {{10,4,5},{6,7,8},{9,1,5}};	
		
		int min =abc[2][0];
		int mincolumn = 0;//finding the min colum
		System.out.println(min);
		for (int i=0; i<3; i++)
		{
			for (int j=0; j<3; j++)
			{
				if (abc[i][j]<min)
				{
					min=abc[i][j];
					mincolumn=j;
					System.out.println("The min colum is " +mincolumn);
				}
			}
		}
		System.out.println("And the max value is as below----------------------");
		int maxn=abc[0][mincolumn];//1st way finding the max value of colum j(1)
		int m=0;
		while(m<3)
		{
			if (abc[m][mincolumn]>maxn)
			{
				maxn=abc[m][mincolumn];
		
			}
			m++;
		}
		
		System.out.println(min);
		
		System.out.println("the maxn is"+maxn );
		
		//assinment: find the max number of the array
		
	
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Find MAX Number of the array");
int ab[][]= {{10,4,5},{6,7,8},{9,1,5}};	
		
		int max =ab[2][1];
		System.out.println(max);
		for (int k=0; k<3; k++)
		{
			for (int l=0; l<3; l++)
			{
				if (ab[k][l]>max )
				{
					max =ab[k][l];
				}
			}
		}
	
		System.out.println(max);
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
