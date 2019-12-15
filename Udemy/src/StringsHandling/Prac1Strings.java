package StringsHandling;

public class Prac1Strings {

	public static void main(String[] args) {

		//example how to validate the below statment
		
		//Paymetn $100 paid
		//2 ways defining a string class
		
		//find out what index the $ located
		String str = "Payment $100 paid";
		char findIndx = str.charAt(8);
		System.out.println(findIndx+" present in the index 8");
		//or 
		System.out.println(str.charAt(8)+" present in the indext 8");
//		String str1 = new String ("Payment $100 paid");
//		str1.charAt(9);
		
//		//what position the $ displays in multiple payments

		String str2 = "Payments $100 paid";
		//just print the index of doller sign $
		
		System.out.println("The $ present in the index "+str2.indexOf("$"));
		
		//print whatever is after index 8
		System.out.println(str2.substring(8));
		
		/*****************************INTERVIEW QUESTION???? how to reverse a string????****/
	}

}
