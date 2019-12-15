package WorkinWithInheretance;

public class Prac1InheretanceChild extends Prac2InheretanceParent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prac1InheretanceChild obj = new Prac1InheretanceChild();
		obj.myFamilyCountry();
		obj.cityOfMyFamily();
		System.out.println(obj.k);
		obj.childActivities();
	
	}

	public void childActivities()
	{
		System.out.println("i am child Activity Method Child Class");
	}
	
	
	
	
}
