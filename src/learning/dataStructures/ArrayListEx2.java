package learning.dataStructures;

import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		System.out.println(list.size());

		list.add("Automation");
		list.add(20);
		list.add(89.98);
		list.add('C');

		System.out.println("after adding elements "+list.size());
		System.out.println(list);
        //inserting elements into array list
		list.add(2, "training"); //2 represent after no of elements not position
		System.out.println("after inserting element " + list);
		list.add(4, 900);
		System.out.println(list);
		list.remove("Automation"); //removing directly with value
		System.out.println("after removing "+list);
		list.remove(2);//It will remove an element after 2 elements
		System.out.println(list);
	}

}
