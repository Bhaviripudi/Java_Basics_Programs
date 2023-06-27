package learning.basics;

public class StringMethods {

	public static void main(String[] args) {
		
       //Length of the string		
		String s = "Sulochana";
		System.out.println(s.length());
		
	   //Concatenation ways ---> Joining any strings
		String s1 = "Welcome to ";
		String s2 = "Testing";
		System.out.println(s1.concat(s2));
		System.out.println("Welcome to ".concat("Testing"));
		System.out.println(s1+s2);
		
		//Equals and EqualsIgnore case --> Compares the 2 strings are equal or not
		String s3 = "sagar";
		String s4 = "SaGAR";
		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));
		
		//Convert a string to upper to lower and  lower to upper
		System.out.println(s3.toUpperCase());
		System.out.println(s4.toLowerCase());
		
		//contains --> checks contains given sequential characters or not
		System.out.println(s1.contains("welcome"));//false
		
		//StratsWith and EndsWith
		String s5 = "Ready to test application";
		System.out.println(s5.startsWith("Ready"));
		System.out.println(s5.endsWith("tion"));
		
		//SubString --> Starting index will always starts from 0 and Ending index starts from 1.
		System.out.println("substring");
		System.out.println(s.subSequence(0, 3));// 0 - starting index, 3 - ending index
		System.out.println(s.subSequence(4, 8));
		
		//Replace --> replace old characters to new 
		System.out.println(s.replace("a", "e"));
		
		//Trim ---> It will remove blank spaces either in left or right side
		String s6 = "Sulochana Sagar   ";
		System.out.println(s6.trim());
	}

}
