package ListInterface;

import java.util.Iterator;
import java.util.LinkedList;

public class LL2 {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.addFirst("a");
		list.addFirst("is");
		System.out.println(list);
		
		list.addFirst("This");
		System.out.println(list);
		list.add("list");
		System.out.println(list);
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			if(list.get(i)=="This") {
				System.out.println("Is Present:"+list.get(i));
				System.out.println();
			}
			System.out.print(list.get(i)+"->");
		}
		System.out.println("Null");
		System.out.println("At 0th position:"+list.get(0));
		list.forEach(a->{
			
			System.out.print(a+"->");
		});
		System.out.println("Null");
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+"->");
		}
		System.out.println("Null");
		
		list.removeFirst();
		list.forEach(a->{
			System.out.print(a+"->");
		});
		System.out.println("Null");
		
		list.remove(2);
		list.forEach(a->{
			System.out.print(a+"->");
		});
		System.out.println("Null");
	}

}
