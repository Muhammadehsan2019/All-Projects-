package WorkingWithInheretanceSuperKeyword;

public class Prac2InheretanceChildSuperKeyword extends Prac1InheretanceParentClassSuperK {

	String name = "Ehsan Child";
	
	///******SUPER KEYWORD****************
	//TThe super keyword refers to superclass (parent) objects.

//It is used to call superclass methods, and to access the superclass constructor.

//The most common use of the super keyword is to eliminate the confusion between superclasses and subclasses that have methods with the same name.

	
	
	public Prac2InheretanceChildSuperKeyword()
	{
		//super();//this should always be at first line
		System.out.println("Child Class Constructor");
	}
	
	
	public void getStringData()
	{
		System.out.println(name);
		//calling parent class variable using super keyword
		System.out.println(super.name);
	}
	
	public void getData()
	{
		super.getData();//call the getData method  from Parent class using super keyword 
		
		System.out.println("I am in the child class ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Prac2InheretanceChildSuperKeyword obj = new Prac2InheretanceChildSuperKeyword();
		obj.getStringData();
		obj.getData();//it will only call a method from the child class, but if we don't have this getData method in child class then it will call getData method from a parent class

	}

}
