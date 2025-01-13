package SetInterface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetClass {

	public static void main(String[] args) {
		HashSet<String> set=new LinkedHashSet<String>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		System.out.println("Printing using Iterator:");
		Iterator<String>itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Printing using forEach loop:");
		set.forEach(a->{
			System.out.println(a);
		});
		System.out.println(set.remove("One"));
	}

}
