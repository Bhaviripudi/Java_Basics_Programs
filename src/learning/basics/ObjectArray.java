package learning.basics;

public class ObjectArray {

	public static void main(String[] args) {

		//Single dimensional array
		
		/*Object a[] = new Object[5];
		a[0] = 10;
		a[1] = "Sulu";
		a[2] = 'B';
		a[3] = 20.01;
		a[4] = true;*/  
		//(or)
		Object a[] = {10,"sulu",'A',20.08,true};
		
		//Two dimensional array
		
		//Object b[][] = new Object[2][2];
		
		/*b[0][0] = "Sagar";
		b[0][1] = 15;
		
		b[1][0] = true;
		b[1][1] = 0.23f;*/
		
		//OR
		Object b[][] = {{"Sagar",15,'A'},{true,0.23f,90.01}};

		//Single
		for (Object o : a) {
			System.out.println(o);
		}
		//Two 
		for(Object c[] : b) {
			for(Object d : c) {
				System.out.print(d + " ");
			}
			System.out.println();
			
		}
	}

}
