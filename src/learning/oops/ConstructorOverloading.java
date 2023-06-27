package learning.oops;

public class ConstructorOverloading {

	int a = 10;
	int b = 0;
	double c = 0;

	ConstructorOverloading() {// fifth

	}

	//we can use same variable names with this keyword
	ConstructorOverloading(int a, int b) { // first
		this.a = a;
		this.b = b;
	}

	ConstructorOverloading(int x, int y, double z) { // second
		a = x;
		b = y;
		c = z;
	}

	ConstructorOverloading(int x, double y, int z) {// third
		a = x;
		b = z;
		c = y;
	}

	ConstructorOverloading(int x, double y) {// fourth
		a = x;
		c = y;
	}

	void display() {
		System.out.println(a + " " + b + " " + c);
	}

	public static void main(String[] args) {

		ConstructorOverloading co = new ConstructorOverloading();// fifth
		ConstructorOverloading co1 = new ConstructorOverloading(2, 3);// first
		ConstructorOverloading co2 = new ConstructorOverloading(3, 3, 3.0);// second
		ConstructorOverloading co3 = new ConstructorOverloading(6, 9.0, 8);// third
		ConstructorOverloading co4 = new ConstructorOverloading(2, 3.0);// fourth
		co.display();
		co1.display();
		co2.display();
		co3.display();
		co4.display();
	}
	//we can also overload main method with different parameters
	public static void main() {
		
	}

}
