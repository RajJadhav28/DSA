package SetInterface;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetClass3 {
	public static void main(String[] args) {
		TreeSet<String> al=new TreeSet<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		System.out.println("Using forEach loop:");
		al.forEach(a->{
			System.out.println(a);
		});
		System.out.println("===================");
		System.out.println("Using Iterator");
		Iterator<String>itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("===============");
		System.out.println("Using descending Iterator:");
		Iterator<String>itr1=al.descendingIterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		 TreeSet<Integer> set1=new TreeSet<Integer>();    
	        set1.add(24);    
	        set1.add(66);    
	        set1.add(12);    
	        set1.add(15);
	        System.out.println("Reverse set:"+set1.descendingSet());
	        System.out.println("Head set:"+set1.headSet(24,true));
	        System.out.println("Tail set:"+set1.tailSet(15,true));
	        System.out.println("SubSet:"+set1.subSet(12, false,66,true));
	        System.out.println("SubSet:"+set1.subSet(12, true,66, false));
	        System.out.println("SubSet:"+set1.tailSet(15, false));
	        
	        TreeSet<String> set2=new TreeSet<String>();  
	        set2.add("A");  
	        set2.add("B");  
	        set2.add("C");  
	        set2.add("D");  
	        set2.add("E");
	        System.out.println(set2);
	        System.out.println(set2.headSet("C"));
	        System.out.println(set2.tailSet("C"));
	        System.out.println(set2.subSet("A", "E"));
	}
}
