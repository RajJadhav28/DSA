package ListInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList3 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Ramesh");
		list.add("Suresh");
		list.add("Ajay");
		list.add("Vijay");
		list.add("Ajay");
		System.out.println("Traversing list through list Iterator:");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("Traversing list through for each method:");
		list.forEach(a->{
			System.out.println(a);
		});
		System.out.println("Traversing loop through remaining for each method:");
		Iterator<String> itr=list.iterator();
		itr.forEachRemaining(a->{
			System.out.println(a);
		});
	}

}
