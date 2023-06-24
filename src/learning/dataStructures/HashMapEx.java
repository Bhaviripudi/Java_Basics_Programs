package learning.dataStructures;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(100, "learn");
		hm.put(101, "try");
		hm.put(103, "best");
		
		System.out.println(hm);
		
		for(Map.Entry m : hm.entrySet()) {
			
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		hm.remove(103);
		System.out.println(hm);

	}

}
