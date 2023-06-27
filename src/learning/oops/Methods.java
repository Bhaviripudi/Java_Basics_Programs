package learning.oops;

public class Methods {

	int a;
	int b;
	
	//method with empty parameters
	//method returns nothing
	void withoutParam() {
		System.out.println(a+b);
	}
	
	//method with parameters
	void withParam(int x, int y) {
		System.out.println(x-y);
	}
	
	//method returns some value
	int methodReturns() {
		int c= a*b;
		System.out.println(c);
		return(c);
		
	}
	
	public static void main(String[] args) {
		
		Methods meth = new Methods();
		meth.a = 20;
		meth.b = 30;
		meth.withoutParam();//without parameters
		meth.withParam(90, 30);//with parameters
		meth.methodReturns();// method returns some value

	}

}
