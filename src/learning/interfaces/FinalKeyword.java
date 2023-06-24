package learning.interfaces;

final class Test{
	
	final int  a = 10;
	
	final void run() {
		 
		//a =20; // cannot assign a value becoz it is a final variable 
		System.out.println("Test final");
	}
}

//cannot extend a class and cannot override a method

/*class Test1 extends Test 
{
	void run() {
		System.out.println("Test final class");
	}
}*/


public class FinalKeyword {

	public static void main(String[] args) {
		
		Test tst = new Test();
		tst.run();

	}

}
