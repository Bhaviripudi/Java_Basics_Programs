package learning.dataStructures;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("Sagar");
		list.add("Sulu");
		list.add("Home");

		System.out.println(list.size()); // Returns no of elements in an arrayList
		System.out.println(list);

		for (String s : list) {
			System.out.println(s); // Reading elements from array list
		}
	}

}
