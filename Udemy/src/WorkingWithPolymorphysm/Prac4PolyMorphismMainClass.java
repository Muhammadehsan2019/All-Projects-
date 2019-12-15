package WorkingWithPolymorphysm;

public class Prac4PolyMorphismMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Polymorphism is the ability of an object to take on many forms. The most
		 * common use of polymorphism in OOP occurs when a parent class reference is
		 * used to refer to a child class object.
		 * 
		 * Any Java object that can pass more than one IS-A test is considered to be
		 * polymorphic. In Java, all Java objects are polymorphic since any object will
		 * pass the IS-A test for their own type and for the class Object.
		 */
		
		
		
		
		
		//IF YOU NEED ONE METHOD THEM YOU USE THE POLYMORPISM, IT WILL ACCESS ONLY ONE METHOD BY PROVIDING THE REFERENCE TO THE METHOD CLASS, AND CONTINUE WITH NEW KEYWORKD AND MAIN CLASS.
		Prac1PolyMorphysmAnimal  myAnimal = new Prac1PolyMorphysmAnimal ();//create an Animal object
		Prac1PolyMorphysmAnimal myCat = new Prac2PolyMorphysmCat(); //craeting Prac2..Cat object
		Prac1PolyMorphysmAnimal myDog = new Prac3PolymorphismDog();//craeting Prac3..Dog object
		myAnimal.animalSound();
		myCat.animalSound();
		myDog.animalSound();
	}

}
