package TreeMap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		TreeMap<Integer, String> map=new TreeMap<>();
		map.put(1, "Raj");
		map.put(2, "Jay");
		map.put(3, "Vijay");
		map.put(4, "Ajay");
		for(Map.Entry<Integer, String>m:map.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}
		map.remove(3);
		System.out.println("After removing element:");
		for(Map.Entry<Integer, String> m:map.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}
		
		NavigableMap<Integer, String>map1=new TreeMap<>();
		map1.put(4, "Ramesh");
		map1.put(2, "Suresh");
		map1.put(1, "Hrutuja");
		map1.put(3, "Rutuja");
		System.out.println("Always returns in ascending order:");
		System.out.println("Ascending order:"+map1);
		for(Map.Entry<Integer, String>m:map1.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}
		map1.forEach((Key,Value)->{
			System.out.println(Key+":"+Value);
		});
		System.out.println("Head Map:"+map1.headMap(2,true));
		System.out.println("Tail Map:"+map1.tailMap(2,true));
		System.out.println("SubMap:"+map1.subMap(2, false,4,true));	
		System.out.println("head Map:"+map1.headMap(2));
		System.out.println("tailMap:"+map1.tailMap(2));
		System.out.println("Sub Map:"+map1.subMap(1, 2));
		
	}
	
}
