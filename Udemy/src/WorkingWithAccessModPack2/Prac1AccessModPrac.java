package WorkingWithAccessModPack2;
import WorkingWithAccessModifiers.Prac1AccessModifiers;
public class Prac1AccessModPrac {
	//public class Prac1AccessModPrac extends Prac1AccessModifiers {//inheriting the other class for accessing the protected access modifier
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Prac1AccessModPrac d=new Prac1AccessModPrac();//make an obj for the class and accessing proetectedMethod
	//	d.protectedMethod();
		
		Prac1AccessModifiers obj = new Prac1AccessModifiers();
		obj.multiplication(10, 50);
		obj.addition(100, 500);
		
	
	}

}
