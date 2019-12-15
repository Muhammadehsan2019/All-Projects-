package WorkingWithConstractors;

public class Prac1ConstractorsBasic {
	public Prac1ConstractorsBasic()
	{
		
		System.out.println("I am the constractor");
		
	}
	
	public void getData()
	{
		System.out.println("I am the method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//block of code whenever an obj is created, or invoked whenever the obj is created
	
		//constractor is wreten as a method, but the difference with method is that constractor does not return any value
		
		//and name of the constractors should always be class name
		//whenever we create an obj the constractor is called 
	
		Prac1ConstractorsBasic cd=new Prac1ConstractorsBasic();
	// compiler will call implicit constructor if the constructor is not defined 
		
		
	
	
	
	}

}
