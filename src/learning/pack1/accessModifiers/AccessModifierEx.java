package learning.pack1.accessModifiers;

//Private
class A {
	private int a = 10;

	private void m1() {
		System.out.println(a);
	}
}


public class AccessModifierEx{

	public static void main(String[] args) {

		A aobj = new A();
		 //aobj.a = 20; //cannot access since it is private
		// aobj.m1(); //cannot access since it is private

	}

}
