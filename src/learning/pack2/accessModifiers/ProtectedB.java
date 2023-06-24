package learning.pack2.accessModifiers;

import learning.pack1.accessModifiers.ProtectedA;


public class ProtectedB extends ProtectedA {
	

	public static void main(String[] args) {

		ProtectedB b = new ProtectedB();
		b.x = 10;
		b.protectTest();
	}

}
