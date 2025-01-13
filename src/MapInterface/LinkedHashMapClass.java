package MapInterface;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapClass {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> hm=new LinkedHashMap<Integer, String>();
		hm.put(100,"Amit");
		hm.put(101, "Vijay");
		hm.put(102, "Rahul");
		
		for(Map.Entry<Integer, String> m:hm.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}
		
		System.out.println("Keys:"+hm.keySet());
		System.out.println("Values:"+hm.values());
		System.out.println("Key-value pair:"+hm.entrySet());
		hm.remove(102);
		System.out.println(hm.entrySet());
		System.out.println(hm);
	}

}
