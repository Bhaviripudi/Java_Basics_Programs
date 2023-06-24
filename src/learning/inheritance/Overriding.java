package learning.inheritance;

class Bank {

	int getRateOfInterest() {

		return 1;
	}
}

class SBI extends Bank {

	int getRateOfInterest() { // overriden

		return 10;
	}
}

class HDFC extends Bank {

	int getRateOfInterest() {// overriden

		return 20;
	}
}

///////////////////////////
class Vehicle {

	int a;

	void run1() {
		System.out.println("vehicle");
	}
}

class Bike extends Vehicle {

	void run() {
		System.out.println("Bike " + a);
	}
}

public class Overriding {
	
	
	public static void main(String[] args) {

		SBI objsbi = new SBI();
		System.out.println(objsbi.getRateOfInterest());

		HDFC objhdfc = new HDFC();
		System.out.println(objhdfc.getRateOfInterest());

		Vehicle vh = new Vehicle();
		vh.run1();

		Bike bk = new Bike();
		vh.a = 10;
		bk.run1();

	}

}
