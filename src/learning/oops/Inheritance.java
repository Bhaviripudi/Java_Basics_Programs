package learning.oops;

class A {

	int a;
	int b;

	public void display() {
		System.out.println(a + b);
	}
}
//Single level inheritance
class B extends A{
	int x;
	int y;

	public void show() {
		System.out.println(x * y);
	}
}
class C extends B{
	int p;
	public void print() {
		System.out.println(p);
	}
}

public class Inheritance {

	public static void main(String[] args) {

		/*A aobj = new A();
		aobj.a = 100;
		aobj.b = 200;
		aobj.display();*/

		B bobj = new B();
		bobj.x = 20;
		bobj.y = 30;
		bobj.show();
		//single level inheritance
		bobj.a = 15;
		bobj.b = 20;
		bobj.display();
		//multi level inheritance
		C objc = new C();
		objc.a = 5;
		objc.b = 2;
		objc.p = 143;
		objc.x = 23;
		objc.y = 32;
		objc.display();
		objc.show();
		objc.print();

	}

}
