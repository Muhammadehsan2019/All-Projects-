package WorkingWithAccessModifiers;

import net.bytebuddy.implementation.bytecode.Multiplication;

public class Prac1AccessModifiers {
public static int sum;
public int result;
private static int results;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		addition(10, 15);
		System.out.println(sum);
		
		Division(100000, 500);		
		

	}
	
	/* there are 4 types of access modifiers
	 public, private, protected, default
	
	 
	 
	 public: variable/method as public : then it will be accessed from anywhere in any class and any package
	 private:you can't access a method or variable outsid the class
	 protected:variable/method as protected: it can be assessed in all the classes in the package and also outside the package by inhereting and using in sub classes 
	 default: access method anywhere in package not outside the package
	*/
	
	
	
	
	
	
	public static int addition(int a, int b) {
		
		 sum = a+b;
		System.out.println("+++++++++++The sum is "+sum);
		return sum;
		
	}
	
	//public access modifier is available everywhere
	public int multiplication(int num1, int num2)
	{
		
		result= num1*num2;
	System.out.println("*********the result for multiplicaion is: "+result);
		return result;
		
		
	}
	
	
	//it is not accessible in other packages and classes

	private static int Division(int val1, int val2)
	{
		
		results= val1/val2;
	System.out.println("////////////the result for division is: "+results);
		return results;
		
		
	}
	//protected:variable/method as protected: it can be assessed in sub classes 
	
	protected void protectedMethod()
	{
		
		System.out.println("I am Protected method ");
		
	}
}
