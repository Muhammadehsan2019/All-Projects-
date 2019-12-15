package WorkingWithConstractors;

public class Prac2TypesOfConstructors {

	
	public Prac2TypesOfConstructors()//default constructor
	{
		
		System.out.println("I am the constractor");
		System.out.println("I am in the constractor lecture");
		
	}
	
	public Prac2TypesOfConstructors(int a, int b)
	{
	System.out.println("Iam in the parameterized constructor");
	}
	
	
	public Prac2TypesOfConstructors(String str)
	{
	System.out.println(str);
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prac2TypesOfConstructors obj =new Prac2TypesOfConstructors();
		
		Prac2TypesOfConstructors obj1 =new Prac2TypesOfConstructors(4,5);
		
		Prac2TypesOfConstructors obj2 =new Prac2TypesOfConstructors("Hello");
		
	}

}
