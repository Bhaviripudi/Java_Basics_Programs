package learning.inheritance;

interface A {
	int a = 10;

	void display();
}

interface B {
	int b = 20;

	void show();
}

public class MultInheritance implements A, B {

	public void show() {

		System.out.println(a);
	}

	public void display() {

		System.out.println(b);
	}

	public static void main(String[] args) {

		MultInheritance multi = new MultInheritance();
		multi.display();
		multi.show();

	}

}
