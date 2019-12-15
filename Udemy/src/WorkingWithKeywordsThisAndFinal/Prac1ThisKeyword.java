package WorkingWithKeywordsThisAndFinal;

public class Prac1ThisKeyword {

	int a =2;
	public void getData()
	{
		int a=3;
		int b=a+this.a;
		System.out.println(b);
		System.out.println(a);
		System.out.println(this.a);//using global variable with the help of this keyword
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		Prac1ThisKeyword obj = new Prac1ThisKeyword();
		
		obj.getData();
		//this refers to current object-object scope lies in class level

	}

}
