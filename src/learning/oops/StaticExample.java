package learning.oops;

public class StaticExample {

	int a;//non- static variable
	static int b; //static variable
	
	static void m1() {
		System.out.println("Static method");
	}
	void m2() {
		System.out.println(a);
		System.out.println("Non-static method");
	}
	void m3() {//non-static
		a = 300;
		b=500;
		m1();
		m2();
	}
	
	
	public static void main(String[] args) {//static

		b= 100; //can access directly , coz these are static stuff
		System.out.println(b);
		m1();
		
		//a= 200; //can not access, becoz these are non-static stuff
		//m2();
		
		//can access non-static methods and variables through object
		StaticExample se = new StaticExample(); 
		se.a = 200;
		se.m2();
	}

}
