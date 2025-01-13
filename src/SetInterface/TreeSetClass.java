package SetInterface;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {
		TreeSet<String> al=new TreeSet<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		System.out.println("Ascending Order:");
		Iterator<String>itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Descending order:");
		Iterator i=al.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("Lowest value:"+al.pollFirst());
		System.out.println("Highest Value:"+al.pollLast());
		System.out.println("Head set:"+al.headSet("Ravi",true));
		System.out.println("SubSet:"+al.subSet("Ajay",false, "Vijay",true));
		System.out.println("TailSet:"+al.tailSet("Ajay",false));
		

	}

}
