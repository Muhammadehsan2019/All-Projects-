package WorkingWithInterface;

public class Prac2DevelopingTheMethodsInTheInterfacePrac1 implements Prac1Interface {
// now this class is responsible to implement ALL methods of Banking Client in Prac1Interface

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prac2DevelopingTheMethodsInTheInterfacePrac1 obj = new Prac2DevelopingTheMethodsInTheInterfacePrac1();
		obj.payCreditCard();
		obj.transferBalance();
		obj.checkingBalance();
		obj.login();
		
		//run time polymorphism
		Prac1Interface obj2 = new Prac2DevelopingTheMethodsInTheInterfacePrac1 ();//we are creating a reference to the Prac1Interface Interface, so we only can get an access to the methods in that interface
		//we can't access any methods in the Prac2Developing...Interface. like Login is a method in this class but with obj2 we can't access it. So it is called run time polymorphism
		
	
	
	
	
	}

	@Override
	public void payCreditCard() {
		// TODO Auto-generated method stub
		System.out.println("Pay Credit implemented ");
	}

	@Override
	public void transferBalance() {
		// TODO Auto-generated method stub
		System.out.println("Transfer Balance  implemented ");
	}

	@Override
	public void checkingBalance() {
		// TODO Auto-generated method stub
		System.out.println("Checking Balance implemented ");
	}

	
	
	public void login()
	{
		System.out.println("I am the login method in Prac2Developing.. class ");
	}
}
