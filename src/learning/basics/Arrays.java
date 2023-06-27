package learning.basics;

public class Arrays {

	public static void main(String[] args) {
		
		// Single dimensional array
		int a[] = new int[3]; // declaration of array with 3 elements
		String s[] = new String[3];

		int x[] = { 10, 20, 30, 40 };// we can also declare array and store elements like this
		// store elements into single dimensional array
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;

		s[0] = "sulu";
		s[1] = "sagar";
		s[2] = "anjali";

		// reading elements from array with for loop
		/*
		 * for (int i = 0; i <= 2; i++) { System.out.println(a[i]); // 10 20 30.... }
		 */
		// for each loop
		for (int i : a) {
			System.out.println(i);
		}

		System.out.println("array length " + s.length);
		for (String b : s) {
			System.out.println(b);
		}
		// sum of the elements
		int sum = 0;
		for (int y : x) {
			System.out.println("elements of x " + y);
			sum = sum + y;
		}
		System.out.println(sum);

		// Two dimensional arrays

		int p[][] = new int[3][2];// declaration
		
		p[0][0] = 10;
		p[0][1] = 15;
		
		p[1][0] = 20;
		p[1][1] = 25;
		
		p[2][0] = 30;
		p[2][1] = 32;
		
		//classic for loop
		for(int c=0;c<=2;c++ ) { // incrementing rows
			
			for(int d=0;d<=1;d++) { //incrementing columns......until and unless exits inner loop it wont go for outer loop.
				
				System.out.print(p[c][d] + " ");
			}
			System.out.println();
		}
		
		//for each loop
		for(int q[] : p) {
			for(int r : q) {
			System.out.print(r +  " ");
			}
			System.out.println();
		}
		

	}

}
