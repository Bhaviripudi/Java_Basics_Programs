package learning.interfaces;

interface Testinter {

	int a = 10; // by default variable is static and final

	void m1(); // cannot specify a body becoz method is abstract by default

}

public class InterfaceEx implements Testinter {

	public void m1() { // we should specify public access modifier otherwise it will take it as default

		System.out.println(a);

	}

	public static void main(String[] args) {
		
		Testinter tst = new InterfaceEx();
		tst.m1();

	}

}
