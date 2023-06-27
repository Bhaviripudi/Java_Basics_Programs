package learning.oops;

public class MethodOverloading {

	
	
	void sum() {   //First
		int a = 10;
		int b = 20;
		System.out.println(a+b);
	}
	void sum(int x, int y) {  //second
		System.out.println(x-y);
	}
	void sum(int x, int y, int z) {  //third
		System.out.println(x+y+z);
	}
	void sum(int x, double y){  //fourth
		System.out.println(x*y);
	}
	public static void main(String[] args) {
		
		MethodOverloading mo = new MethodOverloading();
		mo.sum(); //First
		mo.sum(30, 20);  //Second
		mo.sum(10, 20, 30);  //Third
		mo.sum(5, 3.0);  //Fourth

	}

}
