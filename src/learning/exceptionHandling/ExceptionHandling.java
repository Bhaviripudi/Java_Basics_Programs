package learning.exceptionHandling;

public class ExceptionHandling {
	
	//using throws
	void m1() throws InterruptedException 
	{
		Thread.sleep(2000);
	}

	public static void main(String[] args) {

		System.out.println("Started");
		try {
		Thread.sleep(200);//InterruptedException(checked exception)
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		int i =10;
		try {
		System.out.println(i/0); //Arithematic Exception(unchecked)
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		String str = null;
		try {
		System.out.println(str.length());//NullPointerException(unchecked)
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		String s = "abcde";
		try {
		int a = Integer.parseInt(s);
		System.out.println(a);//NumberFormatException(unchecked)
		}catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		
		
		//finally
		
		int arr[] = new int[5];
		try {
		arr[10] = 100; //ArrayIndexOutOfBoundsException(unchecked)
		}
		catch(ArithmeticException e) {        //checking with fake exception
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("check with finally");
		}
		//System.out.println(arr[10]);
		System.out.println("Ended");
	}

}
