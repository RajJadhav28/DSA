package MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		
		//Insertion
		map.put("India", 120);
		map.put("USA", 60);
		map.put("China", 119);
		System.out.println(map);
		map.put("China", 121);
		System.out.println(map);
		
		//Search
		if(map.containsKey("Indionesia")) {
			System.out.println("Present in the map");
		}else {
			System.out.println("Not present.");
		}
		
		System.out.println(map.get("China"));
		System.out.println(map.get("Indonesia"));
		
		int arr[]= {12,15,18};
		for(int val:arr) {
			System.out.print(val+" ");
		}
		System.out.println();
		System.out.println("First Method to display elements using for loop in Map:");
		System.out.println("Using key and value:");
		for(Map.Entry<String, Integer> e:map.entrySet()) {
			System.out.println(e.getKey()+":"+e.getValue());
		}
		System.out.println("Second Method to display elements using for loop in Map:");
		Set<String> keys=map.keySet();
		for(String key:keys) {
			System.out.println(key+" "+map.get(key));
		}
		map.remove("China");
		System.out.println(map);

	}

}
