package learning.basics;

public class Operators {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 30;

		// Relational operators always return boolean value

		System.out.println(a < b);
		System.out.println(a > b);
		System.out.println(a <= b);
		System.out.println(a >= b);
		System.out.println(a == b);
		System.out.println(a != b);

		// Logical operators returns boolean values

		System.out.println("Logical " + (a != b && c > b));
		System.out.println(a == b && c != b);
		System.out.println(a == b || c > b);
		System.out.println(a == b || c < b);
		System.out.println(!(a < b));

		// Increment/Decrement
		int d;
		d = c++;
		System.out.println(++d + " " + c--);
		System.out.println(c);

		// Conditional Statements
		//if - else
		int age = 15;
		if (age >= 18) {
			System.out.println("eligible");
		} else {
			System.out.println("Not eligible");
		}
		//Nested if - else
		int day = 0;
		if(day==1) {
			System.out.println("Sunday");
		}else if(day==2) {
			System.out.println("Monday");
		}else if(day==3) {
			System.out.println("Tuesday");
		}
		else {
			System.out.println("Nothing");
		}
		//Switch case to reduce the code
		int workday = 1;
		switch(workday) {
		case 4 : System.out.println("Thursday");break;
		case 5 : System.out.println("Friday");break;
		default : System.out.println("Saturday");
		}
	}

}
