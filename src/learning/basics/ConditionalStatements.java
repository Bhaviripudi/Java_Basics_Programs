package learning.basics;

public class ConditionalStatements {

	public static void main(String[] args) {

		// while loop
		// printing odd numbers
		int i = 9;
		System.out.println("while loop");
		while (i >= 1) {

			System.out.println(i);
			i = i - 2;

		}
		System.out.println("exit");

		// Do- while loop
		// printing even numbers
		int j = 20;
		System.out.println("do-while loop");
		do {
			System.out.println(j);
			j = j + 2;
		} while (j <= 10);
		System.out.println("exit");

		// for loop
		// printing even numbers in reverse order
		System.out.println("For loop");
		for (int k = 2; k >= 1; k = k - 2) {
			System.out.println(k);
		}
		System.out.println("exit");

		// for loop with break
		System.out.println("For loop with break");
		for (int l = 10; l >= 1; l = l - 2) {
			if (l == 4) {
				break;
			}
			System.out.println(l);
		}
		System.out.println("exit");

		// for loop with continue
		System.out.println("For loop with continue");
		for (int m = 1; m <= 5; m++) {
			if (m == 3) {
				continue;
			}
			System.out.println(m);
		}
		System.out.println("exit");

		// swapping of 2 numbers
		int a = 10;
		int b = 20;
		System.out.println("Values of a and b before swapping: " + a + " " + b);
		int c;
		c = a;// c= 10
		a = b;// a= 20
		b = c;// b= 10

		System.out.println("Values of a and b after swapping: " + a + " " + b);
		
		//finding number is a even or odd
		int x = 9;
		if(x%2==0) {
			System.out.println("even number");
		}else {
			System.out.println("odd number");
		}
		
		//Largest of 3 numbers
		int p= 100;
		int q = 40;
		int r = 30;
		
		if((p>q) && (p>r)) {
			System.out.println("p is largest "+p);
		}else if((q>p) && (q>r)) {
			System.out.println("q is largest "+q);
		}else
			System.out.println("r is the largest "+r);

	}

}
