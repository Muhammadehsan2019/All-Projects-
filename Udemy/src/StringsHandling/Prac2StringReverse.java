package StringsHandling;



public class Prac2StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
String myname = "Ehsan";
String t = "";
		
	for (int i=myname.length()-1; i>=0; i--)
	{
		
		//System.out.println(myname.charAt(i));
		//or
		//on one line
		//System.out.print(myname.charAt(i));
		//or 
		
		t= t+myname.charAt(i);

	}
		
	System.out.println(t);
		
	//check if it is palindrome
	if (myname==t)
	{
		System.out.println("yest is is palindrome");
	}else {
		System.out.println("no it is not palindrome");
	}
		
		
		
		
		
		
		
	}

}
